package miscTuts;
import java.util.Scanner;

class scannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a word for a string: ");
        String myString = input.next();
        System.out.println("Your string was:\n " + myString);


        

    }

    
}
