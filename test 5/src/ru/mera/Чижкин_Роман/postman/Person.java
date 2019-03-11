package ru.mera.Чижкин_Роман.postman;
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
		arr[0].toString("Герман", "Лодочкин");
		arr[1].toString("Владимир", "Чудиков");
		arr[2].toString("Иннокентий", "Бочкин");
		arr[3].toString("Петр", "Бессмертных");
		arr[4].toString("Борис", "Ельцин");
		((Artist) arr[0]).setstyle("гуашь");
		((Musician) arr[1]).setInstrument("гитаре");
		((Musician) arr[2]).setInstrument("баяне");
		((Artist) arr[3]).setstyle("акварель");
		((Artist) arr[4]).setstyle("пастель");
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


	