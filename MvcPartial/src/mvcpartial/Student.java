package mvcpartial;

/**
 * a Student with firstName, lastName, and gpa fields and relevant methods
 */
public class Student {

    private final String firstName;
    private final String lastName;
    private final double gpa;

    /**
     * @param firstName 
     * @param lastName
     * @param gpa a String is passed in, gets parsed to a double in constructor
     */
    public Student(String firstName, String lastName, String gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = Double.parseDouble(gpa);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "; gpa: " + gpa;
    }

}