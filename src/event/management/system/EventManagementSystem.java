package event.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EventManagementSystem extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1;

    public EventManagementSystem() {

        setSize(1300, 640);
        setLayout(null);
        setLocation(300, 300);

        l1 = new JLabel("");
        b1 = new JButton("Next");
        b1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        b1.setFont(new Font("Dialog", Font.BOLD, 18));
        b1.addMouseListener(new MouseAdapter() {
            Color color = b1.getForeground();

            public void mouseEntered(MouseEvent me) {
                color = b1.getForeground();
                b1.setForeground(Color.WHITE); // change the color to green when mouse over a button
                b1.setBackground(Color.lightGray);
            }

            public void mouseExited(MouseEvent me) {
                b1.setForeground(color);
                b1.setBackground(Color.WHITE);
            }
        });

        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("event/management/system/icons/k-01.jpeg"));
        Image i3 = i1.getImage().getScaledInstance(1300, 620, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        l1 = new JLabel(i2);

        b1.setBounds(900, 390, 200, 60);
        l1.setBounds(0, 0, 1300, 600);

        l1.add(b1);
        add(l1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        new Login_user().setVisible(true);
        this.setVisible(false);

    }

    public static void main(String[] args) {
        EventManagementSystem window = new EventManagementSystem();
        window.setVisible(true);
    }
}
