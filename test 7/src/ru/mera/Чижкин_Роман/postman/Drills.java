package ru.mera.Чижкин_Роман.postman;

public class Drills extends Electro_tools implements Returnable {
	private int diameter;
	public Drills(String name, int count, int quantity,  int power_consumption, int diameter) {
		super(name, count , quantity, power_consumption);
		this.diameter = diameter;
	}
	public int getDiameter() {
		return diameter;
	}
	public String getRequiredDocuments() {
		return "чек";
	}
	public int getDaysForReturn() {
		return 14;
	}
}
