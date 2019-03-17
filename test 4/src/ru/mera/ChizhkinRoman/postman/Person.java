package ru.mera.ChizhkinRoman.postman;
public class Person {
    private String name, surname;
    public Person (String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getname() {
        return name + surname;
    }
}