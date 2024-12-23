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

        while (true) 
        {
            System.out.print("Enter Student ID: ");
            studentID = scr.nextLine();

            System.out.print("Enter Subject Code: ");
            subjectCode = scr.nextLine();

            isStudentIDValid = isLength(studentID, 10);
            isSubjectCodeValid = isLength(subjectCode, 7);

            if (isStudentIDValid && isSubjectCodeValid) 
            {
    
                boolean isITStudent = isITStudent(studentID);
                boolean isITSubject = isITSubject(subjectCode);

           
                displayData(studentID, isITStudent, isITSubject);
                break;
            } 
            else 
            {
                System.out.println("Invalid input! Student ID must be 10 digits and "
                        + "Subject Code must be 7 digits. Please try again.");
            }
        }
        scr.close();
    }

    public static boolean isLength(String input, int requiredLength) 
    {
        return input.length() == requiredLength;
    }

    public static boolean isITStudent(String student) 
    {
     
        return student.substring(0, 2).equals("31") && student.substring(2, 5).equals("311");
    }

    public static boolean isITSubject(String subject) 
    {
        
        return subject.substring(0, 2).equals("21") && subject.charAt(4) == '1';
    }

    public static void displayData(String studentID, boolean isITStudent, boolean isITSubject) 
    {
        if (isITStudent) 
        {
            System.out.println("Student Id: " + studentID);
            System.out.println("Is 1st year student in IT");
            if (isITSubject) 
            {
                System.out.println("Enroll in courses for Year 1");
            } 
            else 
            {
                System.out.println("Not enroll in courses for Year 1");
            }
        } 
        else 
        {
            System.out.println("Student Id: " + studentID +
            "Is not 1st year student in IT");
            if (isITSubject) 
            {
                System.out.println("Enroll in courses for Year 1");
            } 
            else 
            {
                System.out.println("Not enroll in courses for Year 1");
            }
        }
    }
}