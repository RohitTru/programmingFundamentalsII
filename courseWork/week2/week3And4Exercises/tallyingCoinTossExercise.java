/*
 * Retrieve a user specified amount of coin flips
 * Rohit Truesdale 06/18/2023
 * 11.0.19
 */

import java.util.Scanner;

public class tallyingCoinTossExercise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many coins do you want to flip?");
        int times = input.nextInt();
        int headCounter=0;
        int tailCounter=0;
        
        for (int i = 0; i < times; i++) {
            double r = Math.random();
            if (r >= .5) {
                headCounter++;
                System.out.println("Heads");
            } else {
                tailCounter++;
                System.out.println("Tails");
            }
        }
        System.out.println("Number of Heads: " + headCounter + "\nNumber of Tails: " + tailCounter);
    }
}
