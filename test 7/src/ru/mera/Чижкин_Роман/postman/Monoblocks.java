package ru.mera.Чижкин_Роман.postman;

public class Monoblocks extends Computers {
	public Monoblocks (String name, int count, int quantity, int memory, int hard_disk_space, int CPU_cores) {
		this.name = name;
		this.count = count;
		this.quantity = quantity;
		this.memory = memory;
		this.hard_disk_space = hard_disk_space;
		this.CPU_cores = CPU_cores;
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
}
