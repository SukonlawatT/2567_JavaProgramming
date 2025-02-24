
public class Drink {
	private int type;
	private char size;
	
	Drink(int type, char size) {
		this.type = type;
		this.size = size;
	}
	Drink() {
		this(0,'s');
	}
	String getTypeName() {
		if(type ==1) {
			return "Hot";
		}else if(type == 2) 
			return "Cold";
		    return null;
		
	}
	int getTypePrice() {
		if(type ==1) {
			return 10;
		}else if(type == 2) 
			return 20;
		    return 0;
	}
	String getSizeName() {
		if(size == 's' || size == 'S') {
			return "Small";
		}else if(size == 'm' || size == 'M') {
			return "Medium";
		}else if(size == 'l' || size == 'L') 
			return "Large";
		return null;
	}
	int getSizePrice() {
		if(size == 's' || size == 'S') {
	        return 15;
	    }else if(size == 'm' || size == 'M') {
	        return 20;
	    }else if(size == 'l' || size == 'L') {
	        return 25;
	    }
	    return 0;
	}
	int getTotalPrice() {
		return getTypePrice() + getSizePrice();
	}
}