import java.util.*;
public class testEmployeeinput 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		Employee1 emp1 = new Employee1();
		Employee1 emp2 = new Employee1();
		
		System.out.println("Enter details for Employee 1: ");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		
		System.out.print("Hours Worked: ");
		int empHoursWorked1 = scan.nextInt();
		
		System.out.print("Hourly Rate: ");
		double empHourlyRate1 = scan.nextDouble();
		
		emp1.setEmployeedetails(empName1, empHoursWorked1, empHourlyRate1);
		
		System.out.println("\nEmployee 1 Details: ");
		emp1.displayEmployeeDetails();
		
		scan.nextLine();
		
		System.out.println("\nEnter details for Employee 2: ");
		
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		
		System.out.print("Hours Worked: ");
		int empHoursWorked2 = scan.nextInt();
		
		System.out.print("Hourly Rate: ");
		double empHourlyRate2 = scan.nextDouble();
		
		emp2.setEmployeedetails(empName2, empHoursWorked2, empHourlyRate2);
		
		System.out.println("\nEmployee 1 Details: ");
		emp2.displayEmployeeDetails();
	}

}
