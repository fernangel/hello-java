package ru.mera.ChizhkinRoman.postman;
public class Test {
    public static void main(String[] args) {
        MailBox testic = new MailBox();
        testic.AddEmail("���������","�����","����������� ������ 1","2000");
        testic.AddEmail("������","�����","����������� ������ 2","2002");
        testic.AddEmail("������","������","����������� ������ 3","1999");
        testic.all_electronic_letters();
        testic.AddLetter("���������","�������","������� ������ 1","603163", "603039");
        testic.AddLetter("����","���������","������� ������ 2","601232", "603163");
        testic.all_normal_letters();
    }
}