/*
 * This program will present an addition quiz with a user specified amount of questions, then will return a completion percentage
 * Rohit Truesdale 06/18/2023
 * 11.0.19
 */

import javax.swing.JOptionPane;

 public class additionQuizAssignment{
    public static void main(String[] args){
        
        // Declaration of variables
        int amountOfQuestions = 0;
        int amountOfCorrectQs = 0;

        // retrieve the number of questions from user and number validation check
        boolean validInput = false;
        while (!validInput){
            amountOfQuestions = Integer.parseInt(JOptionPane.showInputDialog(null, "How many addition problems would you like to attempt?"));

            if (amountOfQuestions < 0) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a positive number greater than zero.");
            } else {
                validInput = true;
            }
        }
        for (int i =0; i < amountOfQuestions; i++){
            int firstNum = (int)(Math.random() * 50 + 1);
            int secondNum = (int)(Math.random() * 50 +1 );

            // Present question and retrieve answer
            int userInput = Integer.parseInt(JOptionPane.showInputDialog(null, firstNum + " + " + secondNum + "= ?"));

            // validation of answers
            if ((firstNum + secondNum) == userInput){
                amountOfCorrectQs++;
                JOptionPane.showMessageDialog(null, "Correct", "Validation", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Incorrect", "Validation", JOptionPane.INFORMATION_MESSAGE);
            }

        }

        // Percent correct calculator
        double percentage = (double)amountOfCorrectQs / amountOfQuestions * 100.0;

        
        // Pass or fail?
        if (percentage > 70) {
            JOptionPane.showMessageDialog(null, "Congratulations, You passed!\nYour achieved " + amountOfCorrectQs + " out of " + amountOfQuestions + " question(s) correct.\n"
                + String.format("%.2f%%", percentage), "Results", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "You failed:\n" + amountOfCorrectQs + " out of " + amountOfQuestions + " question(s) correct.\n"
                + String.format("%.2f%%", percentage) + "\nYou did not pass this addition quiz. Please try again.", "Results", JOptionPane.INFORMATION_MESSAGE);
        }
            




    }

 }