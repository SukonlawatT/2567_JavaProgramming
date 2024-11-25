import java.awt.JobAttributes;

import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) 
	{
		String productName = JOptionPane.showInputDialog("Input Product Name: ");
		String productUnitStr = JOptionPane.showInputDialog("Input Product Unit: ");
		int productUit = Integer.parseInt(productUnitStr);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit: "));

        double totalPrice = productPrice * productUit;
        
        String frmTotalPrice = String.format("%,.2f", totalPrice);
        double totalVat = totalPrice + (totalPrice * 7/100);
        JOptionPane.showMessageDialog(null, "total Price is " + frmTotalPrice + " baht.\n" + "Add VAT is " + totalVat + " baht.");
        
      
	}

}
