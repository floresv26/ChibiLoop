package com.floresvanessa.chibiloop.objects;

/**
 * Created by vanessaflores on 7/5/17.
 */

public class User {

    private String mUserId;
    private String mEmail;
    private String mUsername;
    private String mPassword;
    private String mFirstName;
    private String mLastName;
    private String mBirthday;
    private String mProfilePhoto;
    private String mPhone;


    /***** Constructors *****/

    /**
     *  Default no arg constructor
     */
    public User() {
    }

    /**
     * Full arg constructor
     * @param mUserId
     * @param mEmail
     * @param mUsername
     * @param mPassword
     * @param mFirstName
     * @param mLastName
     * @param mBirthday
     * @param mProfilePhoto
     * @param mPhone
     */
    public User(String mUserId, String mEmail, String mUsername, String mPassword,
                String mFirstName, String mLastName, String mBirthday,
                String mProfilePhoto, String mPhone) {
        this.mUserId = mUserId;
        this.mEmail = mEmail;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
        this.mBirthday = mBirthday;
        this.mProfilePhoto = mProfilePhoto;
        this.mPhone = mPhone;
    }

    /**
     * Full arg constructor without mUserId
     * @param mEmail
     * @param mUsername
     * @param mPassword
     * @param mFirstName
     * @param mLastName
     * @param mBirthday
     * @param mProfilePhoto
     * @param mPhone
     */
    public User(String mEmail, String mUsername, String mPassword, String mFirstName,
                String mLastName, String mBirthday, String mProfilePhoto, String mPhone) {
        this.mEmail = mEmail;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
        this.mBirthday = mBirthday;
        this.mProfilePhoto = mProfilePhoto;
        this.mPhone = mPhone;
    }

    /**
     * Constructor for required information
     * @param mEmail
     * @param mUsername
     * @param mPassword
     * @param mFirstName
     * @param mLastName
     */
    public User(String mEmail, String mUsername, String mPassword, String mFirstName,
                String mLastName) {
        this.mEmail = mEmail;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
    }


    /***** Getters and Setters *****/

    /**
     *
     * @return
     */
    public String getUserId() {
        return mUserId;
    }

    /**
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.mUserId = userId;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        this.mUsername = username;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        this.mPassword = password;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        this.mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        this.mLastName = lastName;
    }

    public String getBirthday() {
        return mBirthday;
    }

    public void setBirthday(String birthday) {
        this.mBirthday = birthday;
    }

    public String getProfilePhoto() {
        return mProfilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.mProfilePhoto = profilePhoto;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        this.mPhone = phone;
    }


    /***** toString method *****/

    @Override
    public String toString() {
        return "User{" +
                "mUserId='" + mUserId + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mUsername='" + mUsername + '\'' +
                ", mPassword='" + mPassword + '\'' +
                ", mFirstName='" + mFirstName + '\'' +
                ", mLastName='" + mLastName + '\'' +
                ", mBirthday='" + mBirthday + '\'' +
                ", mProfilePhoto='" + mProfilePhoto + '\'' +
                ", mPhone='" + mPhone + '\'' +
                '}';
    }
}
