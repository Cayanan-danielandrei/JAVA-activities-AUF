import java.util.Random;
import java.util.Scanner;

public class Methods {

    // Main method - program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for a word with at least three letters
        System.out.print("Enter a word (at least three letters): ");
        String originalWord = sc.nextLine().trim();

        // Convert the word to uppercase using a user-defined method
        String upperWord = convertToUppercase(originalWord);

        // Extract the third letter using a user-defined method
        char thirdLetter = getThirdLetter(upperWord);

        // Generate a random challenge number between 2 and 100 (inclusive)
        Random randomGenerator = new Random();
        int challengeNumber = randomGenerator.nextInt(99);

        // Display all required output, organized clearly
        System.out.println("\n----- RESULTS -----");
        System.out.println("Original word: " + originalWord);
        System.out.println("Word in uppercase: " + upperWord);
        System.out.println("Third letter of the word: " + thirdLetter);
        System.out.println("Random challenge number: " + challengeNumber);

        sc.close(); // Close the Scanner to free resources
    }

    // User-defined method: converts a given string to uppercase
    public static String convertToUppercase(String word) {
        return word.toUpperCase();
    }

    // User-defined method: extracts the third letter (index 2) of a word
    public static char getThirdLetter(String word) {
        // charAt(2) gets the character at index 2, which is the 3rd letter
        return word.charAt(2);
    }
}