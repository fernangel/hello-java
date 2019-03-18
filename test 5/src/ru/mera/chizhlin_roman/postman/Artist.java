package ru.mera.chizhlin_roman.postman;
public class Artist extends Person {
	private String style;
	public  Artist(String name, String surname, String s) {
		super(name, surname);
		style = s;
	}
	public String getstyle() {
		return style;
	}
}
