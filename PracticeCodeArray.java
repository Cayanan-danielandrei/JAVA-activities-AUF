import java.util.Scanner;

public class PracticeCodeArray {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

                        int choice;
            do {
                System.out.println("\n1. View Students");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");
            choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("1. Daniel");
            System.out.println("2. Jurwin");
            System.out.println("3. Nicole");
            System.out.println("4. Gab");
            System.out.println("5. Marcus");
            System.out.println("6. Kamillah");
            System.out.println("7. Sean");
            System.out.println("8. Nash");
            System.out.println("9. Anton");
        }
        else if (choice == 2) {
            System.out.println("Exiting program...");
            break;
    }
        else {
            System.out.println("Invalid choice. Please try again.");
            break;
    }
        } while (choice != 3);

        String[] names = {"Daniel", "Jurwin", "Nicole", "Gab", "Marcus", "Kamillah", "Sean", "Nash", "Anton"};
        int[] age = {22, 20, 18, 18, 18, 19, 19, 18};
        String Course = "BSIT";
        String Year = "1st Year";

        System.out.print("\nChoose a student (1-8): ");
        int studentChoice = sc.nextInt();

        if (studentChoice >= 1 && studentChoice <= names.length) {
            int index = studentChoice - 1;
            System.out.println("Student Information");
            System.out.println("-------------------");
            System.out.println("Name: " + names[index]);
            System.out.println("Age: " + age[index]);
            System.out.println("Course: " + Course);
            System.out.println("Year Level: " + Year);
            System.out.println("-------------------");
        } else {
            System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }

        int [] grades = new int[5];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            System.out.print("");
            grades[i] = sc.nextInt();
        }

        for (int i=0; i < grades.length; i++){
            if (grades[i] >= 75){
                    System.out.println(grades[i] + " = Passed");
            } else {
                    System.out.println(grades[i] + " = Failed");

            }
        }

            int total = 0;
        for (int grade : grades) {
                total += grade;
            }
            double average = (double) total / grades.length;
            System.out.println("Average grade: " + average);
    }
}