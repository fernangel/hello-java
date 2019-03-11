package ru.mera.Чижкин_Роман.postman;

public class Jigsaws extends Electro_tools {
	int thickness;
	public Jigsaws(String name, int count, int quantity,  int power_consumption, int thickness) {
		this.name = name;
		this.count = count;
		this.quantity = quantity;
		this.power_consumption = power_consumption;
		this.thickness = thickness;
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
	public int getThickness() {
		return thickness;
	}
}
