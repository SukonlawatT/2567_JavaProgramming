import java.util.*;
public class Lab504 
{

	public static void main(String[] args) 
	{
		double[] inputNum = new double[5];
		double sum =0;
		double total =0;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			System.out.print("Input score of student " + (i+1) + ": " );
			inputNum[i] = scan.nextDouble();
			sum += inputNum[i];
			total = sum /5;
		}
		System.out.println();
		System.out.println("Average of 5 student is " + total);
		int studentNumber =1;
		for(double Num:inputNum)
		{
			if(Num > total)
			{
				System.out.printf("> Student %d : (%.2f)\n",studentNumber,Num);
			}
			studentNumber++;
		}
		scan.close();
	}

}
