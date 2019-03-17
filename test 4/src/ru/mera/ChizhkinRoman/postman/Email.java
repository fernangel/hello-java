package ru.mera.ChizhkinRoman.postman;
	public class Email extends Message {
    private String receive_date;
    public Email(String from, String to, String message_body, String receive_date){
        super(from, to, message_body);
        this.receive_date = receive_date;
    }
    public String getreceive_date() {
        return receive_date;
    }
}
