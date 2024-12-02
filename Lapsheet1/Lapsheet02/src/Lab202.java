import java.util.*;
public class Lab202 
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		int number;
		int previousNumber = Integer.MIN_VALUE;
		while(true)
		{
			System.out.print("Input number : ");
			number = scan.nextInt();
			
			if(number<previousNumber)
			{
				break;
			}
			previousNumber = number;
		}
		
		System.out.println("\nBYE BYE");
		
		scan.close();

	}

}
