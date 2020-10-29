package mvcpartial;

import javax.swing.SwingUtilities;

/**
 * Demonstrates basic operation of MVC
 */
public class MvcPartial {

    public static void main(String[] args) {
    // https://docs.oracle.com/javase/tutorial/uiswing/concurrency/initial.html
        SwingUtilities.invokeLater(() -> {
            StudentCntl cntl = new StudentCntl();
        });
    }

}
