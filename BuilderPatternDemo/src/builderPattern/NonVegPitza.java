package builderPattern;

public class NonVegPitza extends Pitza{


	public String name = "Chicken-Tika";
	public int price = 449;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price
				;
	}

	@Override
	public Additional addType() {
		// TODO Auto-generated method stub
		return new PepperToppings();
	}

	
}
