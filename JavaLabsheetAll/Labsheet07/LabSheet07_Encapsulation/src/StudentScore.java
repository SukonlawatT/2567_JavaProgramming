import java.util.*;
public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students in classroom : ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student();

            System.out.println("\nINPUT INFORMATION OF STUDENT " + (i + 1));
            System.out.println("----------------------------------------------------");
            System.out.print("Input student name: ");
            String name = scanner.nextLine();
            students[i].setName(name);

            int score;
          
            while (true) 
            { 
            	System.out.print("Input student score: ");
                score = scanner.nextInt();
                scanner.nextLine();

                students[i].setScore(score);
                if (students[i].checkScore()) 
                {
                	 break ;
                }
                else 
                {
                    System.out.print("Input score, again : ");
                    score = scanner.nextInt();
                }
            }
        }

        System.out.println("\nLIST OF PASS STUDENTS (>= 50)");
        for (Student student : students) {
            if (student.isPass()) {
                System.out.println(">> " + student.getName() + " (" + student.getScore() + ") get grade " + student.findGrade());
            }
        }

        scanner.close();
    }
}
