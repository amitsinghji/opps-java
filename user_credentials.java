package constructorDay3;

class User{
	private Integer id;
	private String username;
	private String password;

//constructors	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

//getter and setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
class UserBO {
	public User[] getUsers() {
		 User [] users = new User[5];
//predefiner users with (object array)	   
		users[0]=  new User(1, "Louis", "bcdefgh123");
		users[1]=  new User(2, "Messie", "hpphmf1.");
		users[2]=  new User(3, "Steve", "opefKt");
	    users[3]=  new User(4, "Kallis", "23456778");
		users[4]=  new User(5, "Wipro", "A$%");
		
		return users;
	}
	


private String encryptpassword (String password) {
	String res ="";
	 for (int i = 0; i<password.length(); i++) {
		 res = res + (char)(password.charAt(i)+1);
	 }
	return res;

}
	
}





public class user_credentials {

	public static void main(String[] args) {
	  
	   

	}

}
