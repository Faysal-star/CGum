package com.example.cgum;

/**
 * Represents a comment with associated user details.
 */
public class Comment_Mod {
    String comment, userName, userId;

    /**
     * Default constructor.
     */
    public Comment_Mod() {
    }

    /**
     * Constructs a Comment_Mod object with specified comment, userName, and userId.
     *
     * @param comment the content of the comment
     * @param userName the name of the user who made the comment
     * @param userId the ID of the user who made the comment
     */
    public Comment_Mod(String comment, String userName, String userId) {
        this.comment = comment;
        this.userName = userName;
        this.userId = userId;
    }

    /**
     * Gets the content of the comment.
     *
     * @return the content of the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the content of the comment.
     *
     * @param comment the content of the comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Gets the name of the user who made the comment.
     *
     * @return the name of the user who made the comment
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the name of the user who made the comment.
     *
     * @param userName the name of the user who made the comment
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets the ID of the user who made the comment.
     *
     * @return the ID of the user who made the comment
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the ID of the user who made the comment.
     *
     * @param userId the ID of the user who made the comment
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
