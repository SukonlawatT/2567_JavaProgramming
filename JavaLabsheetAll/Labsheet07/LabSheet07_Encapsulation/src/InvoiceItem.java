
public class InvoiceItem 
{
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	InvoiceItem(String Id, String Desc, int Qty, double utp)
	{
		id = Id;
		desc = Desc;
		qty = Qty;
		unitPrice = utp;
	}
	public String  getId()
	{
		return this.id;
	}
	public String getDesc()
	{
		return this.desc;
	}
	public int getQty()
	{
		return this.qty;
	}
	public void setQty(int qty)
	{
		this.qty = qty;
	}
	public double getUnitPrice()
	{
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice)
	{
		this.unitPrice = unitPrice;
	}
	public double getTotal()
	{
		return unitPrice * qty;
	}
	public String toString()
	{
		return "InvoiceItem[id= "+this.id+"desc= "+this.desc+"qty= "+this.qty+"unitPrice"+this.unitPrice+"]";
	}

}
