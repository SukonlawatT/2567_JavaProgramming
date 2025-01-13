import java.util.Scanner;	
public class Lab503 {
	public static void main(String[] args) {
        
        int[] numbers = new int[7];
        Scanner scanner = new Scanner(System.in);
        
       
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Input number %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }
        
        
        int oddCount = 0;
        String oddNumbers = ""; 
        
       
        for (int num : numbers) {
            if (num % 2 != 0) { 
                oddCount++;
                oddNumbers += num + " "; 
            }
        }
        
        
        System.out.println("");
        System.out.println("There are " + oddCount + " odd number(s). ");
        System.out.println("List of odd number(s): " + oddNumbers.trim());
        
        scanner.close(); 
    }
}
