package courseWork.week8.chapter10Assignment;

class Person {

    // Data fields to store information about a person
    private String name;        // The name of the person
    private String email;       // The email address of the person
    private String phoneNumber; // The phone number of the person

    // No-argument constructor to create a Person with default values
    public Person() {
        this("", "", "");
    }

    // 3-argument constructor to create a Person with specified information
    public Person(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getter and setter methods for the Person's attributes

    // Gets the name of the person.
    // @return The name of the person.
    public String getName() {
        return name;
    }

    // Sets the name of the person.
    // @param name The name of the person to set.
    public void setName(String name) {
        this.name = name;
    }

    // Gets the email address of the person.
    // @return The email address of the person.
    public String getEmail() {
        return email;
    }

    // Sets the email address of the person.
    // @param email The email address of the person to set.
    public void setEmail(String email) {
        this.email = email;
    }

    // Gets the phone number of the person.
    // @return The phone number of the person.
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Sets the phone number of the person.
    // @param phoneNumber The phone number of the person to set.
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // toString() method to provide a string representation of the Person object
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Email: " + email + "\n" + "Phone Number: " + phoneNumber;
    }
}

class Employee extends Person {

    // Data field to store additional information specific to an employee
    private String employeeNumber; // The employee number of the employee

    // No-argument constructor to create an Employee with default values
    public Employee() {
        employeeNumber = "";
    }

    // 4-argument constructor to create an Employee with specified information
    public Employee(String name, String email, String phoneNumber, String employeeNumber) {
        super(name, email, phoneNumber);
        this.employeeNumber = employeeNumber;
    }

    // Getter and setter methods for the Employee's specific attribute

    // Gets the employee number of the employee.
    // @return The employee number of the employee.
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    // Sets the employee number of the employee.
    // @param employeeNumber The employee number of the employee to set.
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    // toString() method to provide a string representation of the Employee object
    @Override
    public String toString() {
        return super.toString() + "\n" + "Employee Number: " + employeeNumber;
    }
}
