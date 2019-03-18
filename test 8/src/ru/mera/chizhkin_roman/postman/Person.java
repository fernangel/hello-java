package ru.mera.chizhkin_roman.postman;

public class Person {
	
	private String name, state;
	private int k;
	private String arr2[] = {"спрятался", "не спрятался", "ушел домой"};
	
	public Person(String name) {
		this.name = name;
		k = (int)(Math.random()*3);
		this.state = arr2[k];
		}
	public String getstate() {
		return state;
	}
	public String getname() {
		return name;
	}
	}
