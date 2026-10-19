import java.util.Scanner;

    public class Loop3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                System.out.print("How many numbers do you want to enter? ");
                int total = sc.nextInt();
                int i = 1;

            while (i <= total) {
                System.out.println(i);
                i++;
            }
             
        sc.close();
    }
}