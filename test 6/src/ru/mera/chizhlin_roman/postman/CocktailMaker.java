package ru.mera.chizhlin_roman.postman;
	abstract public class CocktailMaker {
		CocktailMaker arr[];
		abstract String liquid();
		abstract String mainIngredient();
		abstract String toping();
		public void mix() {
			liquid();
			mainIngredient();
			toping();
			System.out.println("Cмешиваю " +liquid() + " c " + mainIngredient() + " и добавл€ю сверху " + toping());
		}
		
}
	