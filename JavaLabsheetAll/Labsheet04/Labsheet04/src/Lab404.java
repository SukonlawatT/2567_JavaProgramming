import java.util.*;
public class Lab404 
{

	public static void main(String[] args) 
	{
		inputStudent();
	}

	public static void inputStudent() 
	{
		Scanner scr = new Scanner(System.in);
		boolean isStudentIDValid, isSubjectCodeValid;
		String studentID, subjectCode;
		
		while(true)
		{
		
		System.out.print("Enter Student Id: ");
		studentID = scr.nextLine();
		
		System.out.print("Enter Subject code (7 digits): ");
		subjectCode = scr.nextLine();
		
		isStudentIDValid   = isLength(studentID, 10);
	    isSubjectCodeValid = isLength(subjectCode, 7);
	    }
		if(isStudentIDValid && isSubjectCodeValid) {
        	//Check student details
        	boolean isITStudent = isITStudent(studentID);
        	boolean isITSubject = isITSubject(subjectCode);
        	
        	//Display data
        	displayData(isITStudent, isITSubject);
        	break;            	     	
        }else {
        	System.out.println("Invalid input! Student ID must be 10 digits and "
        			+ "Subject Code must be 7 digits");
        }
    }
	public static boolean isLength(String inputID, int requiredLength)
	{
		return inputID.length() == requiredLength;
	}
	public static boolean isITStudent(String student)
	{
		if( student.substring(3,5) == "311")
			
		
	}
	public static boolean isITSubject(String subject)
	{
		if(subject.substring(0,1) == "21" && subject.substring(4) == "1")
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void displayData()
	{
		
	}
	

}
