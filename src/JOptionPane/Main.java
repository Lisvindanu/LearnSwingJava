package JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //JOptionPane = pop up a standard dialog box that prompts user for a value
        //              or informs them of something

//        JOptionPane.showMessageDialog(null, "This is some useless info", "tittle", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "here is more useless info", "tittle", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "we asked u some useless info", "tittle", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "You're computer has a VIRUSSS!!!!", "tittle", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!!!", "tittle", JOptionPane.ERROR_MESSAGE);

      //int Answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my Tittle", JOptionPane.YES_NO_CANCEL_OPTION);
//      String name = JOptionPane.showInputDialog("What is your name?: ");
//        System.out.println("Hallo " + name);
        String[] responses = {"No, youre Awesome", "Txh", "Blush"};
        ImageIcon icon = new ImageIcon("src/GUI/Logo.png");
        JOptionPane.showOptionDialog(null,
                "You're Awesome",
                "Secret Message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);

    }
}
