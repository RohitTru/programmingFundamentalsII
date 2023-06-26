package miscTuts;

import java.util.Scanner;

// Program a method that retrieves a name and a method that retrieves age
public class methodsTut {
    // Main
    public static void main(String[] args) {
        System.out.println("First enter your name then your age: ");
        dashedLine(45);
        System.out.println(getName() + " " + getAge());
        
    }
    
    // Name Method
    public static String getName() {
        return new Scanner(System.in).nextLine();
    }

    // Get Age Method
    public static Integer getAge() {
        return new Scanner(System.in).nextInt();
    }

    // Prints dotted line based on passed in argument
    	public static void dashedLine(int x){

        if (x <= 0);
        
        else {
            for (int i=1; i<=x; i++){
                System.out.print("-");

            } 
            System.out.println("");
        }
    }
}