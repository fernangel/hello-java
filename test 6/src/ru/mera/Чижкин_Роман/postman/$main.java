package ru.mera.������_�����.postman;

public class $main {
	public static void main(String[] args) {
	CocktailMaker arr[] = new CocktailMaker[3];
	arr[0] = new Banana_Milk_ice_cream();
	arr[1] = new Vodka_slivki_vishna();
	arr[2] = new margarita();
	for (int i = 0; i < arr.length; i++) {
		arr[i].mix();
		}
	}
}