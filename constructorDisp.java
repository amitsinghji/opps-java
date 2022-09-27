package constructorDay3;

import java.util.Scanner;

class Product{
	private Long id;
	private String productName;
	private String supplierName;
	
/*default constructor - if one constructor is creted by user 
	no other default constructor autommatic created */
	
	public Product() {
		super();
	}
// parametrized constructor
	public Product(Long id, String productName, String supplierName) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	
//setters and getters to set and get the private clsss	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
//display method is used for display or flexibility of code using parent refrence 	
	void Display(Product ref) {
		System.out.println("Product id is "+ this.id);
		System.out.println("Product Name is "+ this.productName);
		System.out.println("Supplier naame is "+ this.supplierName);
		
	}

	
}

public class constructorDisp {

	public static void main(String[] args) {
		
//they are usually use for take user input from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter theproduct id ");
		Long id = sc.nextLong();
		System.out.println("Enter the product name ");
		String productName = sc.next();
		System.out.println("Enter the supplier name ");
		String supplierName = sc.next();

//calling constuctor //= it can call during execution note that
		
		Product p =new Product(id,productName,supplierName);
		p.Display(p);  // call display method
		

	}

}
