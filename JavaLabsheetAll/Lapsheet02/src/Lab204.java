import java.util.*;
public class Lab204 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input valueof X : ");
		int X = scanner.nextInt();
		int Y = 0;
		
		do
		{
			System.out.print("Input value of Y : ");
			Y  = scanner.nextInt();
		}while(Y<X);
		System.out.println();
		int sum = X;
		for (int i = X; i<Y; i++)
		{
			System.out.println(sum + " + " + (X+1) + " = " + (sum + (X+1)));
			sum += ++X;
		}
		scanner.close();

	}

}
