public class Product 
{
	private String productId;
	private int productUnit;
	private double productPrice;
	public Product(String productId, int productUnit, double productPrice)
	{
		this.productId = productId;
		this.productUnit = productUnit;
		this.productPrice = productPrice;
	}
	public void setID(String pid)
	{
		this.productId = pid;
	}
	public String getId()
	{
		return productId;
	}
	public void setUnit(int proUnit)
	{
		this.productUnit = proUnit;
	}
	public int getUnit()
	{
		return productUnit;
	}
	public void setPrice(double proPrice)
	{
		this.productPrice = proPrice;
	}
	public double getPrice()
	{
		return productPrice;
	}
	public double calculate()
	{
		return productUnit * productPrice;
	}
}
