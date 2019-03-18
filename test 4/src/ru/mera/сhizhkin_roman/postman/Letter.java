package ru.mera.ñhizhkin_roman.postman;

public class Letter extends Message {
    private String fromPostalIndex, toPostalIndex;
    public Letter(String from, String to, String message_body, String fromPostalIndex, String toPostalIndex) {
        super(from, to, message_body);
        this.fromPostalIndex = fromPostalIndex;
        this.toPostalIndex = toPostalIndex;
    }
    public String getfromPostalIndex() {
        return fromPostalIndex;
    }
    public String gettoPostalIndex() {
        return toPostalIndex;
    }
}