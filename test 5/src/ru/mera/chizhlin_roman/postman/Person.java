package ru.mera.chizhlin_roman.postman;
public class Person {
	private String name, surname; 
	public Person(String n, String sur) {
		name = n;
		this.surname = sur;
	}
	public static void main(String[] args) {		
	Person [] arr = new Person[5];
	arr[0] = new Artist("Герман", "Лодочкин", "гуашь");
	arr[1] = new Musician("Владимир", "Чудиков", "гитаре");
	arr[2] = new Musician("Иннокентий", "Бочкин", "баяне");
	arr[3] = new Artist("Петр", "Бессмертных", "акварель");
	arr[4] = new Artist("Борис", "Ельцин", "пастель");
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Artist) {
				System.out.println(arr[i].name + " " + arr[i].surname + " рисует в стиле " +((Artist) arr[i]).getstyle());
			}
			else {
				System.out.println(arr[i].name + " " + arr[i].surname + " играет на " + ((Musician) arr[i]).getInstrument() );
			}
		}
	}
}


	