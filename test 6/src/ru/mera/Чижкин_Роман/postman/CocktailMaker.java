package ru.mera.Чижкин_Роман.postman;
	abstract public class CocktailMaker {
		CocktailMaker arr[];
		abstract String liquid();
		abstract String mainIngredient();
		abstract String toping();
		public void mix() {
			liquid();
			mainIngredient();
			toping();
			System.out.println("Cмешиваю " +liquid() + " c " + mainIngredient() + " и добавляю сверху " + toping());
		}
		
}
	