import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("======================\n");
		System.out.println("   7-EVELYN GROCERY   \n");
		System.out.println("======================\n");	
		
        System.out.print("Enter customer name: ");
        String customer = input.nextLine();

        System.out.print("Enter cashier name: ");
        String cashier = input.nextLine();

        System.out.print("Enter transaction number: ");
        int Transac = input.nextInt();
		System.out.println("\n");
		
		System.out.println("--- PRODUCT 1 ---\n");	
		input.nextLine();
        System.out.print("Enter product name: ");
        String product1 = input.nextLine();		
        System.out.print("Enter price: PHP ");
		double price1 = input.nextDouble();
        System.out.print("Enter Quantity: ");
        int Quan1 = input.nextInt();
		System.out.println("\n");

		System.out.println("--- PRODUCT 2 ---\n");	
		input.nextLine();
        System.out.print("Enter product name: ");
        String product2 = input.nextLine();		
        System.out.print("Enter price: PHP ");
		double price2 = input.nextDouble();
        System.out.print("Enter Quantity: ");
        int Quan2 = input.nextInt();
		System.out.println("\n");
		
		System.out.println("--- PRODUCT 3 ---\n");	
		input.nextLine();
        System.out.print("Enter product name: ");
        String product3 = input.nextLine();		
        System.out.print("Enter price: PHP ");
		double price3 = input.nextDouble();
        System.out.print("Enter Quantity: ");
        int Quan3 = input.nextInt();
		System.out.println("\n");	

        System.out.print("Enter discount percentage: ");
		double discount = input.nextDouble();
		System.out.println("\n");		

        System.out.print("Enter payment amount: PH ");
        int Pay = input.nextInt();
		System.out.println("\n");	

        System.out.println("===========================\n");
		System.out.println("      7-EVELYN RECEIPT     \n");
		System.out.println("===========================\n");

	    System.out.println("Transaction Number: " + Transac);
        System.out.println("Customer Name: " + customer);
        System.out.println("Cashier Name: " + cashier);
        System.out.println("---------------------------");
	    System.out.println("Product 1: " + product1);
	    System.out.println("Price: " + price1);		
	    System.out.println("Quantity: " + Quan1);
	    System.out.println("Product Total: " + price1 * Quan1);		
        System.out.println("---------------------------");
	    System.out.println("Product 2: " + product2);
	    System.out.println("Price: " + price2);		
	    System.out.println("Quantity: " + Quan2);
	    System.out.println("Product Total: " + price2 * Quan2);		
        System.out.println("---------------------------");
	    System.out.println("Product 3: " + product3);
	    System.out.println("Price: " + price3);		
	    System.out.println("Quantity: " + Quan3);
	    System.out.println("Product Total: " + price3 * Quan3);		
        System.out.println("---------------------------");

		int totalItems = Quan1 + Quan2 + Quan3;	
	    System.out.println("Total Number of Items: " + totalItems);		
		double Subtotal = (price1*Quan1)+(price2*Quan2)+(price3*Quan3);	
	    System.out.println("Subtotal: " + Subtotal);
	    System.out.println("Discount Percentage: " + discount);		
		double discountAmount = Subtotal*(discount/100);
	    System.out.println("Discount Amount: " + discountAmount);
		double AADiscount = Subtotal - discountAmount;
	    System.out.println("Amount After Discount: " + AADiscount);	
		double vat = AADiscount * 0.12 ;
	    System.out.println("VAT (12%): " + vat);
		double TotalAmount = AADiscount+vat;
	    System.out.println("Total Amount: " + TotalAmount);
	    System.out.println("Payment: " + Pay);
		double Change = Pay - TotalAmount;
	    System.out.println("Change: " + Change);		
        System.out.println("+------------------------------------+");
        System.out.println("|      THANK YOU FOR SHOPPING!       |");
        System.out.println("|       PLEASE COME AGAIN            |");
        System.out.println("+------------------------------------+");		
        input.close();
    }
}