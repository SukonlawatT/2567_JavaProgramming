import java.util.*;
public class Lab502 {

	public static void main(String[] args) 
	{
		int nums[] = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<5; i++)
		{
			System.out.print("Input number "+(i+1) +": ");
			nums[i] = scan.nextInt();
		}
		System.out.println();
		
		System.out.println("Summation of positive number is "+(sumOfPos(nums)));
		
		scan.close();
	}
	public static int sumOfPos(int[] nums)
	{
		int sum =0;
		for (int num : nums)
		{
			if(num >0)
			{
				sum += num;
			}
		}
		return sum;
	}

}