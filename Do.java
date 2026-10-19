import java.util.Scanner;

    public class Do {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                int choice;
            do {
                System.out.println("\n1. Add Record");
                System.out.println("2. View Record");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
            choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Adding Record...");
        }
        else if (choice == 2) {
            System.out.println("Viewing Record...");
    }
        else if (choice == 3) {
            System.out.println("Exiting program...");
    }
        else {
            System.out.println("Invalid choice. Please try again.");
    }
        } while (choice != 3);
    sc.close();
    }
}