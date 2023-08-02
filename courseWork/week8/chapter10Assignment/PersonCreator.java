package courseWork.week8.chapter10Assignment;

public class PersonCreator {

    public static void main(String[] args) {

        // Create an array of 4 people
        Person[] people = new Person[4];

        // First 2 elements are Person objects
        people[0] = new Person("Robert Downy", "weewoo@outlook.com", "123-456-7890");
        people[1] = new Person("Lex Fridman", "maryHadALittleLamb@gmail.com", "012-345-6789");

        // Next 2 elements are Employee objects
        people[2] = new Employee("Yousef Hussain", "OppenheimerWasGreat@yahoo.com", "234-567-8901", "1234-5678");
        people[3] = new Employee("Rohit Truesdale", "rtruesdale2@collin.edu", "777-777-7777", "8889-9999");

        // Use a for-each loop to print each object entry
        for (Person person : people) {
            System.out.println(person + "" + "\n");
        }
    }
}