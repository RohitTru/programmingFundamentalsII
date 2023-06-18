package miscTuts;
import java.util.Scanner;

class scannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        // Input a string
        System.out.println("Please enter a word for a string: ");
        String myString = input.next();
        System.out.println("Your string was: " + myString);

        System.out.println("---------------------------");

        // Input an integer
        System.out.println("Please enter an integer value: ");
        int myInt = input.nextInt();
        System.out.println("Your integer was: " + myInt);

        System.out.println("---------------------------");

        // Input a double
        System.out.println("Please enter a \"double\" value ");
        Double myDouble = input.nextDouble();
        System.out.println("Your double was: " + myDouble);

        // Input can consist of  .nextByte(), .nextShor()t, .nextLong(), .nextFloat(), .nextBoolean()


    }

    
}
