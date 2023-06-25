package miscTuts;

import java.util.Scanner;

// Program a method that retrieves a name and a method that retrieves age
public class methodsTut {
    // Main
    public static void main(String[] args) {
        System.out.println("First enter your name then your age: ");
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
}