import javax.swing.*;

public class Lab206 
{

	public static void main(String[] args) 
	{
		  final int VANILLA = 10;
	        final int CHOCOLATE = 15;
	        final int TOPPING = 5;

	        int flavorPrice = 0;
	        String flavorName = "";

	       
	        while (true) 
	        {
	            String input = JOptionPane.showInputDialog(null, 
	                    "[1] Vanilla Flavor 10 B.\n[2] Chocolate Flavor 15 B.\nPress number to choose flavor:",
	                    "Input", JOptionPane.QUESTION_MESSAGE);

	            if (input == null) 
	            { 
	                JOptionPane.showMessageDialog(null, "Operation cancelled.", "Info", JOptionPane.INFORMATION_MESSAGE);
	                return;
	            }

	            if (input.equals("1")) 
	            {
	                flavorPrice = VANILLA;
	                flavorName = "Vanilla";
	                break;
	            } 
	            else if (input.equals("2")) 
	            {
	                flavorPrice = CHOCOLATE;
	                flavorName = "Chocolate";
	                break;
	            }
	            else 
	            {
	                JOptionPane.showMessageDialog(null, 
	                        "ERROR: Wrong choice! Try again...", 
	                        "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }

	       
	        int toppingChoice = JOptionPane.showConfirmDialog(null, 
	                "Do you want to add topping?", 
	                "Topping", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

	        boolean addTopping = (toppingChoice == JOptionPane.YES_OPTION);
	        int totalPrice = flavorPrice + (addTopping ? TOPPING : 0);

	        
	        String toppingText = addTopping ? "With topping" : "No topping";
	        JOptionPane.showMessageDialog(null, 
	                "You chose " + flavorName + " Flavor\n" + 
	                toppingText + "\nTotal price = " + totalPrice + " baht.", 
	                "Message", JOptionPane.INFORMATION_MESSAGE);
	     }
  
}
