import javax.swing.*;
public class Lab501 
{

	public static void main(String[] args) 
	{
		int[] idProduct = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] priceProduct = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		
		double itemPrice =0;
		boolean validItem = false;
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter item number to order" ,"Input", JOptionPane.QUESTION_MESSAGE));
		for (int i=0; i< idProduct.length; i++)
		{
			if(itemOrder == idProduct[i])
			{
				itemPrice= priceProduct[i];
				validItem = true;
			}
		}
		if(validItem)
		{
			JOptionPane.showMessageDialog(null, "Item" + priceProduct + "is" + itemOrder);
			System.out.print("Item" + priceProduct + "is" + itemOrder);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Item");
			System.out.print("Invalid Item");
		}

	}

}
