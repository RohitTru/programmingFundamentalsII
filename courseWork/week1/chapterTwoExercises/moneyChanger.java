/*
 * This program with use modulus to to divide up total change into dollars, quarters, nickels and pennies
 * By Rohit Truesdale written 06/10/2023
 * JDK version 11.0.19
 */

 class moneyChanger{
    public static void main(String[] args){
        
        int cents = 393; // our start change
        int centsLeft; // placeholder for change division
        int dollars, quarters, dimes, nickels, pennies; // our variables that will hold the number for each type of coin 
        
        // Math to divvy up the change
        dollars = cents/100;
        centsLeft = cents % 100;
        quarters = centsLeft / 25;
        centsLeft = centsLeft % 25;
        dimes = centsLeft / 10;
        centsLeft = centsLeft % 10;
        nickels = centsLeft / 5;
        centsLeft = centsLeft % 5;
        pennies = centsLeft;

        //Output to the terminal
        System.out.println("total Cents: " + cents
        + "\nDollars: " + dollars
        + "\nQuarters: " + quarters
        + "\nDimes: " + dimes
        + "\nNickels: " + nickels
        + "\nPennies: " + pennies);
    }

 }