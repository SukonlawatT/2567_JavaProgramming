
public class TestEmp {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		Employee1 emp2 = new Employee1();
		
		emp1.setEmployeedetails("John", 45, 20.0);
		emp2.setEmployeedetails("Jane", 38, 25.0);
		
		System.out.println("Employee 1 Details: ");
		emp1.displayEmployeeDetails();
		
		System.out.println("\nEmployee 2 Details: ");
		emp2.displayEmployeeDetails();
	}

}
