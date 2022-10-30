public class Customer {
	String name;
	String postalCode;
	
	
	public Customer(String name, String postalCode) {
		this.name = name;
		this.postalCode = postalCode;
	}


	public String getPostalCode() {
		return postalCode;
	}
}
/** Customer has little in common to Stuff, so to avoid
 * unnecessary errors down the line, we segregate this
 * class from all the other classes as later on, we may
 * need to add methods to subclasses of stuff that don't 
 * apply to Customer, such as getPrice(). 
