package builderPattern;

public class Pepsi extends CoolDrinks{

	public String name = "Pepsi";
	public int price = 69;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public Additional addType() {
		// TODO Auto-generated method stub
		return new DrinksWithoutIce();
	}

}
