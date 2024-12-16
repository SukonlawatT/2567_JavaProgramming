import java.util.*;
public class Lab403 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String fullName;
		String firstName;
		
		System.out.println("Please enter your name, separated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' '); //ค้นการเคาะ space
		firstName = fullName.substring(0,space); //จะได้ชื่อในตัวแปรแรก
		
		System.out.println(abbreviatName(fullName)+firstName);
		
		input.close();

	}
	
	public static String abbreviatName(String fullName)
	{
		String initialLetter="";
		
		for(int i=0;i<fullName.length();i++)
		{
			if(fullName.charAt(i)==' ')
			{
				initialLetter = (initialLetter+fullName.charAt(i+1)).toUpperCase();
				initialLetter = initialLetter+".";
			}
		}
		return initialLetter;
	}

}
