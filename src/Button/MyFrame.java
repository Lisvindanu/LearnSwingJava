    package Button;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    public class MyFrame  extends JFrame implements ActionListener {
        JButton button;
        JLabel label;
        MyFrame() {
            ImageIcon icon = new ImageIcon("src/Button/icon.png");
            ImageIcon icon2 = new ImageIcon("src/Button/Logo.png");
            label = new JLabel();
            label.setIcon(icon2);
            label.setBounds(150, 300, 150, 150);
            label.setVisible(false);

            button = new JButton();
            button.setBounds(100, 100, 250, 100);
            button.setText("Aku Adalah tombol");
            button.setFocusable(false);
            button.setIcon(icon);
            button.setHorizontalTextPosition(JButton.CENTER);
            button.setVerticalTextPosition(JButton.BOTTOM);
            button.setFont(new Font("Comic Sans", Font.PLAIN, 14));
            button.setIconTextGap(-200);
            button.setForeground(Color.cyan);
            button.setBorder(BorderFactory.createEtchedBorder());
    //        button.setEnabled(false);
            button.addActionListener(this);
            button.addActionListener(e -> {
                System.out.println("poo");
            });
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(500, 500);
            this.setVisible(true);
            this.add(button);
            this.add(label);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button) {
                label.setVisible(true);
            }
        }
    }
