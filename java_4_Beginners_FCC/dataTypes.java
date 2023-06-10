package java_4_Beginners_FCC;
class dataTypes {
    public static void main(String[] args){
    // primitive data types | often store values | example: int | 8 primitive types in java
        byte aSingleByte = 127; //these can be small numbers between the range of -128 and 127. Cant store anything outside of the range
    
        short aSmallNumber = 20000; //shorts can only hold number values between -32,768 and 32,765

        int anInteger = 2147483647; // between -2147483648 and 2147483647

        long aLargeNumber = 9223372036854775807L; // between -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | for longs you have to append a l or L at the end of the number

        // decimal types
            double aDouble = 1.79769313; // 4.9E-324 to 1.7976931348623157E308 | double precision of 64 bit floating point numbers
            
            float aFloat = 3.4028F; // 1.4E-45 to 3.4028235E38 | single precision 32 bit floating point numbers | You have append the letter F or f at the end of the number
    
        // booleans
            boolean isWeekend = false;
            
            boolean isWorkday = true;
    
        // characters
            char copyrightSymbol = '\u00A9'; // you can use unicode to output symbols
            System.out.println(copyrightSymbol);

    // non-primitive types | often store references | example: might store a memory location to another variable
        // We can convert the declaration of a value that is smaller to a declaration that requires more memory but not the other way around 
        int number1 = 5;
        double number2 = number1;
        System.out.println(number2);

        //this will not work | commented out because it will through out an error
        
        /*
        double number3 = 5.4;
        int number4 = number3;
        System.out.println(number4);
         */
        
         // Instead if you really have to make the conversion you can use

            double number5 = 2.6;
            int number6 = (int)number5;
            System.out.println(number6);

         // To create an immutable object in java we can use final
            final double PRICE = 19.99; //"PRICE" is in all caps as a means to distinguish immutable variables from non - java unspoken rules
            // PRICE += .01; // This line is commented out because it is not possible to manipulate a immutable object


    }

}