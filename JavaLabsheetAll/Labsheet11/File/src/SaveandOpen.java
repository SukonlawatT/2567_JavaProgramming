import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		
		Scanner console = new Scanner (System.in);
		PrintStream writeFile = new PrintStream(new File("src//txtFile//employee.txt"));
		
		String answer;
		do {
			super.header();
			System.out.print("Enter name: ");
			name = console.next();
			System.out.print("Enter department: ");
			dept = console.next();
			
			writeFile.println(name + "\t" + dept);
			
			System.out.print("Enter data again?: ");
			answer = console.next();
		}while(answer.equalsIgnoreCase("y"));
	}
	public void searchData() {
		try {
			// อ่านข้อมูลจากไฟล์โดยใช็ไฟล์ class scanner
			Scanner readFile = new Scanner(new File("src//txtFile//employee.txt"));
			int i = 0; //นับจำนวนพนักงานในไฟล์
			boolean check = false;
			super.header(); //เรียกใช้เมธอด header จาก superclass
			//ใช้ while() อ่านข็อมูลจากไฟล์ 
			
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next(); //ตัวแปร dept ในไฟล์
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i + ")" + name);
					check = true;
				}
			}
			if(check) {  //ถ้าค้นหาข้อมูลแผนกพบ
				super.header();
				System.out.println("Employee in dept " + super.getDept()+ " is "+
						i + " person(s)");				
				super.header();
			} else { //ถ้าค้นหาข้อมูลแผนกไม่พบ
				System.out.print("\nSorry, no dept: " + super.getDept() + " in file");						
			}	
		}catch(IOException e) {
			System.out.print("\nSorry, file not found...");
		}
		
	}

}
