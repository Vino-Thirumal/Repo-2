
package abstractClass;

public class SuperAmazon extends Amazon {
	 
	public void SearchProduct(String ProductName) {    //@override
		
		System.out.println("SearchProduct- " + ProductName);
	}
	
	 public void AddtoCart(String ProductName, int Quantity, String Colour) {   //@override
		
      System.out.println("AddtoCart- " + ProductName +" " + Quantity + " " + Colour   );
	 }
	 
	 public void CheckOutProduct() {      //@override
		 
		 System.out.println("CheckOutProduct");
	 }
		 
	 }
