import javax.swing.JOptionPane;
import java.util.*;
public class Lab508 
{

	public static void main(String[] args) 
	{

		String index ;
		int[] nums = {25, 78, 41, 22, 36, 85, 37 };
		while(true)
		{
		index = JOptionPane.showInputDialog(null, "Input index of array","Input",JOptionPane.QUESTION_MESSAGE);
		
		if(checkIndex(nums, index)) 
		{
			break;
		}
		else
		{
			
		}
		}
	}
	public static boolean checkIndex(int[] nums, int index) 
	{
		return index >= 0 && index < nums.length;
	}
	public static int currentData() 
	{
		
	}
	public static int prevData()
	{
		
	}
	public static int nextData()
	{
		
	}

}
