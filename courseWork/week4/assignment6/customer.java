/*
 * Rohit Truesdale 07/03/2023
 * Created a Customer class that encapsulates the concept of a customer, assuming that a customer has the following attributes: a name and a credit score.
 * jdk version 11.0.19
 */

public class customer {
    private String customerName;
    private int creditScore;

    // set Variables
    public customer() {
        this.customerName = null;
        this.creditScore = 300;
    }

    // Constructor, takes in the 1st arguments and sends to the "setCustomerName" function and takes argument 2 to and sends it to the "setCreditScore" function
    public customer(String customerName, int creditScore) {
        setCustomerName(customerName);
        setCreditScore(creditScore);
    }
    // returns the customer name
    public String getCustomerName() {
        return customerName;
    }

    //  Sets the customer name
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Returns the credit score
    public int getCreditScore() {
        return creditScore;
    }

    // Makes the lowest possible credit score 300
    public void setCreditScore(int creditScore) {
        if (creditScore < 300) {
            this.creditScore = 300;
        } else {
            this.creditScore = creditScore;
        }
    }

    // Takes in the credit score then returns a categorical verbalized string
    public String getCreditRating() {
        if (creditScore >= 200 && creditScore <= 629) {
            return "Poor";
        } else if (creditScore >= 630 && creditScore <= 689) {
            return "Fair";
        } else if (creditScore >= 690 && creditScore <= 719) {
            return "Good";
        } else {
            return "Excellent";
        }
    }
}
