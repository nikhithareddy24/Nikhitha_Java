package main.java.HashMap;

public class Student {

    private String FirstName;
    private String LastName;
    private double GPA;

    public Student(String firstName, String lastName, double GPA) {
        FirstName = firstName;
        LastName = lastName;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public double getGPA() {
        return this.GPA;
    }
}
