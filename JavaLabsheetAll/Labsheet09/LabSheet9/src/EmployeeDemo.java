import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input employee id: ");
		String empId = scan.next();
		scan.nextLine();
		System.out.print("Input employee name: ");
		String empName = scan.nextLine();
		System.out.print("INput employee salary: ");
		double empSalary = scan.nextDouble();
		System.out.print("Input employee sales: ");
		double empsales = scan.nextDouble();
		
		Sales emp9 = new Sales(empId,empName,empSalary,empsales);
		System.out.println(emp9);
		
		System.out.println("Total salary " +
		(emp9.getSalary() + emp9.getCommission() + "baht."));
	}

}
