package ru.mera.ChizhkinRoman.postman;
import java.util.ArrayList;

public class MailBox {
    private ArrayList Email_array = new ArrayList();
    private ArrayList Letter_array = new ArrayList();
    
    public void AddEmail(String from, String to, String message_body, String receive_date) {
        Email test = new Email(from, to, message_body, receive_date);
        Email_array.add("�� ����: " + test.getfrom() + " | ����: " + test.getto() + " | "+ test.getmessage_body() + ".txt | ����: " +  test.getreceive_date() + " �");
    }
    public void all_electronic_letters(){
        System.out.println("��� ����������� ������: ");
        for (int i=0; i<Email_array.size(); i++ ) {
            System.out.println((i+1)+": " + Email_array.get(i));
        }
    }
    public void AddLetter(String from, String to, String message_body, String fromPostalIndex,String toPostalIndex) {
        Letter test = new Letter(from, to, message_body, fromPostalIndex, toPostalIndex);
        Letter_array.add("�� ����: " + test.getfrom() + " | ����: " + test.getto() + " |  "+ test.getmessage_body() + ".txt | ��������� ������ " +  test.getfromPostalIndex() + " | �������� ������ " +  test.gettoPostalIndex());
    }
    public void all_normal_letters(){
        System.out.println("��� ������� ������: ");
        for (int i=0; i<Letter_array.size(); i++ ) {
            System.out.println((i+1)+": " + Letter_array.get(i));
        }
    }
}