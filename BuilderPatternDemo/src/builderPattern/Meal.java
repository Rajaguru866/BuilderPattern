package builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	public List<Items> items = new ArrayList<Items>();
	
	public void addItem(Items item)
	{
		items.add(item);
	}
	public int getPrice()
	{
		int price = 0;
		for(Items item : items)
		{
			price = price + item.getPrice();
		}
		return price;
	}
	public void showItems()
	{
		for(Items item : items)
		{
			System.out.println("Ordered " + item.getName() + " " + item.addType().gettype() + " costs " + item.getPrice());
		}
	}
	

}
