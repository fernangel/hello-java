package ru.mera.сhizhkin_roman.postman;
public class Test {
    public static void main(String[] args) {
        MailBox testic = new MailBox();
        testic.add_email("Александр","Антон","электронное письмо 1","2000");
        testic.add_email("Герман","Виола","электронное письмо 2","2002");
        testic.add_email("Филипп","Андрей","электронное письмо 3","1999");
        testic.add_letter("Елизавета","Василий","обычное письмо 1","603163", "603039");
        testic.add_letter("Олег","Елизавета","обычное письмо 2","601232", "603163");
        testic.all_electronic_letters();
        testic.all_normal_letters();
    }
}