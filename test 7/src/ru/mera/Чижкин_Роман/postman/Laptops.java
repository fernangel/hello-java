package ru.mera.Чижкин_Роман.postman;

public class Laptops extends Computers implements Returnable {
	int time;
	float diagonal;
	public Laptops (String name, int count, int quantity, int memory, int hard_disk_space, int CPU_cores, float diagonal, int time) {
		this.name = name;
		this.count = count;
		this.quantity = quantity;
		this.memory = memory;
		this.hard_disk_space = hard_disk_space;
		this.CPU_cores = CPU_cores;
		this.diagonal = diagonal;
		this.time = time;
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
	public int getMemory() {
		return memory;
	}
	public int getHard_disk_space() {
		return hard_disk_space;
	}
	public int getCPU_cores() {
		return CPU_cores;
	}
	public double getDiagonal() {
		return diagonal;
	}
	public int getTime() {
		return time;
	}
	public String getRequiredDocuments() {
		return "паспорт и чек";
	}
	public int getDaysForReturn() {
		return 14;
	}
}
