/*
 * This program calculates tax on user inputted values
 * By Rohit Truesdale written 06/10/2023
 * JDK version 11.0.19
 */

import java.text.NumberFormat;
import javax.swing.JOptionPane;

class tipCalculator{
    public static void main(String[] args){
        //Retrieving bill amount
        String input = JOptionPane.showInputDialog(null,"Enter the total bill");
        double bill = Double.parseDouble(input);

        //Retrieving tax percentage
        input = JOptionPane.showInputDialog(null, "Enter the tip percentage as a decimal"
            + "(Example: 10% would be 0.1)");
        double percentage = Double.parseDouble(input);

        //Calculate tip amount
        double tipAmount = bill * percentage;
        
        //Setup dollar formatter alias
        NumberFormat dollars = NumberFormat.getCurrencyInstance();
        
        //Print results to dialogue box
        JOptionPane.showMessageDialog(null, "Bill amount:" 
            + dollars.format(bill)
            + "\nTip Percentage: " + percentage
            + "\nTip: " + dollars.format(tipAmount));
        
    }
}