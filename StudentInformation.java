import java.util.Random;
import java.util.Scanner;
public class StudentInformation {
// Method that displays the student's information
static void displayStudent(String name, String program) {
System.out.println("\nSTUDENT INFORMATION");
System.out.println("Name: " + name.toUpperCase());
System.out.println("Program: " + program.toUpperCase());
System.out.println("Number of characters: " + name.length());
System.out.println("First character: " + name.charAt(0));
}
// Method that calculates the average
static double calculateAverage(int score, int randomScore) {
return (score + randomScore) / 2.0;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random ra = new Random();
// Accept information from the user
System.out.print("Enter your name: ");
String name = sc.nextLine();
System.out.print("Enter your program: ");
String program = sc.nextLine();
System.out.print("Enter your score from 1 to 100: ");
int score = sc.nextInt();
// Generate a random score from 1 to 100
int randomScore = ra.nextInt(100) + 1;
// Call the user-defined methods
displayStudent(name, program);
double average = calculateAverage(score, randomScore);
// Use Math class methods
int highestScore = Math.max(score, randomScore);
int lowestScore = Math.min(score, randomScore);
long roundedAverage = Math.round(average);
// Display the results
System.out.println("\nSCORE RESULTS");
System.out.println("Entered score: " + score);
System.out.println("Random score: " + randomScore);
System.out.println("Highest score: " + highestScore);
System.out.println("Lowest score: " + lowestScore);
System.out.println("Exact average: " + average);
System.out.println("Rounded average: " + roundedAverage);
sc.close();
}
}