package com.example.cgum;

import junit.framework.TestCase;

public class Comment_ModTest extends TestCase {

    public void testGetComment() {
        Comment_Mod comment = new Comment_Mod("This is a test comment", "Tanjim", "1234");
        assertEquals("This is a test comment", comment.getComment());
    }

    public void testSetComment() {
        Comment_Mod comment = new Comment_Mod();
        comment.setComment("This is a new comment");
        assertEquals("This is a new comment", comment.getComment());
    }

    public void testGetUserName() {
        Comment_Mod comment = new Comment_Mod("Test comment", "Faysal", "5678");
        assertEquals("Faysal", comment.getUserName());
    }

    public void testSetUserName() {
        Comment_Mod comment = new Comment_Mod();
        comment.setUserName("Tanjim");
        assertEquals("Tanjim", comment.getUserName());
    }

    public void testGetUserId() {
        Comment_Mod comment = new Comment_Mod("Comment text", "Niloy", "9012");
        assertEquals("9012", comment.getUserId());
    }

    public void testSetUserId() {
        Comment_Mod comment = new Comment_Mod();
        comment.setUserId("3456");
        assertEquals("3456", comment.getUserId());
    }
}