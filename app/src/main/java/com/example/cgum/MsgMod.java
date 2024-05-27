package com.example.cgum;

/**
 * Represents a message with sender details and timestamp.
 */
public class MsgMod {
    String msg, senderId;
    long timeStamp;

    /**
     * Default constructor.
     */
    public MsgMod() {
    }

    /**
     * Constructs a MsgMod object with specified message, senderId, and timestamp.
     *
     * @param msg the content of the message
     * @param senderId the ID of the sender
     * @param timeStamp the timestamp of the message
     */
    public MsgMod(String msg, String senderId, long timeStamp) {
        this.msg = msg;
        this.senderId = senderId;
        this.timeStamp = timeStamp;
    }

    /**
     * Gets the content of the message.
     *
     * @return the content of the message
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets the content of the message.
     *
     * @param msg the content of the message
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Gets the ID of the sender.
     *
     * @return the ID of the sender
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * Sets the ID of the sender.
     *
     * @param senderId the ID of the sender
     */
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * Gets the timestamp of the message.
     *
     * @return the timestamp of the message
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the timestamp of the message.
     *
     * @param timeStamp the timestamp of the message
     */
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
