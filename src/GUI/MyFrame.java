package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {

        this.setTitle("Jthis tittle goes here");//Sets tittle of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of apps
        this.setResizable(false);//prevent this from being resized
        this.setSize(420, 420); // set x dan y dimension
        this.setVisible(true);//make this visible

        ImageIcon image = new ImageIcon("src/GUI/Logo.png");//create an ImageIcon
        this.setIconImage(image.getImage());//change icon of this
        this.getContentPane().setBackground(Color.pink); //change color of background
    }
}
