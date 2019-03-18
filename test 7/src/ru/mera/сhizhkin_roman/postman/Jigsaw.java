package ru.mera.ñhizhkin_roman.postman;

public class Jigsaw extends Electro_tool {
	private int thickness;
	public Jigsaw(String name, int count, int quantity,  int power_consumption, int thickness) {
		super(name, count , quantity, power_consumption);
		this.thickness = thickness;
	}
	public int getThickness() {
		return thickness;
	}
}
