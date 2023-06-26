/*
 * This program...
 * Rohit Truesdale 06/25/2023
 * 11.0.19
 */

import java.util.Random;

public class methodsGame{
    public static void main(String[] args) {
        
        // Setup input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Generate int # java.util.Random
        Random random = new Random();
 
        String runAgain = "yes";
        
        while (runAgain.equalsIgnoreCase("yes")) {
            int numb = random.nextInt(10) + 1;
            boolean plaentFact = switchPlanet(numb); // get fact
            
            System.out.print("True or False? "); // Print true or false
            String userResponse = scanner.nextLine(); // Read in true or false
            
            compareAnswer(plaentFact, userResponse.equalsIgnoreCase("true")); // call
            System.out.print("Play again (yes or no)? ");
            runAgain = scanner.nextLine();
        }

    }
    
    // Switch Planets Method with facts
    public static boolean switchPlanet(int num) {
        num = num % 10;
        switch (num) {
            case 0:
                System.out.println("Venus, the second planet from the Sun, has the longest day of any planet in our solar system. It takes about 243 Earth days for Venus to complete one rotation on its axis, which is longer than its year of 225 Earth days!");
                return true;
            case 1:
                System.out.println("Jupiter, the largest planet in our solar system, has a fascinating feature called the Great Red Spot. It is a massive storm that has been raging for at least 400 years. The storm is so large that it could easily engulf the entire Earth!");
                return true;
            case 2:
                System.out.println("Mars, often referred to as the \"Red Planet,\" has the tallest volcano in our solar system. Olympus Mons stands at an impressive height of about 13.6 miles (22 kilometers), making it nearly three times the height of Mount Everest, the tallest peak on Earth.");
                return true;
            case 3:
                System.out.println("Saturn, known for its stunning ring system, has a unique moon named Enceladus. This moon has geysers that spew water vapor and icy particles from beneath its icy surface. Scientists believe that Enceladus might have a subsurface ocean, making it a potential candidate for hosting extraterrestrial life.");
                return true;
            case 4:
                System.out.println("Uranus, the seventh planet from the Sun, has an unusual tilt. While most planets in our solar system have an axial tilt of less than 30 degrees, Uranus is tilted on its side, with an axial tilt of about 98 degrees. As a result, its rotation appears to be horizontal rather than vertical.");
                return true;
            case 5:
                System.out.println("The planet Zephyria is home to a species of sentient clouds. These cloud beings communicate through colorful lightning displays and sustain themselves by absorbing cosmic energy.");
                return false;
            case 6:
                System.out.println("On the planet Nebulon-7, gravity works in reverse during the night. As the sun sets, objects and creatures start floating upwards, creating a whimsical and surreal atmosphere.");
                return false;
            case 7:
                System.out.println("The planet Chromia is renowned for its incredible biodiversity. Its lush jungles are inhabited by bioluminescent plants that emit a soft, soothing glow, creating a mesmerizing and enchanting environment.");
                return false;
            case 8:
                System.out.println("The inhabitants of Quasar Prime possess the ability to alter the fabric of space and time. They use their unique powers to create intricate, ever-shifting cities that constantly rearrange themselves in a breathtaking display of architecture.");
                return false;
            case 9:
                System.out.println("The planet Celestia experiences \"musical seasons.\" Each season is characterized by a distinct melody that resonates throughout the planet, affecting the behavior and emotions of its inhabitants. The symphony of Celestia is said to be a harmonious blend of celestial instruments.");
                return false;
        }
        return false;
    }

    // compare
    public static void compareAnswer(boolean planetFact, boolean userAnswer) {
        if (planetFact == userAnswer) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
        }
    }


}