package ru.mera.Чижкин_Роман.postman;

public class Message {
	private String  from, to, message_body;

}
class Email extends Message {
	private	String from, to, message_body, receive_date;
}
class Letter extends Message {
	private String from, to, message_body;
	private int fromPostalIndex,toPostalIndex;
}