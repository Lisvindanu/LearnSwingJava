package HowToOpenANewWindows;

import javax.swing.*;
import java.awt.*;

public class NewWindows {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");
    NewWindows() {

        label.setBounds(0,0,100,50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("NewWindows");
        frame.setSize(420,420);
        frame.setLayout(null);

        frame.setVisible(true);
    }
}
