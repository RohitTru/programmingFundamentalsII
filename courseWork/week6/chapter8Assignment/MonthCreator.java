package courseWork.week6.chapter8Assignment;

// MonthCreator class to demonstrate Month functionality
public class MonthCreator {
    // Main method
    public static void main(String[] args) {
        // Create a Month object with month number 10
        main month1 = new main(3);

        // Print the Month object
        System.out.println(month1);

        // Create another Month object with month number 11
        main month2 = new main(5);

        // Print the second Month object
        System.out.println(month2);

        // Check if month1 and month2 are equal using the equals() method
        // If they are equal
        if (month1.equals(month2)) {
            System.out.println(month1.getMonthName() + " is equal to " + month2.getMonthName());
        }
        // If they are different
        else {
            System.out.println(month1.getMonthName() + " is not equal to " + month2.getMonthName());
        }
    }
}
