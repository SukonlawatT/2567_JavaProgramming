import java.util.*;
public class TestProductInput 
{
	public static void main(String[] args) 
	{
		
	  Scanner scan = new Scanner(System.in);
	  
	  Product pd1 = new Product();
	  
	 
	  System.out.print("Enter product name: ");
	  String pdName1 = scan.nextLine();
	  
	  System.out.print("Enter product price: ");
	  double pdPrice1 = scan.nextDouble();
	  
	  System.out.print("Enter VAT rate (%): ");
	  double pdvatRate1 = scan.nextDouble();
	  
	  pd1.setProductDetails(pdName1, pdPrice1, pdvatRate1);
	  
	  System.out.println("\nProduct Details: ");
	  pd1.displayProductDetails();
	}
	
}
