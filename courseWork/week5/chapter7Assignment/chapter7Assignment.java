/* This program tracks and calculates the total number of bottles sold as well as the highest and lowest user inputted soda type
 * Rohit Truesdale 07/09/2023
 * 11.0.19
 */

import java.util.Scanner;

public class chapter7Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSodaTypes;
        int totalBottlesSold = 0;
        int highestBottlesSold = -1;
        int lowestBottlesSold = Integer.MAX_VALUE;
        int highestSoldIndex = -1;
        int lowestSoldIndex = -1;
        int[] numBottlesSold;
        String[] sodaTypeNames;
    
        // Input the number of soda types from the user
        do {
            System.out.print("How many types of soda would you like to enter: ");
            numSodaTypes = scanner.nextInt();
        } while (numSodaTypes < 0);
    
        scanner.nextLine();
    
        // Input the names of the soda types in a String array
        sodaTypeNames = new String[numSodaTypes];
        for (int i = 0; i < numSodaTypes; i++) {
            System.out.print("Enter the name of soda type " + (i + 1) + ": ");
            sodaTypeNames[i] = scanner.nextLine();
        }
    
        // Input the number of bottles sold for each soda type in an integer array
        numBottlesSold = new int[numSodaTypes];
        for (int i = 0; i < numSodaTypes; i++) {
            do {
                System.out.print("Enter the number of bottles sold for " + sodaTypeNames[i] + ": ");
                numBottlesSold[i] = scanner.nextInt();
            } while (numBottlesSold[i] < 0);
    
            totalBottlesSold += numBottlesSold[i];
    
            if (numBottlesSold[i] > highestBottlesSold) {
                highestBottlesSold = numBottlesSold[i];
                highestSoldIndex = i;
            }
    
            if (numBottlesSold[i] < lowestBottlesSold) {
                lowestBottlesSold = numBottlesSold[i];
                lowestSoldIndex = i;
            }
        }
    
        System.out.println("---------------------------------------");
        System.out.println("Total number of bottles sold: " + totalBottlesSold);
        System.out.println("Highest selling soda: " + sodaTypeNames[highestSoldIndex]);
        System.out.println("Lowest selling soda: " + sodaTypeNames[lowestSoldIndex]);
    }
    
}



