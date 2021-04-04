package builderPattern;

public class MealBuilder {
	
	public static Meal prepareVegMeal()
	{
		Meal meal = new Meal();
		meal.addItem(new VegPitza());
		meal.addItem(new Coke());
		return meal;
	}
	public static Meal prepareNonVegMeal()
	{
		Meal meal = new Meal();
		meal.addItem(new NonVegPitza());
		meal.addItem(new Pepsi());
		return meal;
	}


	
}
