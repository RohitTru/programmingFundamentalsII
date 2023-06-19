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

        // retrieve the number of questions from user
        amountOfQuestions = Integer.parseInt(JOptionPane.showInputDialog(null, "How many addition problems would you like to attempt?"));

        
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




    }

 }