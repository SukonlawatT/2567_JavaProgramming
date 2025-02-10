
public class Theater extends Movie{
	private int theaterNO;
	
	Theater(String id,String name,Director director,int theaterNO) {
		super(id,name,director);
		this.theaterNO = theaterNO;
	}
	Theater() {
		
	}

}
