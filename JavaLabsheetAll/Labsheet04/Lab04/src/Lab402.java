import javax.swing.*;
public class Lab402 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog(null, "Input year: ", "Input" ,JOptionPane.QUESTION_MESSAGE);
		int Year = Integer.parseInt(input);
		  if(!cheakYear(Year))
		  {
			JOptionPane.showMessageDialog(null, Year + " is Leap Year.");
		  }
		  else 
		  {
			  if(isLeapYear(Year)) 
			  {
				JOptionPane.showMessageDialog(null, Year + " is Leap Year.");
			  }
			  else
			  {
				JOptionPane.showMessageDialog(null, Year + " is NOT Leap Year.");
			  }
		  }
		  
	}
	public static boolean isLeapYear(int year)
	{
		if(year %4 == 0)
		{
			if(year %100 == 0)
			{
				return year %400 == 0;
			}
			return true;
		}
		return false;
	}
	public static boolean cheakYear(int year) 
	{
		return year >= 1000 && year <= 3000; 
	}

}