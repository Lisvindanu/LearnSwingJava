package DragDrop;

import javax.swing.*;

public class MainWindows extends JFrame {
    MainWindows() {
        this.setTitle("Jendela Utama");
        this.setSize(600, 320);
    }

    public static void main(String[] args) {
        MainWindows mainWindows = new MainWindows();
        mainWindows.setVisible(true);
    }

}
