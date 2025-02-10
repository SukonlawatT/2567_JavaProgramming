import java.util.*;
public class CheckStockProduct 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many product list in stock : ");
		int numStock = scan.nextInt();
		
		Product[] productList = new Product[numStock];
		System.out.println();
		
		for(int i=0; i<numStock;i++) 
		{
			System.out.print("Input product Id : ");
			String Id = scan.next();
			System.out.print("Input product Unit : ");
			int Unit = scan.nextInt();
			System.out.println();
			
			productList[i] = new Product(Id, Unit, 0);
		}
		System.out.println("---------------------------------------------------");
		System.out.println("List product in 'LOW' status.");
		System.out.println("---------------------------------------------------");
		for(int i=0; i<numStock; i++)
		{
			if(productList[i].getUnit() < 5)
			{
				System.out.println(">> "+productList[i].getId()+" has "+productList[i].getUnit()+" units");
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("List product in 'NORMAL' status.");
		System.out.println("---------------------------------------------------");
		for(int i=0; i<numStock; i++)
		{
			if(productList[i].getUnit() >= 5 && productList[i].getUnit() <= 50)
			{
				System.out.println(">> "+productList[i].getId()+" has "+productList[i].getUnit()+" units");
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("List product in 'HIGH' status.");
		System.out.println("---------------------------------------------------");
		for(int i=0; i<numStock; i++)
		{
			if(productList[i].getUnit() > 50)
			{
				System.out.println(">> "+productList[i].getId()+" has "+productList[i].getUnit()+" units");
			}
		}
	}
	

}
