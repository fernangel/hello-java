package ru.mera.������_�����.postman;
public class Person {
private String name, surname; 
	public  String toString(String name, String surname) {
		this.name = name;
		this.surname = surname;
		return name + surname;
	}
	public static void main(String[] args) {
		
		Person [] arr = new Person[5];
		arr[0] = new Artist();
		arr[1] = new Musician();
		arr[2] = new Musician();
		arr[3] = new Artist();
		arr[4] = new Artist();
		arr[0].toString("������", "��������");
		arr[1].toString("��������", "�������");
		arr[2].toString("����������", "������");
		arr[3].toString("����", "�����������");
		arr[4].toString("�����", "������");
		((Artist) arr[0]).setstyle("�����");
		((Musician) arr[1]).setInstrument("������");
		((Musician) arr[2]).setInstrument("�����");
		((Artist) arr[3]).setstyle("��������");
		((Artist) arr[4]).setstyle("�������");
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


	