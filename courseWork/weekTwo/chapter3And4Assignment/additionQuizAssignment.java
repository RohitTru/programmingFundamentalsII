/*
 * This program will present an addition quiz with a user specified amount of questions, then will return a completion percentage
 * Rohit Truesdale 06/18/2023
 * 11.0.19
 */

 import java.swing.JOptionPane;

 public class additionQuiz{
    public static void main(String[] args){
        
        // Declaration of variables
        int amountOfQuestions = 0;
        int amountOfCorrectQs = 0;

        // retrieve the number of questions from user
        amountOfQuestions = (Integer)parseInt(JOptionPane.showInputDialog(null, "How many addition problems would you like to attempt?"));
        System.out.println(amountOfQuestions);


    }

 }