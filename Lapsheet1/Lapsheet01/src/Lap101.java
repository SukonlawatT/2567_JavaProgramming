import java.util.*;
public class Lap101 {
	public static void main(String[] args)
	{
		Scanner scan  = new Scanner(System.in);
		System.out.print("Input Produce Name   : ");
		String productName  = scan.nextLine();
	    System.out.print("Input Unit Name      :  ");
		int unitName = scan.nextInt();
		System.out.print("Input Price per unit : ");
		float PriceperUnit = scan.nextFloat();
		System.out.println("---------------------------------------------------");
		float totalPrice = unitName * PriceperUnit;
		System.out.print("Total Price is : " + totalPrice + " baht.");
		System.out.println("---------------------------------------------------");
		System.out.print("How many discount (%) : ");
		float Discount = scan.nextFloat();
		System.out.println("---------------------------------------------------");
		float totalDiscount = totalPrice + (totalPrice * Discount/100);
		//System.out.printl("Discount form " + Discount% + );
		System.out.println("Amount to be paid      " + totalDiscount + " baht.");
		
		scan.close();

	}

}
