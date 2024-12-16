import java.util.*;
public class Lab306 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Message : ");
		String message = scan.nextLine();
		
		if(message.indexOf("Nichi") >= 0)
		{
			System.out.println("Nichi is sentence");
		}
		else
		{
			System.out.println(message);
		}
		scan.close();

	}

}
