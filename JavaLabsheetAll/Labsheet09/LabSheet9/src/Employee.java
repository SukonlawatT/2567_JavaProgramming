
public class Employee {
	private String id;
	private String name;
	private double salary;
	
	Employee(String id,String name,double slary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	Employee(String id,String name) {
		this.id = id;
		this.name = name;
		this.salary =0;
		/*this(id,name,0);*ใช้ได้ต่อเมื่อมีครบ3ตัวข้างบน*/
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getSalary() {
		return this.salary;
	}
}
