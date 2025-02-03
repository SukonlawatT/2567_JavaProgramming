import java.util.*;
public class TsetStudent 
{

	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many student in classroom : ");
		int numberofStudent = scan.nextInt();
		
		Student[] students = new Student[numberofStudent];
		scan.nextLine();
		
		for(int i=0; i < numberofStudent ; i++)
		{
			students[i] = new Student();
			System.out.println("\nINPUT INFORMATOIN OF STUDENT " + (i+1));
			System.out.println("-----------------------------------------------------------------");
			System.out.print("Input student name : ");
			/*String studentName = scan.nextLine();*/
			students[i].setName(scan.nextLine());
			
			System.out.print("Input student score : ");
			int studentScore = scan.nextInt();
			students[i].setScore(studentScore);
			scan.nextLine();
			
			while(!students[i].cheakScore())
			{
				System.out.print("Input score, again : ");
				studentScore = scan.nextInt();
				students[i].setScore(studentScore);
			}
		}
		System.out.println("\nLIST OF PASS STUDENT ( >= 50)");
		System.out.println("-----------------------------------------------------------------");
		for(Student student : students)
		{
			System.out.println(">> "+student.getName()+" ("+student.getScore()+") get grade "+findGrade(student.getScore()));
		}
		scan.close();
		
	}
	public String findGrade(int studentScore) 
	{
        if (studentScore >= 80) {
        	return "A";
        }
        if (studentScore >= 75) {
        	return "B+";
        }
        if (studentScore >= 70) {
        	return "B";
        }
        if (studentScore >= 65) {
        	return "C+";
        }
        if (studentScore >= 60) {
        	return "C";
        }
        if (studentScore >= 55) {
        	return "D+";
        }
        if (studentScore >= 50) {
        	return "D";
        }
        return "F";
	}
	
}
