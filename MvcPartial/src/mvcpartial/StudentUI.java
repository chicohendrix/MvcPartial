package mvcpartial;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * class to display the fields of a single Student object from list of Students
 * includes methods to add new student, show next/previous student, delete
 * currently displayed student, and save changes to displayed student
 */
public class StudentUI extends JFrame {

    // if you use this variable outside of the constructor, 
    // you probably don't want to make it final
    private int index;

    private final JTextField firstNameTextField;
    private final JTextField lastNameTextField;
    private final JTextField gpaTextField;

    private final StudentCntl cntl;

    /**
     * creates a new view/UI to show fields for a Student, along with buttons to
     * show next/previous student, to add/delete a student, and to edit/save
     * changes to a student
     *
     * @param studentCntl - the controller in the MVC pattern
     * @param startingIndexOfDisplay - which element student list shows at start
     */
    public StudentUI(StudentCntl studentCntl, int startingIndexOfDisplay) {
        this.cntl = studentCntl;
        index = startingIndexOfDisplay;
        firstNameTextField = new JTextField();
        lastNameTextField = new JTextField();
        gpaTextField = new JTextField();
        initComponents();
        // TODO start the display at the first student (John) in list
    }

    private void initComponents() {
        setTitle("Student Viewer");
        setSize(600, 350);
        // center the frame
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel studentPanel = new JPanel(new GridLayout(5, 1));
        studentPanel.add(new JLabel("First Name"));
        studentPanel.add(firstNameTextField);
        studentPanel.add(new JLabel("Last Name"));
        studentPanel.add(lastNameTextField);
        studentPanel.add(new JLabel("GPA"));
        studentPanel.add(gpaTextField);

        JButton deleteButton = new JButton("Delete Current Item");
        JButton nextButton = new JButton("Next");

        deleteButton.addActionListener(event -> delete());
        nextButton.addActionListener(event -> displayNextItem());

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(deleteButton);
        buttonPanel.add(nextButton);

        getContentPane().add(studentPanel);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    // Always best to check index value before deleting!
    private void delete() {
        int response = JOptionPane.showConfirmDialog(null, "Delete "
                + "(TODO: display in pop-up the student about to be deleted)" 
                + " ?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            // delete 
            cntl.delete(index);
        }
    }

    private void displayNextItem() {
        int listSize = cntl.getListSize();
        if (listSize == 0) {
            JOptionPane.showMessageDialog(new javax.swing.JFrame(),
                    showEmptyListMsg());
        } else if (listSize == 1) {
            JOptionPane.showMessageDialog(new javax.swing.JFrame(),
                    "Only one item in list; no next item");
        } else {
            // TODO
        }
    }

    private String showEmptyListMsg() {
        return "List is now empty";
    }

}
