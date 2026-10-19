import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the total number: ");
                int total = sc.nextInt();
                for (int i = 1; i <= total; i++) {
            System.out.println(i);
        }   
        sc.close();
    }
}