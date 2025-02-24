public class Coffee extends Drink{
	private int typeCoffee;
	private char sizecoffee;
	private Barista barista;
	
	Coffee (int type,char sizecoffee,int typecoffee,Barista barista) {
		super(type,sizecoffee);
		this.sizecoffee = sizecoffee;
		this.typeCoffee = typecoffee;
		this.barista = barista;
		
	}
	Coffee (int type, int typeCoffee) {
		 super(type, 'S'); 
	        this.typeCoffee = typeCoffee;
	        this.sizecoffee = '0'; 
	        this.barista = new Barista("Unknown", ' ');
	}
	Barista getbarista() {
		return barista;
	}
	String getTypeName() {
		switch (typeCoffee) {	
		case(1): return "Americano";
		case(2): return "Espresso";
		case(3): return "Cappuccino";
		default: return null;
		}
	}
	int getTypePrice() {
		switch (typeCoffee) {
		case(1): return 50;
		case(2): return 55;
		case(3): return 65;
		default : return 0;
		}
	}
	String getSizeName() {
		switch(Character.toUpperCase(sizecoffee)) {
		case('S'): return "Short";
		case('T'): return "Tall";
		case('G'): return "Grande";
		case('V'): return "Venti";
		default: return null;
		}
	}
	int getSizePrice() {
		switch(Character.toUpperCase(sizecoffee)) {
		case('S'): return 100;
		case('T'): return 150;
		case('G'): return 200;
		case('V'): return 250;
		default: return 0;
		}
	}
	int getTotalPrice() {
		return super.getTypePrice() + getTypePrice() + getSizePrice();
	}
	public String toString() {
        return super.getTypeName() + " " + getTypeName() + " (" + getSizeName() + ") is " + getTotalPrice() + " baht.";
    }
}