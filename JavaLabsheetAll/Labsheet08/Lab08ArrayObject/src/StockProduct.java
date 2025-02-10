import java.util.Scanner;
public class StockProduct 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Product[] productList = new Product[4]; 
        
        for (int i = 0; i < 4; i++) 
        {
            System.out.print("Input product ID     : ");
            String id = sc.next();

            int unit;
            do {
                System.out.print("Input product Unit   : ");
                unit = sc.nextInt();
                if (unit <= 0) 
                {
                    System.out.println("Unit must be greater than 0!");
                }
            } while (unit <= 0);

            double price;
            do {
                System.out.print("Input product Price  : ");
                price = sc.nextDouble();
                if (price <= 0) 
                {
                    System.out.println("Price must be greater than 0!");
                }
            } while (price <= 0);
            System.out.println();
            productList[i] = new Product(id, unit, price);
        }
        sc.close();
        
        System.out.println("-----------------------------------------------------");
        double totalSum =0;
        for (Product p : productList) 
        {
            double totalPrice = p.calculate();
            System.out.printf("Product ID: %s, Total price = %.2f baht.\n", p.getId(), totalPrice);
            totalSum += totalPrice;
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("Total price of all products is %.2f baht.\n", totalSum);
    } 
}