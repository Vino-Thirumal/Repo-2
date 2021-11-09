package abstractClass;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			SuperAmazon Ragul = new SuperAmazon();
			
			Ragul.signup("Ragul", "ragul123@gmail.com");
			Ragul.loginpage("Ragul", "ragul123@gmail.com", "8110083626");
			Ragul.SearchProduct("pen");
			Ragul.AddtoCart("Pen", 10, "yellow");
			Ragul.CheckOutProduct();					
}
}
