package builderPattern;

public class Customer {
	
	private String customerName;
	private String email;
	private long mobNo;
	private String currency;
	private String address;
	private Customer(CustomerBuilder builder) {
		this.customerName = builder.customerName;
		this.email = builder.email;
		this.mobNo = builder.mobNo;
		this.currency = builder.currency;
		this.address = builder.address;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", email=" + email + ", mobNo=" + mobNo + ", currency="
				+ currency + ", address=" + address + "]";
	}


	public static class CustomerBuilder{
		
		private String customerName;
		private String email;
		private long mobNo;
		private String currency;
		private String address;
		
		public CustomerBuilder (String customerName, String email, long mobNo) {
			
			this.customerName = customerName;
			this.email = email;
			this.mobNo = mobNo;
		}
				
		public CustomerBuilder Currency(String currency) {
			this.currency = currency;
			return this;
		}
		
		public CustomerBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Customer build()
		{
			Customer cust = new Customer(this);
			return cust;
		}
		
	}
	

}
