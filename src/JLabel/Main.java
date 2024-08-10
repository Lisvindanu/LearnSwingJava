package JLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Jlabel = a GUI display area for a string of text, an image or both

        ImageIcon image = new ImageIcon("src/JLabel/luffy.png");
        Border border = BorderFactory.createLineBorder(Color.cyan,3);
        JLabel label = new JLabel(); // create a label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set text LEFT, CENTER, RIGHT of imageicon
        label.setText("Bro, do you even code?");    //set text of label
        label.setForeground(Color.pink);//set text color
        label.setFont(new Font("Arial", Font.ITALIC, 20)); // set font of text
        label.setIconTextGap(-5);//set
        label.setBackground(Color.BLACK);
        label.setOpaque(true);//set bg color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical pos of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal pos of icon+text within label
        //label.setBounds(100,100,250,250); //set x,y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();


    }
}
