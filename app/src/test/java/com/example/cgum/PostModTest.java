package com.example.cgum;

import junit.framework.TestCase;

public class PostModTest extends TestCase {

    public void testGetTitle() {
        PostMod postMod = new PostMod();
        postMod.setTitle("Title");
        assertEquals("Title", postMod.getTitle());
    }

    public void testSetTitle() {
        PostMod postMod = new PostMod();
        postMod.setTitle("Title");
        assertEquals("Title", postMod.getTitle());
    }

    public void testGetTags() {
        PostMod postMod = new PostMod();
        postMod.setTags("tag1, tag2");
        assertEquals("tag1, tag2", postMod.getTags());
    }

    public void testSetTags() {
        PostMod postMod = new PostMod();
        postMod.setTags("tag1, tag2");
        assertEquals("tag1, tag2", postMod.getTags());
    }

    public void testGetDescr() {
        PostMod postMod = new PostMod();
        postMod.setDescr("This is a description.");
        assertEquals("This is a description.", postMod.getDescr());
    }

    public void testSetDescr() {
        PostMod postMod = new PostMod();
        postMod.setDescr("This is a description.");
        assertEquals("This is a description.", postMod.getDescr());
    }

    public void testGetUserId() {
        PostMod postMod = new PostMod();
        postMod.setUserId("user123");
        assertEquals("user123", postMod.getUserId());
    }

    public void testSetUserId() {
        PostMod postMod = new PostMod();
        postMod.setUserId("user123");
        assertEquals("user123", postMod.getUserId());
    }

    public void testGetUserName() {
        PostMod postMod = new PostMod();
        postMod.setUserName("Tanjimul Hasan");
        assertEquals("Tanjimul Hasan", postMod.getUserName());
    }

    public void testSetUserName() {
        PostMod postMod = new PostMod();
        postMod.setUserName("Tanjimul Hasan");
        assertEquals("Tanjimul Hasan", postMod.getUserName());
    }

    public void testGetUserImg() {
        PostMod postMod = new PostMod();
        postMod.setUserImg("image.png");
        assertEquals("image.png", postMod.getUserImg());
    }

    public void testSetUserImg() {
        PostMod postMod = new PostMod();
        postMod.setUserImg("image.png");
        assertEquals("image.png", postMod.getUserImg());
    }

    public void testGetLikes() {
        PostMod postMod = new PostMod();
        postMod.setLikes("100");
        assertEquals("100", postMod.getLikes());
    }

    public void testSetLikes() {
        PostMod postMod = new PostMod();
        postMod.setLikes("100");
        assertEquals("100", postMod.getLikes());
    }

    public void testGetPostID() {
        PostMod postMod = new PostMod();
        postMod.setPostID("post123");
        assertEquals("post123", postMod.getPostID());
    }

    public void testSetPostID() {
        PostMod postMod = new PostMod();
        postMod.setPostID("post123");
        assertEquals("post123", postMod.getPostID());
    }
}
