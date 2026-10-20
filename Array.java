import java.util.ArrayList;
import java.util.Scanner;

public class Array{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] grades = {85,90,78,92,88,75,76};
    //index 1 = 85 to index 6 = 76 
    System.out.println(grades[0]);
    System.out.println(grades[1]);
    System.out.println(grades[2]);
    System.out.println(grades[3]);

    //Array Loop
       for (int i=0; i < grades.length; i++) 
        if (grades[i] >= 75){
            System.out.println(grades[i] + "\nPassed");
        } else {
            System.out.println(grades[i] + "\nFailed");
        }
        

        //ARRAY LIST//
        ArrayList<String> names = new ArrayList<>();

        names.add("Juan");
        names.add("Maria");
        names.add("Pedro");
        names.set(1, "Ana");
        System.out.println(names.get(1));


        //Try & Catch
        int a = 10;
        int b = 0;
        int results = (a / b);

        try{
            System.out.println(results);
        } catch (ArithmeticException e){
            System.out.println("cannot divide by 0");
        }
        




  sc.close();  
  }
}