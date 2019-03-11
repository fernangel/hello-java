package ru.mera.Чижкин_Роман.postman;

public class Circular_saws extends Electro_tools implements Returnable {
	int radius;
	public Circular_saws(String name, int count, int quantity,  int power_consumption, int radius) {
		this.name = name;
		this.count = count;
		this.quantity = quantity;
		this.power_consumption = power_consumption;
		this.radius = radius;
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
