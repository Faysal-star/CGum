package com.example.cgum;

import org.junit.Test;

public class PostUserIT {
    @Test
    public void testPostUser() {
        //String profilePic, userName, mail, dob, pass, role, userID, lastMsg, status, learning, teaching;
        //    String title , tags , descr , UserId , UserName , UserImg , likes , postID;
        User user = new User("profilePic", "userName", "mail", "dob", "pass", "role", "userID", "lastMsg", "status", "learning", "teaching");
        PostMod post = new PostMod();
        post.setTitle("title");
        post.setTags("tags");
        post.setDescr("descr");
        post.setUserId(user.getUserID());
        post.setUserName(user.getUserName());
        post.setUserImg(user.getProfilePic());
        post.setLikes("likes");
        post.setPostID("postID");

        assert(post.getTitle().equals("title"));
        assert(post.getTags().equals("tags"));
        assert(post.getDescr().equals("descr"));
        assert(post.getUserId().equals(user.getUserID()));
        assert(post.getUserName().equals(user.getUserName()));
        assert(post.getUserImg().equals(user.getProfilePic()));
        assert(post.getLikes().equals("likes"));
        assert(post.getPostID().equals("postID"));


    }
}

