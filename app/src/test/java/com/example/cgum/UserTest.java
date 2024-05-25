package com.example.cgum;

import junit.framework.TestCase;

public class UserTest extends TestCase {

    public void testGetProfilePic() {
        User user = new User();
        user.setProfilePic("profilePic.png");
        assertEquals("profilePic.png", user.getProfilePic());
    }

    public void testSetProfilePic() {
        User user = new User();
        user.setProfilePic("profilePic.png");
        assertEquals("profilePic.png", user.getProfilePic());
    }

    public void testGetUserName() {
        User user = new User();
        user.setUserName("Tanjim Hasan");
        assertEquals("Tanjim Hasan", user.getUserName());
    }

    public void testSetUserName() {
        User user = new User();
        user.setUserName("Tanjim Hasan");
        assertEquals("Tanjim Hasan", user.getUserName());
    }

    public void testGetMail() {
        User user = new User();
        user.setMail("tanjim@example.com");
        assertEquals("tanjim@example.com", user.getMail());
    }

    public void testSetMail() {
        User user = new User();
        user.setMail("tanjim@example.com");
        assertEquals("tanjim@example.com", user.getMail());
    }

    public void testGetDob() {
        User user = new User();
        user.setDob("05/11/2000");
        assertEquals("05/11/2000", user.getDob());
    }

    public void testSetDob() {
        User user = new User();
        user.setDob("05/11/2000");
        assertEquals("05/11/2000", user.getDob());
    }

    public void testGetPass() {
        User user = new User();
        user.setPass("password123");
        assertEquals("password123", user.getPass());
    }

    public void testSetPass() {
        User user = new User();
        user.setPass("password123");
        assertEquals("password123", user.getPass());
    }

    public void testGetRole() {
        User user = new User();
        user.setRole("admin");
        assertEquals("admin", user.getRole());
    }

    public void testSetRole() {
        User user = new User();
        user.setRole("admin");
        assertEquals("admin", user.getRole());
    }

    public void testGetUserID() {
        User user = new User();
        user.setUserID("12345");
        assertEquals("12345", user.getUserID());
    }

    public void testSetUserID() {
        User user = new User();
        user.setUserID("12345");
        assertEquals("12345", user.getUserID());
    }

    public void testGetLastMsg() {
        User user = new User();
        user.setLastMsg("CGum");
        assertEquals("CGum", user.getLastMsg());
    }

    public void testSetLastMsg() {
        User user = new User();
        user.setLastMsg("CGum");
        assertEquals("CGum", user.getLastMsg());
    }

    public void testGetStatus() {
        User user = new User();
        user.setStatus("active");
        assertEquals("active", user.getStatus());
    }

    public void testSetStatus() {
        User user = new User();
        user.setStatus("active");
        assertEquals("active", user.getStatus());
    }

    public void testGetLearning() {
        User user = new User();
        user.setLearning("Java");
        assertEquals("Java", user.getLearning());
    }

    public void testSetLearning() {
        User user = new User();
        user.setLearning("Java");
        assertEquals("Java", user.getLearning());
    }

    public void testGetTeaching() {
        User user = new User();
        user.setTeaching("python");
        assertEquals("python", user.getTeaching());
    }

    public void testSetTeaching() {
        User user = new User();
        user.setTeaching("python");
        assertEquals("python", user.getTeaching());
    }
}
