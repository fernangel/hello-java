package ru.mera.chizhlin_roman.postman;
public class Person {
	private String name, surname; 
	public Person(String n, String sur) {
		name = n;
		this.surname = sur;
	}
	public static void main(String[] args) {		
	Person [] arr = new Person[5];
	arr[0] = new Artist("������", "��������", "�����");
	arr[1] = new Musician("��������", "�������", "������");
	arr[2] = new Musician("����������", "������", "�����");
	arr[3] = new Artist("����", "�����������", "��������");
	arr[4] = new Artist("�����", "������", "�������");
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Artist) {
				System.out.println(arr[i].name + " " + arr[i].surname + " ������ � �����" +((Artist) arr[i]).getstyle());
			}
			else {
				System.out.println(arr[i].name + " " + arr[i].surname + " ������ ��" + ((Musician) arr[i]).getInstrument() );
			}
		}
	}
}


	