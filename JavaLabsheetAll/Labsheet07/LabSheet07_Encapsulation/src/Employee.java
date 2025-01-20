
public class Employee 
{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	Employee(int Id, String ftn,String ltn, int slr)
	{
		id = Id;
		firstName = ftn;
		lastName = ltn;
		salary = slr;
	}
	public int getId()
	{
		return this.id;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public String getName()
	{
		return "firstName  lastName";
	}
	public int getSalary()
	{
		return this.salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getAnnualSalary()
	{
		return salary * 12;
	}
	public int raiseSalary(int percent)
	{
			this.salary = this.salary + (this.salary * percent/ 100);
			return this.salary;
	}
	public String toString()
	{
		return "Employee[id= " + this.id + "name= " + this.firstName + this.lastName + "," + "salary= " + this.salary + "]";
	}
}
