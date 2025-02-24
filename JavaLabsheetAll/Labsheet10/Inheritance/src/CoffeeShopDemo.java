import java.util.Scanner;
public class CoffeeShopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Barista staff1 = new Barista("Leon", 'M');
        Barista staff2 = new Barista("Claire", 'F');

        System.out.print("Enter Drink Type (1: Hot, 2: Cold): ");
        int drinkType = scanner.nextInt();
        
        System.out.print("Enter Coffee Type (1: Americano, 2: Espresso, 3: Cappuccino): ");
        int coffeeType = scanner.nextInt();

        System.out.print("Enter Coffee Size (S, T, G, V): ");
        char coffeeSize = scanner.next().charAt(0);

        System.out.print("Enter Barista (1: Leon, 2: Claire): ");
        int baristaChoice = scanner.nextInt();
        
        Barista selectedBarista = (baristaChoice == 2) ? staff2 : staff1;
        
        Coffee order = new Coffee(drinkType, coffeeSize, coffeeType, selectedBarista);
        
        System.out.println(order.toString());
        System.out.println(selectedBarista.getName() + "(" + selectedBarista.getGenderName() + ")");
        scanner.close();
      }
}