package ru.mera.ChizhkinRoman.postman;
public class Test {
    public static void main(String[] args) {
        MailBox testic = new MailBox();
        testic.AddEmail("Александр","Антон","электронное письмо 1","2000");
        testic.AddEmail("Герман","Виола","электронное письмо 2","2002");
        testic.AddEmail("Филипп","Андрей","электронное письмо 3","1999");
        testic.all_electronic_letters();
        testic.AddLetter("Елизавета","Василий","обычное письмо 1","603163", "603039");
        testic.AddLetter("Олег","Елизавета","обычное письмо 2","601232", "603163");
        testic.all_normal_letters();
    }
}