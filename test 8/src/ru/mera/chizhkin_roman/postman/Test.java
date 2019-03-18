package ru.mera.chizhkin_roman.postman;


public class Test {
	static boolean h = true;
	static boolean [] z = new boolean[5];
	 public static void main (String [] args) {
		 String[] arr1 = {"пр€чешьс€", "не пр€чешьс€", "молчит насчет"};
		 Person [] arr = new Person[5];
		 arr[0] = new Person("√ерман");
		 arr[1] = new Person("¬ладимир");
		 arr[2] = new Person("»ннокентий");
		 arr[3] = new Person("ѕетр");
		 arr[4] = new Person("Ѕорис");
		 for (int i = 0; i < arr.length; i++) {
			 try {
			int k = (int)(Math.random()*3);
			//System.out.println("¬едущий: " + arr1[k] + " " +arr[i].getname() + ". "+arr[i].getname() + " " + arr[i].getstate());
				if (arr1[k] == "пр€чешьс€" & arr[i].getstate() == "спр€талс€") {
					z[i] = false;
					continue;
				}
				else 
					z[i] = true;
				if (arr1[k] == "не пр€чешьс€" & arr[i].getstate() == "не спр€талс€") {
					z[i] = false;
					continue;
				}
				else 
					z[i] = true;
				if (arr1[k] == "молчит насчет")
					z[i] = true;
				if (arr1[k] == "пр€чешьс€" & arr[i].getstate() == "ушел домой" )
					throw new MiJeDogovarivalisDomaNePryatatsaException();
			 }
			 	catch (MiJeDogovarivalisDomaNePryatatsaException  ехс) {
			 		System.out.println("игрок " + arr[i].getname() + " играет нечестно");
			 		h = false;
			 		break;
			 }
		 }
		 if(h) {
			 for (int i = 0; i < arr.length; i++) {
				 if (z[i]) 
					 System.out.println("игрок " + arr[i].getname() + " в команде выигрывших");	 
				 else
					 System.out.println("игрок " + arr[i].getname() + " в команде проигравших");
				 
			 }
		 }
	 }
}
