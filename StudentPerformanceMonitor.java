import java.util.Scanner;

public class StudentPerformanceMonitor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        int numberOfStudents;

        // Main menu using do-while
        do {
            System.out.println("\n==============================");
            System.out.println("          MAIN MENU");
            System.out.println("==============================");
            System.out.println("1. Enter Student");
            System.out.println("2. System Information");
            System.out.println("3. Exit");
            System.out.println("==============================");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {

                System.out.print("How many students? ");
                numberOfStudents = input.nextInt();
                input.nextLine();

                // Continue if the number is invalid
                if (numberOfStudents <= 0) {
                    System.out.println("Invalid number of students!");
                    continue;
                }

                // Arrays for student information
                String[] names = new String[numberOfStudents];
                int[] grades = new int[numberOfStudents];
                int[] attendance = new int[numberOfStudents];
                String[] gradeResult = new String[numberOfStudents];
                String[] attendanceResult = new String[numberOfStudents];
                String[] overallResult = new String[numberOfStudents];

                // Loop for entering students
                for (int i = 0; i < numberOfStudents; i++) {

                    System.out.println("\nStudent number #" + (i + 1));
                    System.out.print("Student name (enter STOP to stop): ");
                    names[i] = input.nextLine();

                    // Case-sensitive STOP command
                    if (names[i].equals("STOP")) {
                        System.out.println("Student entry stopped!");
                        break;
                    }

                    // Input grade
                    while (true) {
                        System.out.print("Grade (0-100): ");
                        grades[i] = input.nextInt();

                        if (grades[i] < 0 || grades[i] > 100) {
                            System.out.println("Invalid grade! Try again.");
                            continue;
                        }

                        break;
                    }

                    // Input attendance
                    while (true) {
                        System.out.print("Attendance (0-100): ");
                        attendance[i] = input.nextInt();
                        input.nextLine();

                        if (attendance[i] < 0 || attendance[i] > 100) {
                            System.out.println("Invalid attendance! Try again.");
                            continue;
                        }

                        break;
                    }

                    // Nested if statements
                    if (grades[i] >= 75) {
                        gradeResult[i] = "PASS";

                        if (attendance[i] >= 75) {
                            attendanceResult[i] = "PASS";
                            overallResult[i] = "PASSED";
                        } else {
                            attendanceResult[i] = "FAIL";
                            overallResult[i] = "FAILED";
                        }

                    } else {
                        gradeResult[i] = "FAIL";

                        if (attendance[i] >= 75) {
                            attendanceResult[i] = "PASS";
                        } else {
                            attendanceResult[i] = "FAIL";
                        }

                        overallResult[i] = "FAILED";
                    }

                    // Display student performance
                    System.out.println("\n==============================");
                    System.out.println("  STUDENT PERFORMANCE SYSTEM");
                    System.out.println("==============================");
                    System.out.println("Student # : " + (i + 1));
                    System.out.println("Student name : " + names[i]);
                    System.out.println("Student Grade : " + gradeResult[i]);
                    System.out.println("Student Attendance : "
                            + attendanceResult[i]);
                    System.out.println("Overall Result : " + overallResult[i]);
                    System.out.println("==============================");
                }

            } else if (choice == 2) {

                // System information
                System.out.println("\n==============================");
                System.out.println("      SYSTEM INFORMATION");
                System.out.println("==============================");
                System.out.println("System: Student Performance System");
                System.out.println("Passing Grade: 75 and above");
                System.out.println("Passing Attendance: 75 and above");
                System.out.println("Both must pass to pass overall.");
                System.out.println("Enter STOP to stop adding students.");
                System.out.println("STOP is case-sensitive.");
                System.out.println("==============================");

            } else if (choice == 3) {

                System.out.println("Exiting the system...");
                break;

            } else {
                System.out.println("Invalid choice! Please try again.");
            }

        } while (true);

        input.close();
    }
}
