package abstractClass;

public abstract class Amazon {
	
	public void signup(String UserName, String Password) {
		
		System.out.println("Username- " + UserName );
		System.out.println("Password- " + Password);
		System.out.println("Click a Signup Button");
		
	}
	public void loginpage(String Name, String Password, String PhoneNumber) {
		
		System.out.println("Name- " + Name );
		System.out.println("Password- " + Password);
		System.out.println("PhoneNumber- " + PhoneNumber);
		System.out.println("Click a Login Button");
		
	}
	abstract public void SearchProduct(String ProductName);
	
	abstract public void AddtoCart(String ProductName, int Quantity, String Colour);
	
	abstract public void CheckOutProduct();	
}
