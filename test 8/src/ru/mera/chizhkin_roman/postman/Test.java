package ru.mera.chizhkin_roman.postman;


public class Test {
	static boolean h = true;
	static boolean [] z = new boolean[5];
	 public static void main (String [] args) {
		 String[] arr1 = {"���������", "�� ���������", "������ ������"};
		 Person [] arr = new Person[5];
		 arr[0] = new Person("������");
		 arr[1] = new Person("��������");
		 arr[2] = new Person("����������");
		 arr[3] = new Person("����");
		 arr[4] = new Person("�����");
		 for (int i = 0; i < arr.length; i++) {
			 try {
			int k = (int)(Math.random()*3);
			//System.out.println("�������: " + arr1[k] + " " +arr[i].getname() + ". "+arr[i].getname() + " " + arr[i].getstate());
				if (arr1[k] == "���������" & arr[i].getstate() == "���������") {
					z[i] = false;
					continue;
				}
				else 
					z[i] = true;
				if (arr1[k] == "�� ���������" & arr[i].getstate() == "�� ���������") {
					z[i] = false;
					continue;
				}
				else 
					z[i] = true;
				if (arr1[k] == "������ ������")
					z[i] = true;
				if (arr1[k] == "���������" & arr[i].getstate() == "���� �����" )
					throw new MiJeDogovarivalisDomaNePryatatsaException();
			 }
			 	catch (MiJeDogovarivalisDomaNePryatatsaException  ���) {
			 		System.out.println("����� " + arr[i].getname() + " ������ ��������");
			 		h = false;
			 		break;
			 }
		 }
		 if(h) {
			 for (int i = 0; i < arr.length; i++) {
				 if (z[i]) 
					 System.out.println("����� " + arr[i].getname() + " � ������� ����������");	 
				 else
					 System.out.println("����� " + arr[i].getname() + " � ������� �����������");
				 
			 }
		 }
	 }
}
