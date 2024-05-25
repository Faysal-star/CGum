package com.example.cgum;

import org.junit.Test;

public class UserCommentIT {
    // user     String profilePic, userName, mail, dob, pass, role, userID, lastMsg, status, learning, teaching;
    //comment     String comment , userName , userId;
    @Test
    public void testUserComment(){
        Comment_Mod comment = new Comment_Mod("comment", "userName", "userId");
        User user = new User() ;

        user.setProfilePic("profilePic");
        user.setUserName(comment.getUserName());
        user.setMail("mail");
        user.setDob("dob");
        user.setPass("pass");
        user.setRole("role");
        user.setUserID(comment.getUserId());
        user.setLastMsg("lastMsg");
        user.setStatus("status");
        user.setLearning("learning");
        user.setTeaching("teaching");

        assert (comment.getComment().equals("comment"));
        assert (comment.getUserName().equals(user.getUserName()));
        assert (comment.getUserId().equals(user.getUserID()));
    }
}
