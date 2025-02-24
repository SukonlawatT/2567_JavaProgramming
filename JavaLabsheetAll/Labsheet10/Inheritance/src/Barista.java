
public class Barista {
	
	private String name;
	private char gender;
	
	Barista(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	Barista() {
		this("",'0');
	}
	String getName() {
		return this.name;
	}
	String getGenderName() {
		if(gender == 'M') {
			return "Male";
		}
		else if(gender == 'F') 
			return "Female";
		return "spacebar";
	}
}