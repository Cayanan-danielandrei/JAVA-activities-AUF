import java.util.Scanner;
public class St {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your full name: ");
String name = sc.nextLine();
// Counts all characters, including spaces
System.out.println("\nNumber of characters: " + name.length());
// Gets the first character at index 0
System.out.println("First character: " + name.charAt(2));
// Converts the name to uppercase
System.out.println("Uppercase: " + name.toUpperCase());
// Converts the name to lowercase
System.out.println("Lowercase: " + name.toLowerCase());
// Gets the first three characters
System.out.println("First three characters: " + name.substring(0, 6));
sc.close();
}
}