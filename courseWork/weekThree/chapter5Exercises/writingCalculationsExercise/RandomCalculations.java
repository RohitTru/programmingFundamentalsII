/*
 * Practice with writing a method in a separate file.
 * Rohit Truesdale 05/25/2023
 * 11.0.19
 */
import java.util.Scanner;
public class RandomCalculations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //retrieve info from user
        System.out.println("Would you like to add, subtract, multiply, or divide?");
        String choice = input.next();
        System.out.println("Pick an integer number:");
        int n1 = input.nextInt();
        System.out.println("Pick an integer number:");
        int n2 = input.nextInt();
        int r1 = calculations.generateRandomNum(n1, n2);
        int r2 = calculations.generateRandomNum(n1, n2);
        switch (choice){
            case "add":
                System.out.println(r1 + "+" + r2 + "=" + calculations.add(r1, r2));
                break;
            case "subtract":
                System.out.println(r1 + "-" + r2 + "=" + calculations.subtract(n1, n2));
                break;
            case "multiply":
                System.out.println(r1 + "*" + r2 + "=" + calculations.multiply(n1, n2));
                break;
            case "divide":
                System.out.println(r1 + "/" + r2 + "=" + calculations.divide(n1, n2));
                break;
        }
    }
}