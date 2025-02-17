import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input movie id    : ");
		String Id = scan.nextLine();
		
		System.out.print("Input movie name  :");
		String ipName = scan.nextLine();
		
	    System.out.println();
	    
	    System.out.print("Input director name    : ");
	    String dtName = scan.nextLine();
	    System.out.print("Input director e-mail  : ");
	    String dtEmail = scan.nextLine();
	   
	    char gender;
	    System.out.print("Input director gender : ");
	    gender = scan.next().charAt(0);

	    while ("MFmf".indexOf(gender) == -1) { 
	        System.out.print("Input director gender, again : ");
	        gender = scan.next().charAt(0);
	    }

	    gender = Character.toUpperCase(gender); 

        
        System.out.println();
        
        int theaterNo;
        System.out.print("Input movie theater no.   : ");
        theaterNo = scan.nextInt();
        while (true) {
        	if (theaterNo >= 1 && theaterNo <= 15) {
        		break;
        	}
        	else {
        		System.out.print("Please input 1 - 15 only : ");
        		theaterNo = scan.nextInt();
        	}
        }
        
        System.out.println();
        
        Director director = new Director(dtName, dtEmail, gender);
        Theater theater = new Theater(Id,ipName,director,theaterNo);
        
        System.out.println( theater.toString());

        scan.close();
	}

}