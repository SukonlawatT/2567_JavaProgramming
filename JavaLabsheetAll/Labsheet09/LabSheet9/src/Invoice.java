
public class Invoice {
	private int invid;
	private Customer customer;
	private double amount;
	
	public Invoice(int invid,Customer customer,double amount) {
		this.invid = invid;
		this.customer = customer;
		this.amount = amount;
	}
	public int getID() {
		return this.invid;
	}
	public double getAmount() {
		return this.amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public int getCustomerID() {
		return getCustomer().getcustID();
	}
	public String getCustomerName() {
		return getCustomer().getcustName();
	}
	public int getCustomerDiscount() {
		return getCustomer().getcustDiscount();
	}
	public double getAmountAfterDiscount() {
		return getAmount() - (getAmount() * getCustomerDiscount()/100);
	}
	public String toString() {
		return "Invoice[id="+getID()+",customer="+customer/*customer.toString*/+",amount="+getAmountAfterDiscount()+"]";
	}

}
