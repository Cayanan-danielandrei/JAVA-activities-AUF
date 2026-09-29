import java.util.Scanner; 

public class RestaurantCase {

    static void WelcomeRestau() {

        System.out.println("\n---------JOLLIBEE MENU---------");
        System.out.println("Thank you for choosing Jollibee");
        System.out.println("May we take your order ?:");
        System.out.println("-------------------------------");
    }

    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        WelcomeRestau();

        System.out.println("DINE IN or TAKE OUT ?");
        System.out.println("---------------------");
        System.out.println("Press 1 for DINE IN"  );
        System.out.println("Press 2 for TAKE OUT" );
        System.out.println("---------------------");

        int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("|YOU SELECETED DINE IN|");
                    break;
                case 2:
                    System.out.println("|YOU SELECTED TAKE OUT|");
                   break;
                default: 
                    System.out.println("|INVALID CHOICE|");
            }


        System.out.println("-------------------------");
        System.out.println(" Press 1 for ChickenJoy");
        System.out.println(" Press 2 for Spaghetti");
        System.out.println(" Press 3 for BurgerSteak");
        System.out.println(" Press 4 for Apple Pie");
        System.out.println(" Press 5 for Coke Float");
        System.out.println("-------------------------");

        int order = sc.nextInt();
            switch (order) {
                case 1:
                    System.out.println("|YOU ORDERED CHICKENJOY|");
                    break;
                case 2:
                    System.out.println("|YOU ORDERED SPAGHETTI|");
                    break;
                case 3:
                    System.out.println("|YOU ORDERED BURGERSTEAK|");
                    break;
                case 4:
                    System.out.println("|YOU ORDERED APPLE PIE|");
                    break;
                case 5:
                    System.out.println("|YOU ORDERED COKE FLOAT|");
                    break;
                default:
                    System.out.println("| INVALID MENU CHOICE |");
                    break;
            }

        System.out.println("-----------------------------------------------");
        System.out.println("WOULD YOU LIKE TO PROCEED WITH YOUR ORDER? :");
        System.out.println("PRESS 1 FOR YES");
        System.out.println("PRESS 2 FOR NO");
        System.out.println("-----------------------------------------------");

        int Cont = sc.nextInt();
            switch (Cont){
                case 1:
                 System.out.println("THANK YOU FOR CHOOSING JOLLIBEE");
                 break;
                case 2:
                 System.out.println("THANK YOU NALANG BOSS");
                 break;
                default:
                 System.out.println("PASENSYA NA");
                 break;         
            }

        
    }

}