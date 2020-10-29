package mvcpartial;

import java.util.ArrayList;
import java.util.List;

/**
 * class to hold a list of type Student and associated methods
 */
public class StudentList {

    private final List<Student> students;

    /**
     * creates a new ArrayList to hold students and then
     * fills that list with three students
     */
    public StudentList() {
        students = new ArrayList<>();
        addInitialStudentsToList();
    }

    private void addInitialStudentsToList() {
        students.add(new Student("John", "Doe", "3.1"));
        students.add(new Student("Jane", "Deere", "3.25"));
        students.add(new Student("Sam", "Spade", "2.9"));    
    }
    
    List<Student> getStudents() {
        return students;
    }
    
}
