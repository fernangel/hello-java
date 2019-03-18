package ru.mera.chizhlin_roman.postman;
public class Musician extends Person {
	private String instrument;	
	public Musician(String name, String surname, String s) {
		super(name, surname);
		instrument = s;
	}
	public String getInstrument() {
		return instrument;
	}
}
