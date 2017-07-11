package com.floresvanessa.chibiloop.objects;

/**
 * Created by vanessaflores on 6/28/17.
 */

public class Content {

    protected String mContentId;
    private String mContentTitle;
    private String mUserId;
    private String mFileName;
    private String mContentType;
    private String mContentCategory;
    private String mTimestamp;
    private String mTitle;
    private String mLength;

    /***** Constructors *****/

    /**
     *  Default no arg constructor for Content class
     */
    public Content() {

    }

    /**
     * Full arg constructor with mContentId
     * @param mContentId
     * @param mContentTitle
     * @param mUserId
     * @param mFileName
     * @param mContentType
     * @param mContentCategory
     * @param mTimestamp
     * @param mTitle
     * @param mLength
     */
    public Content(String mContentId, String mContentTitle, String mUserId, String mFileName,
                   String mContentType, String mContentCategory, String mTimestamp,
                   String mTitle, String mLength) {
        this.mContentId = mContentId;
        this.mContentTitle = mContentTitle;
        this.mUserId = mUserId;
        this.mFileName = mFileName;
        this.mContentType = mContentType;
        this.mContentCategory = mContentCategory;
        this.mTimestamp = mTimestamp;
        this.mTitle = mTitle;
        this.mLength = mLength;
    }

    /**
     *  Full arg constructor for Content class
     * @param mContentTitle
     * @param mUserId
     * @param mFileName
     * @param mContentType
     * @param mContentCategory
     * @param mTimestamp
     * @param mTitle
     * @param mLength
     *
     */
    public Content(String mContentTitle, String mUserId, String mFileName, String mContentType,
                   String mContentCategory, String mTimestamp, String mTitle, String mLength) {
        this.mContentTitle = mContentTitle;
        this.mUserId = mUserId;
        this.mFileName = mFileName;
        this.mContentType = mContentType;
        this.mContentCategory = mContentCategory;
        this.mTimestamp = mTimestamp;
        this.mTitle = mTitle;
        this.mLength = mLength;
    }

    /**
     * Constructor for when a user creates content, but hasn't posted anything yet
     * @param mContentTitle
     * @param mUserId
     * @param mFileName
     * @param mContentType
     * @param mTimestamp
     * @param mTitle
     * @param mLength
     */
    public Content(String mContentTitle, String mUserId, String mFileName,
                   String mContentType, String mTimestamp, String mTitle, String mLength) {
        this.mContentTitle = mContentTitle;
        this.mUserId = mUserId;
        this.mFileName = mFileName;
        this.mContentType = mContentType;
        this.mTimestamp = mTimestamp;
        this.mTitle = mTitle;
        this.mLength = mLength;
    }

    /**
     * For testing purposes
     */
    public Content(String mContentId, String mContentTitle, String mFileName) {
        this.mContentId = mContentId;
        this.mContentTitle = mContentTitle;
        this.mFileName = mFileName;
    }

    /***** Getters and Setters *****/

    public String getContentId() {
        return mContentId;
    }

    public void setContentId(String contentId) {
        this.mContentId = contentId;
    }

    public String getContentTitle() {
        return mContentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.mContentTitle = contentTitle;
    }

    public String getPostedBy() {
        return mUserId;
    }

    public void setPostedBy(String postedBy) {
        this.mUserId = postedBy;
    }

    public String getFileName() {
        return mFileName;
    }

    public void setFileName(String fileName) {
        this.mFileName = fileName;
    }

    public String getContentType() {
        return mContentType;
    }

    public void setContentType(String contentType) {
        this.mContentType = contentType;
    }

    public String getContentCategory() {
        return mContentCategory;
    }

    public void setContentCategory(String contentCategory) {
        this.mContentCategory = contentCategory;
    }

    public String getTimestamp() {
        return mTimestamp;
    }

    public void setTimestamp(String timestamp) {
        this.mTimestamp = timestamp;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getLength() {
        return mLength;
    }

    public void setLength(String length) {
        this.mLength = length;
    }

    /***** toString method *****/

    @Override
    public String toString() {
        return "Content{" +
                "mContentId='" + mContentId + '\'' +
                ", mContentTitle='" + mContentTitle + '\'' +
                ", mUserId='" + mUserId + '\'' +
                ", mFileName='" + mFileName + '\'' +
                ", mContentType='" + mContentType + '\'' +
                ", mContentCategory='" + mContentCategory + '\'' +
                ", mTimestamp='" + mTimestamp + '\'' +
                ", mTitle='" + mTitle + '\'' +
                ", mLength='" + mLength + '\'' +
                '}';
    }
}
