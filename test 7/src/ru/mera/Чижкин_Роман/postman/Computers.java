package ru.mera.Чижкин_Роман.postman;

public abstract class Computers extends AbstractItem {
	private int  memory, hard_disk_space, CPU_cores; 
	public Computers(String na, int co, int q, int y, int u, int d) {
	super(na, co, q);
	memory = y;
	hard_disk_space = u;
	CPU_cores = d;
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
