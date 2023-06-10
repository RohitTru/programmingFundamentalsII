package java_4_Beginners_FCC;

class operators {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 5;

        //addition
        System.out.println("Addition: " + number1  + " + " + number2 + " = " + number1 + number2);
        
        //subtraction
        System.out.println("Subtraction " + number1 + " - " + number2 + " = " + (number1 - number2));

        //multiplication
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + (number1 * number2));

        //division
        System.out.println("Division: " + number1 + " / " + number2 + " = " + ((double)number1 / (double)number2)); // we have to use (double) here otherwise our division would have out put an int value of just 2

        //remainder (modulo/modulus)
        System.out.println("remainder: " + number1 + " mod " + number2 + " = " + (number1 % number2));
    
        //assignment operator
        number1 += 18; // you can also use -= fpr subtracting and assigning, %= for modulus, *= for multiplication, /= for division
        System.out.println("number1's original value was 12, but now its: " + number1);

        //relational operators
        
    }
    
}