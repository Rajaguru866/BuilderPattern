package builderPattern;

public class BuilderMain {

	public static void main(String[] args) {
		
		Meal vegMeal = MealBuilder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println("Total price is " + vegMeal.getPrice());
		
		Meal nonVegMeal = MealBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println("Total price is " + nonVegMeal.getPrice());	
		
	}

}
