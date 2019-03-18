package ru.mera.ñhizhkin_roman.postman;

public abstract class AbstractItem implements Item {
	private int	count, quantity;
	private String name;
	public AbstractItem(String na, int co, int q) {
		name = na;
		count = co;
		quantity = q; 
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
}

