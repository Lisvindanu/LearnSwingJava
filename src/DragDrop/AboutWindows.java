package DragDrop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutWindows extends JFrame {
    private JLabel jsFirstName;
    private JTextField textField1;
    private JButton CLICKMEButton;
    private JPanel MainPanel;

    AboutWindows() {
        setContentPane(MainPanel);
        this.setTitle("GUI DESIGNER");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        CLICKMEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = textField1.getText();
                JOptionPane.showMessageDialog(AboutWindows.this, "Welcome "+firstName);
            }
        });
    }

    public static void main(String[] args) {
        AboutWindows aboutWindows = new AboutWindows();

    }

}
