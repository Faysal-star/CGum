package com.example.cgum;

import junit.framework.TestCase;

public class MsgModTest extends TestCase {

    public void testGetMsg() {
        MsgMod msgMod = new MsgMod();
        msgMod.setMsg("CGum");
        assertEquals("CGum", msgMod.getMsg());
    }

    public void testSetMsg() {
        MsgMod msgMod = new MsgMod();
        msgMod.setMsg("CGum");
        assertEquals("CGum", msgMod.getMsg());
    }

    public void testGetSenderId() {
        MsgMod msgMod = new MsgMod();
        msgMod.setSenderId("user123");
        assertEquals("user123", msgMod.getSenderId());
    }

    public void testSetSenderId() {
        MsgMod msgMod = new MsgMod();
        msgMod.setSenderId("user123");
        assertEquals("user123", msgMod.getSenderId());
    }

    public void testGetTimeStamp() {
        MsgMod msgMod = new MsgMod();
        long currentTime = System.currentTimeMillis();
        msgMod.setTimeStamp(currentTime);
        assertEquals(currentTime, msgMod.getTimeStamp());
    }

    public void testSetTimeStamp() {
        MsgMod msgMod = new MsgMod();
        long currentTime = System.currentTimeMillis();
        msgMod.setTimeStamp(currentTime);
        assertEquals(currentTime, msgMod.getTimeStamp());
    }
}
