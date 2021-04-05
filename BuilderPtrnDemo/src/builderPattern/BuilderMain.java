package builderPattern;

import builderPattern.Customer.CustomerBuilder;

public class BuilderMain {

	public static void main(String[] args) {
		
		Customer cust1 = new CustomerBuilder("Rajaguru", "rajagurudemo@gmail.com", 1234567890).Currency("INR").build();
		System.out.println(cust1);
		Customer cust2 = new CustomerBuilder("Rajaguru", "rajagurudemo@gmail.com", 1234567890).build();
		System.out.println(cust2);
		
	}

	
}
