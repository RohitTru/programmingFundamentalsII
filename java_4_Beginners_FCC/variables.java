package java_4_Beginners_FCC;

class variables {
    static int my_Global_Variable = 44; // Global variable b/c it is outside of the main method. FYI, required to be declared as a static.
    public static void main(String[] args){
        int localNumberOne = 14; // These are local variables since they are within the the main class. If we were to create another class, these variables would not be accessible.
        int localNumbTwo = 9;

        my_Global_Variable = 14; // we can also reassign our global variable

        int addition = localNumberOne + localNumbTwo + my_Global_Variable;
    
        System.out.println("Variable localNumberOne: " + localNumberOne + " + Variable localNumbTwo: " + localNumbTwo + 
        " + my_Global_Variable: " + my_Global_Variable + " = " + addition);
    }
}