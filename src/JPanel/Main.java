package JPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        //Jpanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("src/JPanel/ok.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.RIGHT);


        JPanel pinkPanel = new JPanel();
        pinkPanel.setBackground(Color.pink);
        pinkPanel.setBounds(0,0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250, 500, 250);
        greenPanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(pinkPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        greenPanel.add(label);
    }
}
