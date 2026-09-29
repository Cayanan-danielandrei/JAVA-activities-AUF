import java.util.Scanner; 

public class GradesAverage {

    static void StudentInformation(String StudentName, String Program) {

        System.out.println("\n------STUDENT INFORMATION-------");
        System.out.println("Student Name: " + StudentName.toUpperCase());
        System.out.println("Student Program: " + Program.toUpperCase());
        System.out.println("Student Character Length: " + StudentName.length());
        System.out.println("---------------------------------");

    }

    static double CalculateAverage (double Grade1, double Grade2, double Grade3, double Grade4, double Grade5) {

        return (Grade1+Grade2+Grade3+Grade4+Grade5) / 5.0;



    }

    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Grade Average Calculator");
        System.out.print("Enter your name:");
        String StudentName = sc.nextLine();
        System.out.print("Enter your Program:");
        String Program = sc.nextLine();

        StudentInformation(StudentName, Program);

        System.out.println("Enter your first Grade:");
        double Grade1 = sc.nextDouble();
        System.out.println("Enter your second Grade:");
        double Grade2 = sc.nextDouble();
        System.out.println("Enter your third Grade:");
        double Grade3 = sc.nextDouble();
        System.out.println("Enter your fourth Grade:");
        double Grade4 = sc.nextDouble();
        System.out.println("Enter your fifth Grade:");
        double Grade5 = sc.nextDouble();

        double average = CalculateAverage(Grade1, Grade2, Grade3, Grade4, Grade5);

        System.out.println("------Student Grades-------");
        System.out.println("Your First Grade is: " + Grade1);
        System.out.println("Your Second Grade is: " + Grade2);
        System.out.println("Your Third Grade is: " + Grade3);
        System.out.println("Your Fourth Grade is: " + Grade4);
        System.out.println("Your Fifth Grade is: " + Grade5);


        System.out.println("Your Average Grade is: " + average);

                    if(average >= 90) {
                System.out.println("EXCELLENT");
                }
 
                else if (average >= 80) {
                System.out.println("VERY GOOD");
                }
                else if (average >= 75) {
                System.out.println("YOU PASSED");
                }
                else {
                System.out.println("YOU FAILED");
                }
    }

}