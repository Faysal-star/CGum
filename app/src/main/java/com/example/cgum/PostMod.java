package com.example.cgum;

/**
 * The PostMod class represents a post with various attributes such as title, tags, description,
 * user information, likes, and post ID.
 */
public class PostMod {
    String title, tags, descr, UserId, UserName, UserImg, likes, postID;

    /**
     * Default constructor for PostMod.
     */
    public PostMod() {
    }

    /**
     * Parameterized constructor for PostMod.
     *
     * @param title    The title of the post.
     * @param tags     The tags associated with the post.
     * @param descr    The description of the post.
     * @param userId   The ID of the user who created the post.
     * @param userName The name of the user who created the post.
     * @param userImg  The image URL of the user who created the post.
     * @param likes    The number of likes the post has received.
     * @param postID   The unique ID of the post.
     */
    public PostMod(String title, String tags, String descr, String userId, String userName, String userImg, String likes, String postID) {
        this.title = title;
        this.tags = tags;
        this.descr = descr;
        UserId = userId;
        UserName = userName;
        UserImg = userImg;
        this.likes = likes;
        this.postID = postID;
    }

    /**
     * Gets the title of the post.
     *
     * @return The title of the post.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the post.
     *
     * @param title The title of the post.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the tags associated with the post.
     *
     * @return The tags of the post.
     */
    public String getTags() {
        return tags;
    }

    /**
     * Sets the tags associated with the post.
     *
     * @param tags The tags of the post.
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * Gets the description of the post.
     *
     * @return The description of the post.
     */
    public String getDescr() {
        return descr;
    }

    /**
     * Sets the description of the post.
     *
     * @param descr The description of the post.
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }

    /**
     * Gets the ID of the user who created the post.
     *
     * @return The user ID.
     */
    public String getUserId() {
        return UserId;
    }

    /**
     * Sets the ID of the user who created the post.
     *
     * @param userId The user ID.
     */
    public void setUserId(String userId) {
        UserId = userId;
    }

    /**
     * Gets the name of the user who created the post.
     *
     * @return The user name.
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * Sets the name of the user who created the post.
     *
     * @param userName The user name.
     */
    public void setUserName(String userName) {
        UserName = userName;
    }

    /**
     * Gets the image URL of the user who created the post.
     *
     * @return The user image URL.
     */
    public String getUserImg() {
        return UserImg;
    }

    /**
     * Sets the image URL of the user who created the post.
     *
     * @param userImg The user image URL.
     */
    public void setUserImg(String userImg) {
        UserImg = userImg;
    }

    /**
     * Gets the number of likes the post has received.
     *
     * @return The number of likes.
     */
    public String getLikes() {
        return likes;
    }

    /**
     * Sets the number of likes the post has received.
     *
     * @param likes The number of likes.
     */
    public void setLikes(String likes) {
        this.likes = likes;
    }

    /**
     * Gets the unique ID of the post.
     *
     * @return The post ID.
     */
    public String getPostID() {
        return postID;
    }

    /**
     * Sets the unique ID of the post.
     *
     * @param postID The post ID.
     */
    public void setPostID(String postID) {
        this.postID = postID;
    }
}
