package ru.mera.Чижкин_Роман.postman;

public class Drills extends Electro_tools implements Returnable {
	int diameter;
	public Drills(String name, int count, int quantity,  int power_consumption, int diameter) {
		this.name = name;
		this.count = count;
		this.quantity = quantity;
		this.power_consumption = power_consumption;
		this.diameter = diameter;
	}
	public String getName() {
		return name;
	}
	public int getCount() {
		return count;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getPower_consumption() {
		return power_consumption;
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
