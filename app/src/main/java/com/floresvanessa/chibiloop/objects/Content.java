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
    private String mDateCreated;

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
     * @param mDateCreated
     */
    public Content(String mContentId, String mContentTitle, String mUserId, String mFileName,
                   String mContentType, String mContentCategory, String mDateCreated) {
        this.mContentId = mContentId;
        this.mContentTitle = mContentTitle;
        this.mUserId = mUserId;
        this.mFileName = mFileName;
        this.mContentType = mContentType;
        this.mContentCategory = mContentCategory;
        this.mDateCreated = mDateCreated;
    }

    /**
     *  Full arg constructor for Content class
     * @param mContentTitle
     * @param mUserId
     * @param mFileName
     * @param mContentType
     * @param mContentCategory
     * @param mDateCreated
     */
    public Content(String mContentTitle, String mUserId, String mFileName, String mContentType,
                   String mContentCategory, String mDateCreated) {
        this.mContentTitle = mContentTitle;
        this.mUserId = mUserId;
        this.mFileName = mFileName;
        this.mContentType = mContentType;
        this.mContentCategory = mContentCategory;
        this.mDateCreated = mDateCreated;
    }

    /**
     * Constructor for when a user creates content, but hasn't posted anything yet
     * @param mContentTitle
     * @param mUserId
     * @param mFileName
     * @param mContentType
     * @param mDateCreated
     */
    public Content(String mContentTitle, String mUserId, String mFileName,
                   String mContentType, String mDateCreated) {
        this.mContentTitle = mContentTitle;
        this.mUserId = mUserId;
        this.mFileName = mFileName;
        this.mContentType = mContentType;
        this.mDateCreated = mDateCreated;
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

    public String getDateCreated() {
        return mDateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.mDateCreated = dateCreated;
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
                ", mDateCreated='" + mDateCreated + '\'' +
                '}';
    }
}
