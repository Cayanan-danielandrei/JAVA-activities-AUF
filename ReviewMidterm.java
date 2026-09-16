import java.util.Scanner;

public class ReviewMidterm {

    public static char getFirst(String word) {
        return word.charAt(0);
    }

    public static char getSecond(String word) {
        return word.charAt(1);
    }

    public static String toUpper(String word) {
        return word.toUpperCase();
    }

    public static String toLower(String word) {
        return word.toLowerCase();
    }

    static int addNumbers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    static void showgreet() {
        System.out.println("Hello, welcome to Word Play!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    System.out.println("-------------------------------");
    System.out.println("|         WORD PLAY           |");
    System.out.println("-------------------------------");
    System.out.println("");
    showgreet();
    System.out.println("Enter a word with atleast three letters:");
    String originalword = sc.nextLine();
    System.out.println("Enter first number:");
        int firstNum = sc.nextInt();
    System.out.println("Enter second number:");
      int secondNum = sc.nextInt();
    int length = originalword.length();
    String Uppercase = toUpper(originalword);
    String Lowercase = toLower(originalword);
    char firstLetter = getFirst(originalword);
    char secondLetter = getSecond(originalword);

    System.out.println("The original word is: " + originalword);
    System.out.println("The word in uppercase is: " + Uppercase);
    System.out.println("The word in lowercase is: " + Lowercase);
    System.out.println("The first letter of the word is: " + firstLetter);
    System.out.println("The second letter of the word is: " + secondLetter);
    System.out.println("The length of the word is: " + length);
    System.out.println("The first number is: " + firstNum);
    System.out.println("The second number is: " + secondNum);
    System.out.println("The sum of the two numbers is: " + addNumbers(firstNum, secondNum));
    
    }
}
