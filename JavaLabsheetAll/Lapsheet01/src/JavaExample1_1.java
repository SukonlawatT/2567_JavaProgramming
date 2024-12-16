import java.util.*;
public class JavaExample1_1 {

	public static void main(String[] args) 
	{
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter your first namefusing next(using next): ");
		String firstName = input.next();
		input.nextLine();
		
		System.out.print("Enter your last namefusing next(using next): ");
		String lasttName = input.next();
		
		System.out.println("\n----------output----------");
		System.out.println("First Name: " + firstName);
		System.out.println("last Name: " + lasttName);
		
		
		input.close();
	}

}
