
public class Product 
{
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String stname, double dprice, double dbvatRate)
	{
		name = stname;
		price = dprice;
		vatRate = dbvatRate;
	}
	public double calculateTotalPrice()
	{
		double total =0;
		double totalPrice =0;
		total = price *(vatRate / 100);
		totalPrice = price + total;
		return totalPrice;
	}
	public void displayProductDetails()
	{
		System.out.println("Product Name: "+name);
		System.out.println("Price (Before VAT): "+price);
		System.out.println("Price (After  VAT): "+calculateTotalPrice());
	}
}
