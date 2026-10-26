import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int LogChoice;
        while (true) {
            System.out.println("Would you like to log in?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Choice: ");

            try {
                LogChoice = Integer.parseInt(sc.nextLine().trim());
                if (LogChoice == 1 || LogChoice == 2) {
                    break;
                }
            } catch (NumberFormatException ignored) {
                // Reprompt when the input is not a number.
            }

            System.out.println("Invalid choice. Enter 1 or 2.");
        }


            switch (LogChoice) {
                case 1:
                    System.out.println("WELCOME TO PASSWORD CHECKER");

                    String password = "";
                    while (!password.equals("admin123")) {
                        System.out.println("Enter Passowrd: ");
                        password = sc.nextLine();

                        if (!password.equals("admin123")) {
                            System.out.println("Incorrect password. Try Again");
                        }

                        else{
                            System.out.println("Access Granted");
                        }
                    }
                    break;
                case 2:
                    System.out.println("GOODBYE MADAPAKA");
                    break;
                default:
                    System.out.println("Incorrect Choice");
            }
        }
}