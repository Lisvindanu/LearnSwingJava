package HowToOpenANewWindows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");
    LaunchPage() {
        myButton.setBounds(100, 100, 200, 100);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("HowToOpenANewWindows");
        frame.setSize(500,500);
        frame.setLayout(null);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == myButton) {
            frame.dispose();
            NewWindows myWindow = new NewWindows();
        }

    }
}
