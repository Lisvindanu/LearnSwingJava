package graphich2D;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Image image;
    MyPanel() {
        image = new ImageIcon("src/mouseListener/Img/Nokotan2.jpg").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;


        g2d.setPaint(Color.BLACK);
        g2d.setStroke(new BasicStroke(5));
//        g2d.drawLine(0,0,500,500);
//        g2d.setPaint(Color.black);
//        g2d.drawRect(0, 0, 100, 100);
//        g2d.fillRect(0, 0, 100, 200);

//        g2d.setPaint(Color.orange);
//        g2d.drawOval(50, 50, 100, 100);
//        g2d.fillOval(0, 0, 100, 100);
//        g2d.drawArc(0,0,100,100,0,180);
//        g2d.setPaint(Color.red);
//
//        g2d.fillArc(0,0,100,100,0,180);
//       g2d.setPaint(Color.white);
//        g2d.fillArc(0,0,100,100,180,180);
//        int[] xPoints = {150,250,350};
//        int[] YPoints = {300,150,300};
//        g2d.drawPolygon(xPoints,YPoints, 3);
//        g2d.fillPolygon(xPoints,YPoints, 3);
        g2d.drawImage(image,0,0,null);
        g2d.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2d.drawString("Dimana Otaknya?", 50,50);



    }
}
