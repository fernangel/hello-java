package ru.mera.ChizhkinRoman.postman;

public abstract class Message {
    private String from, to, message_body;
    public Message(String from, String to, String message_body) {
        this.from = from;
        this.to = to;
        this.message_body = message_body;
    }
    public String getmessage_body() {
        return message_body;
    }
    public String getfrom() {
        return from;
    }
    public String getto() {
        return to;
    }
}
