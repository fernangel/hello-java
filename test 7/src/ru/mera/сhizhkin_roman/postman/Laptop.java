package ru.mera.ñhizhkin_roman.postman;

public class Laptop extends Computer implements Returnable {
	private int time;
	private float diagonal;
	public Laptop (String name, int count, int quantity, int memory, int hard_disk_space, int CPU_cores, float diagonal, int time) {
		super(name,count, quantity, memory,hard_disk_space, CPU_cores);
		this.diagonal = diagonal;
		this.time = time;
	}
	public double getDiagonal() {
		return diagonal;
	}
	public int getTime() {
		return time;
	}
	public String getRequiredDocuments() {
		return "ïàñïîðò è ÷åê";
	}
	public int getDaysForReturn() {
		return 14;
	}
}
