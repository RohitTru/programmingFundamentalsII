/*
 * Rohit Truesdale 06/25/2023
 * 11.0.19
 * This program will calculate BMI with a function method
 */
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

 public class CalculatingBmiExercise{
    public static void main(String[] args){
        
        String response;
        
        // Retrieve height
        response = JOptionPane.showInputDialog(null,"Enter your height in inches");
        double height = Double.parseDouble(response);
        
        // Retrieve Weight
        response = JOptionPane.showInputDialog(null,"Enter your weight in pounds");
        double weight = Double.parseDouble(response);
        
        // Calls BMI method
        double bmi = calculateBMI(height, weight);
        DecimalFormat pattern = new DecimalFormat("###.00");
        JOptionPane.showMessageDialog(null, "Height: " + height + 
                "\nWeight: " + weight + 
                "\nBMI: " + pattern.format(bmi));
    }

    // Calculates BMI
    public static double calculateBMI(double height, double weight){
        return (weight*703) / (height*height);
    }
 }