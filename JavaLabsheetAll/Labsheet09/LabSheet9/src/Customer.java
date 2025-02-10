
public class Customer {
	private int cid;
	private String name;
	private int discount;
	
	public Customer(int cid,String name,int discount) {
		this.name = name;
		this.cid = cid;
		this.discount = discount;
	}
	public int getcustID() {
		return  this.cid;
	}
	public String getcustName() {
		return this.name;
	}
	public int getcustDiscount()
	{
		return this.discount;
	}
	void setDiscount(int discount) {
		this.discount = discount;
	}
	public String toString() {
		return "name("+getcustID()+")("+getcustDiscount()+"%)";
	}

}
