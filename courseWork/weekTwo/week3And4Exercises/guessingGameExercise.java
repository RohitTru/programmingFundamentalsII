/*
 * This program will generate a number between 1 and 10 and make the attempt to guess the number 
 * Rohit Truesdale 06/18/2023
 * openjdk version "11.0.19"
 */
import javax.swing.JOptionPane;

 public class guessingGameExercise {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100 assigned to computerNumber
        int computerNumber = (int)(Math.random() * 10 + 1); // obtaining a # between 1 & 10
        // System.out.println(computerNumber);
        int userAnswer = 0; // initialize the variable we will store userinput
        int count = 0; // initializing counter variable to track # of attempts

        while (computerNumber != userAnswer){ // our game loop
            count++;
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 10"); // print game dialogue
            
            userAnswer = Integer.parseInt(response); // store user input
            String result=null;
            if (userAnswer == computerNumber){
                result = "Correct";
            } else {
                if (userAnswer <=0 || userAnswer > 10) { 
                    result = "Invalid guess";
                } else if (userAnswer > computerNumber){
                    result = "Guess lower";
                } else {
                    result = "Guess higher";
                }
            }
            JOptionPane.showMessageDialog(null, result + "\nNumber of tries: " + count);
        }
        if (count == 1) {
            JOptionPane.showMessageDialog(null, "You must be a psychic!");
        } else if (count < 3) {
            JOptionPane.showMessageDialog(null, "Amazing!");
        } else if (count < 5) {
            JOptionPane.showMessageDialog(null, "Great job!");
        } else {
            JOptionPane.showMessageDialog(null,"You need some practice");
        }

        
    }
}