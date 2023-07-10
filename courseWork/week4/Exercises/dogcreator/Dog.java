package dogcreator;
/* Setter and getters Exercise
 * Rohit Truesdale
 * 07/01/2023
 */

public class Dog {
    private String name = null;
    private double weight = 0;

    //Dog Constructor
    public Dog(String newname, double newWeight) {
        setName(newname);
        setWeight(newWeight);
    }

    //Setter method to set animal name
    public final void setName(String newName) {
        this.name = newName;        
    }
    // validation
    public final void setWeight(double newWeight){
        if (newWeight > 0) {
            this.weight = newWeight;
        } else {
            System.out.println("Weight cannot be negative or zero.");
        }
    }
    
    // get animal name
    public String getName(){
    return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    //compare weight of dogs
    public String compare(Dog dogCompare) {
        String message = null;
        if(dogCompare.weight > this.weight){
            message = dogCompare.name + " weighs more than " + this.name;
        } else if (dogCompare.weight < this.weight){
            message = this.name + " weighs more than " + dogCompare.name;
        } else {
            message = this.name + " weighs equal to " + dogCompare.name;
        }
        return message;
    }

}


    

