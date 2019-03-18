package ru.mera.ñhizhkin_roman.postman;

public class Jigsaws extends Electro_tools {
	private int thickness;
	public Jigsaws(String name, int count, int quantity,  int power_consumption, int thickness) {
		super(name, count , quantity, power_consumption);
		this.thickness = thickness;
	}
	public int getThickness() {
		return thickness;
	}
}
