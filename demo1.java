package constructorDay3;

import java.util.Scanner;

class Customer{
	private String customerName;
	private String customerEmail;
	private String customerType;
	private String customerLocation;
	
//these are constructors	
	public Customer() {
		super();
	}
	public Customer(String customerName, String customerEmail, String customerType, String customerLocation) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerType = customerType;
		this.customerLocation = customerLocation;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}


	public void display(Customer ref) {
		System.out.println("name: "+this.customerName);
		System.out.println("Email: "+this.customerEmail);
		System.out.println("Type: "+this.customerType);
		System.out.println("Location: "+ this.customerLocation);
	}

}
public class demo1 {

	public static void main(String[] args) {
		
//take user input to set data		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the customer Details -");
		System.out.println("Enter the Name ");
		String name = sc.next();
		
		System.out.println("Enter the Email ");
		String email = sc.next();
		
		
		System.out.println("Enter the Type");
		String type = sc.next();
		
		
		System.out.println("Enter the Location");
		String location = sc.next();
		
//call parametrized constructor ((without using display method))
		
		Customer c = new Customer(name,email,type,location);
		
//		System.out.println("name: "+c.getCustomerName());
//		System.out.println("Email: "+c.getCustomerEmail());
//		System.out.println("Type: "+c.getCustomerType());
//		System.out.println("Location: "+c.getCustomerLocation());
		
		
		c.display(c);
		
	}}
		
