package com.example.cgum;

public class UserMsgIT {
    // user     String profilePic, userName, mail, dob, pass, role, userID, lastMsg, status, learning, teaching;
    //msgmod String msg , senderId  long timeStamp;
    public void testUserMsg(){
        MsgMod msg = new MsgMod("msg", "senderId", 1234567890);
        User user = new User() ;

        user.setProfilePic("profilePic");
        user.setUserName("userName");
        user.setMail("mail");
        user.setDob("dob");
        user.setPass("pass");
        user.setRole("role");
        user.setUserID(msg.getSenderId());
        user.setLastMsg("lastMsg");
        user.setStatus("status");
        user.setLearning("learning");
        user.setTeaching("teaching");

        assert (msg.getMsg().equals("msg"));
        assert (msg.getSenderId().equals(user.getUserID()));
        assert (msg.getTimeStamp() == 1234567890);

    }
}
