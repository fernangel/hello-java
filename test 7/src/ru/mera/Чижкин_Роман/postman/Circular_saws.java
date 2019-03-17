package ru.mera.Чижкин_Роман.postman;

public class Circular_saws extends Electro_tools implements Returnable {
	private int radius;
	public Circular_saws(String name, int count, int quantity,  int power_consumption, int s) {
		super(name, count , quantity, power_consumption);
		this.radius = s;
	}
	public int getRadius() {
		return radius;
	}
	public String getRequiredDocuments() {
		return "паспорт и чек";
	}
	public int getDaysForReturn() {
		return 21;
	}
}
