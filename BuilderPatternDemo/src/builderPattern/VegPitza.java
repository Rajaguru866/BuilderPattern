package builderPattern;

public class VegPitza extends Pitza{

	public String name = "Veg-Paradise";
	public int price = 399;
	
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
		
		return new ChilliToppings();
	}

	
}
