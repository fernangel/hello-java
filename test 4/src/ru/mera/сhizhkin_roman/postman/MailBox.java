package ru.mera.�hizhkin_roman.postman;
import java.util.ArrayList;

public class MailBox {
	
    private ArrayList <Email> email_array = new ArrayList <Email>();
    private ArrayList <Letter> letter_array = new ArrayList <Letter>();
    private ArrayList <String> pain = new ArrayList <String>();
    private ArrayList <String> pain2 = new ArrayList <String>();
    
    public void add_email(String from, String to, String message_body, String receive_date) {
        Email test = new Email(from, to, message_body, receive_date); 
        email_array.add(test);
        pain.add("�� ����: " + test.getfrom() + " | ����: " + test.getto() + " | "+ test.getmessage_body() +  ".txt | ����: " +  test.getreceive_date() + " �");        
    }
    public void all_electronic_letters() {
        System.out.println("��� ����������� ������: ");
        for (int i=0; i<email_array.size(); i++ ) {
            System.out.println((i+1)+": " + pain.get(i));
        }
    }
    public void add_letter(String from, String to, String message_body, String fromPostalIndex,String toPostalIndex) {
        Letter test = new Letter(from, to, message_body, fromPostalIndex, toPostalIndex);
        letter_array.add(test);
        pain2.add("�� ����: " + test.getfrom() + " | ����: " + test.getto() + " | "+ test.getmessage_body() +  ".txt | �������� ������: " +  test.getfromPostalIndex() + " |  ��������� ������ " +  test.gettoPostalIndex());
    }
    public void all_normal_letters() {
        System.out.println("��� ������� ������: ");
        for (int i=0; i<letter_array.size(); i++ ) {
            System.out.println((i+1)+": " + pain2.get(i));
        }
    }
}