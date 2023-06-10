package java_4_Beginners_FCC;

class operators {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 6;

        //addition
        System.out.println("Addition: " + number1  + " + " + number2 + " = " + number1 + number2);
        
        //subtraction
        System.out.println("Subtraction " + number1 + " - " + number2 + " = " + (number1 - number2));

        //multiplication
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + (number1 * number2));

        //division
        System.out.println("Division: " + number1 + " / " + number2 + " = " + (number1 / number2));

        //remainder (modulo/modulus)
        System.out.println("remainder: " + number1 + " mod " + number2 + " = " + (number1 % number2));
    }
    
}