package ru.mera.ñhizhkin_roman.postman;

public abstract class Electro_tool extends AbstractItem {
	private int power_consumption;
	public int getPower_consumption() {
		return power_consumption;
	}
		public Electro_tool(String na, int co, int q, int po) {
			super(na, co, q);
			power_consumption = po;
	}
}
