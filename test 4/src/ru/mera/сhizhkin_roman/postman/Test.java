package ru.mera.�hizhkin_roman.postman;
public class Test {
    public static void main(String[] args) {
        MailBox testic = new MailBox();
        testic.add_email("���������","�����","����������� ������ 1","2000");
        testic.add_email("������","�����","����������� ������ 2","2002");
        testic.add_email("������","������","����������� ������ 3","1999");
        testic.add_letter("���������","�������","������� ������ 1","603163", "603039");
        testic.add_letter("����","���������","������� ������ 2","601232", "603163");
        testic.all_electronic_letters();
        testic.all_normal_letters();
    }
}