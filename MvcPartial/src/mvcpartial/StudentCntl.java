package mvcpartial;

/**
 * controls interactions between the view class (StudentUI) and the two
 * model classes (Student and StudentList)
 */
public class StudentCntl {

    private static final int STARTING_INDEX_OF_DISPLAY = 0;
    private final StudentList studentList;
    private final StudentUI studentUI;

    /**
     * creates a new StudentList(), which should be populated in that class
     * creates and makes visible a new StudentUI showing first item in list
     */
    public StudentCntl() {
        studentList = new StudentList();
        studentUI = new StudentUI(this, STARTING_INDEX_OF_DISPLAY); // pass 0 so UI starts at first element in list
        studentUI.setVisible(true);
    }

    Student getStudent(int index) {
        return studentList.getStudents().get(index);
    }

    int getListSize() {
        return studentList.getStudents().size();
    }

    void delete(int index) {
        studentList.getStudents().remove(index);
    }

}