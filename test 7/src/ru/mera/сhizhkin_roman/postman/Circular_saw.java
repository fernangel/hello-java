package ru.mera.�hizhkin_roman.postman;

public class Circular_saw extends Electro_tool implements Returnable {
	private int radius;
	public Circular_saw(String name, int count, int quantity,  int power_consumption, int s) {
		super(name, count , quantity, power_consumption);
		this.radius = s;
	}
	public int getRadius() {
		return radius;
	}
	public String getRequiredDocuments() {
		return "������� � ���";
	}
	public int getDaysForReturn() {
		return 21;
	}
}
