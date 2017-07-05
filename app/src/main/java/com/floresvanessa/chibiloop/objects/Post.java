package com.floresvanessa.chibiloop.objects;

/**
 * Created by vanessaflores on 7/5/17.
 */

public class Post {

    private String mPostId;
    private String mUserId;
    private String mDescription;
    private Content mContent;
    private String mTimestamp;
    private int mLikes;
    private int mShares;
    private int mLoops; // how many times content has been listened to
    private int mReLoops;   // how many times content has been re-posted by a different user

    /***** Constructors *****/

    /**
     * Default constructor
     */
    public Post() {

    }

    /**
     * Full argument constructor
     * @param mPostId
     * @param mUserId
     * @param mDescription
     * @param mContent
     * @param mTimestamp
     * @param mLikes
     * @param mShares
     * @param mLoops
     * @param mReLoops
     */
    public Post(String mPostId, String mUserId, String mDescription, Content mContent,
                String mTimestamp, int mLikes, int mShares, int mLoops, int mReLoops) {
        this.mPostId = mPostId;
        this.mUserId = mUserId;
        this.mDescription = mDescription;
        this.mContent = mContent;
        this.mTimestamp = mTimestamp;
        this.mLikes = mLikes;
        this.mShares = mShares;
        this.mLoops = mLoops;
        this.mReLoops = mReLoops;
    }

    /**
     * Full arg constructor without mPostId
     * @param mUserId
     * @param mDescription
     * @param mContent
     * @param mTimestamp
     * @param mLikes
     * @param mShares
     * @param mLoops
     * @param mReLoops
     */
    public Post(String mUserId, String mDescription, Content mContent, String mTimestamp,
                int mLikes, int mShares, int mLoops, int mReLoops) {
        this.mUserId = mUserId;
        this.mDescription = mDescription;
        this.mContent = mContent;
        this.mTimestamp = mTimestamp;
        this.mLikes = mLikes;
        this.mShares = mShares;
        this.mLoops = mLoops;
        this.mReLoops = mReLoops;
    }

    /**
     * Constructor for when a user creates a post, before others users have interacted with it
     * @param mPostId
     * @param mUserId
     * @param mDescription
     * @param mContent
     * @param mTimestamp
     */
    public Post(String mPostId, String mUserId, String mDescription, Content mContent, String mTimestamp) {
        this.mPostId = mPostId;
        this.mUserId = mUserId;
        this.mDescription = mDescription;
        this.mContent = mContent;
        this.mTimestamp = mTimestamp;
    }


    /***** Getters and Setters *****/

    public String getPostId() {
        return mPostId;
    }

    public void setPostId(String postId) {
        this.mPostId = postId;
    }

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        this.mUserId = userId;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public Content getContent() {
        return mContent;
    }

    public void setContent(Content content) {
        this.mContent = content;
    }

    public String getTimestamp() {
        return mTimestamp;
    }

    public void setTimestamp(String timestamp) {
        this.mTimestamp = timestamp;
    }

    public int getLikes() {
        return mLikes;
    }

    public void setLikes(int likes) {
        this.mLikes = likes;
    }

    public int getShares() {
        return mShares;
    }

    public void setShares(int shares) {
        this.mShares = shares;
    }

    public int getLoops() {
        return mLoops;
    }

    public void setLoops(int loops) {
        this.mLoops = loops;
    }

    public int getReLoops() {
        return mReLoops;
    }

    public void setReLoops(int reLoops) {
        this.mReLoops = reLoops;
    }


    /***** toString method *****/

    @Override
    public String toString() {
        return "Post{" +
                "mPostId='" + mPostId + '\'' +
                ", mUserId='" + mUserId + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mContent=" + mContent +
                ", mTimestamp='" + mTimestamp + '\'' +
                ", mLikes=" + mLikes +
                ", mShares=" + mShares +
                ", mLoops=" + mLoops +
                ", mReLoops=" + mReLoops +
                '}';
    }
}
