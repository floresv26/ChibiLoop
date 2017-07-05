package com.floresvanessa.chibiloop;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "EmailPassword";

    public static final String USER_EMAIL = "User Email";

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    // UI
    private EditText mEmailEditText;
    private EditText mPasswordEditText;
    private TextView mUserInfoTextView;
    private Button mSignInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize the FirebaseAuth instance and the AuthStateListener
        // methods so you can track whenever the user signs in or out.
        mAuth = FirebaseAuth.getInstance();
        /*mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    // User is signed out
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                }
            }
        };*/

        // Views
        mEmailEditText = (EditText) findViewById(R.id.enter_email);
        mPasswordEditText = (EditText) findViewById(R.id.enter_password);
        mUserInfoTextView = (TextView) findViewById(R.id.user_info);

        // Buttons
        findViewById(R.id.sign_in_button).setOnClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();

        // Attach the listener to your FirebaseAuth instance
        //mAuth.addAuthStateListener(mAuthListener);

        // Check if a user is signed in and update the UI
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    @Override
    public void onStop() {
        super.onStop();

        // Remove the listener to your FirebaseAuth instance
//        if (mAuthListener != null) {
//            mAuth.removeAuthStateListener(mAuthListener);
//        }
    }

    /**
     * Method that updates the UI if a user is signed in
     * @param user
     */
    private void updateUI(FirebaseUser user) {
        if (user != null) {
            mUserInfoTextView.setText(getString(R.string.emailpassword_status_fmt,
                    user.getEmail(), user.isEmailVerified()));
            // Send user to the Feed Screen
            Intent intent = new Intent(this, MainActivity.class);
            String userEmail = user.getEmail().toString();
            intent.putExtra(USER_EMAIL, userEmail);
            startActivity(intent);
        } else {
            mUserInfoTextView.setText("No user");
        }
    }

    /**
     * Method to validate the user input in the form
     * @return
     */
    private boolean validateForm() {
        boolean valid = true;

        // Validate that the Email EditText field is not null and throw an
        // error to the user if it is
        String email = mEmailEditText.getText().toString();
        if (TextUtils.isEmpty(email)) {
            mEmailEditText.setError("Required.");
            valid = false;
        } else  {
            mEmailEditText.setError(null);
        }

        String password = mPasswordEditText.getText().toString();
        if (TextUtils.isEmpty(password)) {
            mPasswordEditText.setError("Required.");
            valid = false;
        } else {
            mPasswordEditText.setError(null);
        }

        return valid;
    }

    private void createAccount(String email, String password) {
        Log.d(TAG, "createAccount: " + email);
        if (!validateForm()) {
            return;
        }

        // Start create_user_with_email
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail: success");
                    FirebaseUser user = mAuth.getCurrentUser();
                    updateUI(user);
                } else {
                    // If sign in fails, display a message to the user
                    Log.w(TAG, "createUserWithEmail: failure", task.getException());
                    Toast.makeText(LoginActivity.this, "Authentication failed.",
                            Toast.LENGTH_SHORT).show();
                    updateUI(null);
                }

            }
        });
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.sign_in_button) {
            createAccount(mEmailEditText.getText().toString(), mPasswordEditText.getText().toString());
        }
    }

}
