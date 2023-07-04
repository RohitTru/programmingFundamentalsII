public class customerCreator {
    public static void main(String[] args) {
        // creating our object
        customer customer = new customer("Rohit Truesdale", 733);
        
        // Print every attribute for our customer + their category
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Credit Score: " + customer.getCreditScore());
        System.out.println("Credit Rating: " + customer.getCreditRating());
    }
}
