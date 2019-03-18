package ru.mera.ñhizhkin_roman.postman;

public class Drill extends Electro_tool implements Returnable {
	private int diameter;
	public Drill(String name, int count, int quantity,  int power_consumption, int diameter) {
		super(name, count , quantity, power_consumption);
		this.diameter = diameter;
	}
	public int getDiameter() {
		return diameter;
	}
	public String getRequiredDocuments() {
		return "÷åê";
	}
	public int getDaysForReturn() {
		return 14;
	}
}
