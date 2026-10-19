import java.util.Scanner;

    public class Loop2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                System.out.print("How many names do you want to enter? ");
                int total = sc.nextInt();
            sc.nextLine();
            
            for (int i = 1; i <= total; i++) {
                System.out.print("Enter name " + i + ": ");
            String name = sc.nextLine();
                System.out.println("Hello, " + name + "!");
            }

            
        sc.close();
    }
}