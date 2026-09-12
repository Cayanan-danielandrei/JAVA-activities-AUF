import java.util.Random;
import java.util.Scanner;

public class testprogram {

// user-defined methods for getting the first letter //
public static char getFirstLetter(String word) {
        // charAt(0) gets the character at index 0, which is the 1st letter
        return word.charAt(0);
    }

// user-defined methods for getting the second letter //
public static char getSecondLetter(String word) {
        // charAt(1) gets the character at index 1, which is the 2nd letter
        return word.charAt(1);
    }

// user-defined methods for getting the third letter //
public static char getThirdLetter(String word) {
        // charAt(2) gets the character at index 2, which is the 3rd letter
        return word.charAt(2);
    }

// convert to upper case //
public static String uppercase(String word) {
        return word.toUpperCase();
    }

// convert to lower case //
public static String lowercase(String word) {
        return word.toLowerCase();
    }

    // Main Body //
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    // user input //
    System.out.println("-------------------------------");
    System.out.println("|     WELCOME TO WORD PLAY    |");
    System.out.println("-------------------------------");
    System.out.println("Please enter a word with at least three letters: ");
    String originalword = input.nextLine();
    
    // parameters & arguments for user-defined methods //
    String lowercase = lowercase(originalword);
    String uppercase = uppercase(originalword);
    char firstletter = getFirstLetter(originalword);
    char secondletter = getSecondLetter(originalword);
    char thirdletter = getThirdLetter(originalword);

    // random number generator //
    Random random = new Random();

    int randomnumber = random.nextInt(98) + 2; // generates a random number between 2 and 100 //

    // output //
    System.out.println("----- RESULTS -----");
    System.out.println("User Input: " + originalword);
    System.out.println("Word in Lowercase: " + lowercase);
    System.out.println("Word in Uppercase: " + uppercase);
    System.out.println("First Letter: " + firstletter);
    System.out.println("Second Letter: " + secondletter);
    System.out.println("Third Letter: " + thirdletter);
    System.out.println("Random Number: " + randomnumber);
    System.out.println("-------------------------------");
    }
}