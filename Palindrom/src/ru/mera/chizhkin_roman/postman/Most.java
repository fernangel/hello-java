package ru.mera.chizhkin_roman.postman;

public class Most {
	 public static void main(String args[]) {
		 int [] arr = {3,1,1,1,1,3};
		 boolean x = true;
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] != arr[arr.length-i-1]) 
				 x = false;
	        }
		 if (x)
			System.out.println("Это палиндром.");
		 else
			System.out.println("Это не палиндром.");
	}
}
