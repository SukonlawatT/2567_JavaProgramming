import java.util.*;
import java.text.*;
public class Lab209 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; 
		 final double BASE_SALARY = 1000.0;
		
		 int sales; 
		 double salary; 
		 
		 while(true)
		 {
		 System.out.print("Enter sales in dollars (or -1 to end):");
	     sales = scanner.nextInt();
	     if(sales == SENTINEL)
	     {
	    	 System.out.println("bye");     
	    	break; 
		 }
	     salary = BASE_SALARY + (sales * COMMISSION_RATE);
		 System.out.println("Salary is: $" +  frm.format(salary));
		 }
		 
		 scanner.close();
		}

}


