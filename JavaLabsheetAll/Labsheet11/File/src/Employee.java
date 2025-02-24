
public class Employee {

	private String dept;
	
	void setDept(String dept) {
		this.dept = dept;
	}
	String getDept() {
		return this.dept;
	}
	void header() {
		for(int i =0; i<50 ; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
