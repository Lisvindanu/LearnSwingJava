package BorderLayout;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

   MyFrame() {
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500, 500);
       frame.setLayout(new BorderLayout(10, 10)); //h and v margin
       frame.setVisible(true);


       JPanel panel1 = new JPanel();
       JPanel panel2 = new JPanel();
       JPanel panel3 = new JPanel();
       JPanel panel4 = new JPanel();
       JPanel panel5 = new JPanel();

       panel1.setBackground(Color.cyan);
       panel2.setBackground(Color.PINK);
       panel3.setBackground(Color.yellow);
       panel4.setBackground(Color.magenta);
       panel5.setBackground(Color.black);

       panel5.setLayout(new BorderLayout());

       panel1.setPreferredSize(new Dimension(100, 100));
       panel2.setPreferredSize(new Dimension(100, 100));
       panel3.setPreferredSize(new Dimension(100, 100));
       panel4.setPreferredSize(new Dimension(100, 100));
       panel5.setPreferredSize(new Dimension(100, 100));



       frame.add(panel1, BorderLayout.NORTH);
       frame.add(panel2, BorderLayout.WEST);
       frame.add(panel3, BorderLayout.EAST);
       frame.add(panel4, BorderLayout.SOUTH);
       frame.add(panel5, BorderLayout.CENTER);

       //------- sub panels---------


       JPanel panel6 = new JPanel();
       JPanel panel7 = new JPanel();
       JPanel panel8 = new JPanel();
       JPanel panel9 = new JPanel();
       JPanel panel10 = new JPanel();

       panel6.setBackground(Color.darkGray);
       panel7.setBackground(Color.gray);
       panel8.setBackground(Color.orange);
       panel9.setBackground(Color.lightGray);
       panel10.setBackground(Color.white);

       panel5.setLayout(new BorderLayout());

       panel6.setPreferredSize(new Dimension(50, 50));
       panel7.setPreferredSize(new Dimension(50, 50));
       panel8.setPreferredSize(new Dimension(50, 50));
       panel9.setPreferredSize(new Dimension(50, 50));
       panel10.setPreferredSize(new Dimension(50, 50));

       panel5.add(panel6, BorderLayout.NORTH);
       panel5.add(panel7, BorderLayout.WEST);
       panel5.add(panel8, BorderLayout.SOUTH);
       panel5.add(panel9, BorderLayout.EAST);
       panel5.add(panel10, BorderLayout.CENTER);


   }
}
