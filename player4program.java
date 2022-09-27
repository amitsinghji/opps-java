package constructorDay3;

import java.util.Scanner;

class Player{
	private String name;
	private int age;
	private String country;
	
//default and parameterized constructor created	
	public Player() {
		super();
	}

	public Player(String name, int age, String country) {
		super();
		this.name = name;   // instance(this) = local variables
		this.age = age;
		this.country = country;
	}
	
//setters and getters to operate private specifiers
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}	

public String toString() {
	String res ="";
	res = "Name:"+this.name +" Age:"+this.age+" Country:"+this.country;
	
	return res;
}
}

public class player4program {

	public static void main(String[] args) {
		
//taking keyboard input 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name ");
		String name = sc.next();
		
		System.out.println("Enter Age ");
		int age = sc.nextInt();
		
		System.out.println("Enter country ");
		String country = sc.next();
		
		
		Player pl = new Player(name,age,country);  //parametrized constructor call
		
		System.out.println(pl.toString());   //calling and printing toString 
		

	}

}
