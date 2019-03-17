package ru.mera.Чижкин_Роман.postman;

public abstract class Electro_tools extends AbstractItem {
	private int power_consumption;
	public int getPower_consumption() {
		return power_consumption;
	}
		public Electro_tools(String na, int co, int q, int po) {
			super(na, co, q);
			power_consumption = po;
	}
}
