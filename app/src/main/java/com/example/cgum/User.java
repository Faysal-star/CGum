package com.example.cgum;

/**
 * The User class represents a user with various attributes such as profile picture, username,
 * email, date of birth, password, role, user ID, last message, status, learning interests, and teaching interests.
 */
public class User {
    String profilePic, userName, mail, dob, pass, role, userID, lastMsg, status, learning, teaching;

    /**
     * Parameterized constructor for User.
     *
     * @param profilePic The URL of the user's profile picture.
     * @param userName   The username of the user.
     * @param mail       The email address of the user.
     * @param dob        The date of birth of the user.
     * @param pass       The password of the user.
     * @param role       The role of the user.
     * @param userID     The unique ID of the user.
     * @param lastMsg    The last message sent by the user.
     * @param status     The status of the user.
     * @param learning   The subjects the user is learning.
     * @param teaching   The subjects the user is teaching.
     */
    public User(String profilePic, String userName, String mail, String dob, String pass, String role, String userID, String lastMsg, String status, String learning, String teaching) {
        this.profilePic = profilePic;
        this.userName = userName;
        this.mail = mail;
        this.dob = dob;
        this.pass = pass;
        this.role = role;
        this.userID = userID;
        this.lastMsg = lastMsg;
        this.status = status;
        this.learning = learning;
        this.teaching = teaching;
    }

    /**
     * Default constructor for User.
     */
    public User() {
    }

    /**
     * Gets the URL of the user's profile picture.
     *
     * @return The profile picture URL.
     */
    public String getProfilePic() {
        return profilePic;
    }

    /**
     * Sets the URL of the user's profile picture.
     *
     * @param profilePic The profile picture URL.
     */
    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    /**
     * Gets the username of the user.
     *
     * @return The username.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the username of the user.
     *
     * @param userName The username.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets the email address of the user.
     *
     * @return The email address.
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the email address of the user.
     *
     * @param mail The email address.
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Gets the date of birth of the user.
     *
     * @return The date of birth.
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the date of birth of the user.
     *
     * @param dob The date of birth.
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * Gets the password of the user.
     *
     * @return The password.
     */
    public String getPass() {
        return pass;
    }

    /**
     * Sets the password of the user.
     *
     * @param pass The password.
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * Gets the role of the user.
     *
     * @return The role.
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the role of the user.
     *
     * @param role The role.
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Gets the unique ID of the user.
     *
     * @return The user ID.
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the unique ID of the user.
     *
     * @param userID The user ID.
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * Gets the last message sent by the user.
     *
     * @return The last message.
     */
    public String getLastMsg() {
        return lastMsg;
    }

    /**
     * Sets the last message sent by the user.
     *
     * @param lastMsg The last message.
     */
    public void setLastMsg(String lastMsg) {
        this.lastMsg = lastMsg;
    }

    /**
     * Gets the status of the user.
     *
     * @return The status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status of the user.
     *
     * @param status The status.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the subjects the user is learning.
     *
     * @return The subjects the user is learning.
     */
    public String getLearning() {
        return learning;
    }

    /**
     * Sets the subjects the user is learning.
     *
     * @param learning The subjects the user is learning.
     */
    public void setLearning(String learning) {
        this.learning = learning;
    }

    /**
     * Gets the subjects the user is teaching.
     *
     * @return The subjects the user is teaching.
     */
    public String getTeaching() {
        return teaching;
    }

    /**
     * Sets the subjects the user is teaching.
     *
     * @param teaching The subjects the user is teaching.
     */
    public void setTeaching(String teaching) {
        this.teaching = teaching;
    }
}
