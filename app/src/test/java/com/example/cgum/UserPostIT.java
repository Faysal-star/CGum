package com.example.cgum;

import org.junit.Test;

public class UserPostIT {
    @Test
    public void testUserPost(){
        // user     String profilePic, userName, mail, dob, pass, role, userID, lastMsg, status, learning, teaching;
        // post     String title , tags , descr , UserId , UserName , UserImg , likes , postID;
        PostMod post = new PostMod("title", "tags", "descr", "userID", "userName", "profilePic", "likes", "postID");
        User user = new User() ;

        user.setProfilePic("profilePic");
        user.setUserName(post.getUserName());
        user.setMail("mail");
        user.setDob("dob");
        user.setPass("pass");
        user.setRole("role");
        user.setUserID(post.getUserId());
        user.setLastMsg("lastMsg");
        user.setStatus("status");
        user.setLearning("learning");
        user.setTeaching("teaching");

        assert (post.getTitle().equals("title"));
        assert (post.getTags().equals("tags"));
        assert (post.getDescr().equals("descr"));
        assert (post.getUserId().equals(user.getUserID()));
        assert (post.getUserName().equals(user.getUserName()));

        assert (post.getUserImg().equals("profilePic"));
        assert (post.getLikes().equals("likes"));
        assert (post.getPostID().equals("postID"));




    }
}
