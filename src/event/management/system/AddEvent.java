package event.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import java.sql.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class AddEvent extends JFrame implements ActionListener {

    private JPanel contentPane;
    JDateChooser startdateChooser, enddateChooser;
    private JTextField t1, t2, t3, t4, t5, t6;
    private JButton b1, b2;
    JComboBox comboBox;

    public static void main(String[] args) {
        new AddEvent().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
        t1.setText("" + rd.nextInt(1000 + 1));
    }

    public AddEvent() {
        setBounds(600, 200, 518, 442);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("Start Date");
        l1.setForeground(new Color(47, 79, 79));
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(73, 84, 90, 22);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Title");
        l2.setForeground(new Color(47, 79, 79));
        l2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l2.setBounds(73, 117, 90, 22);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Description");
        l3.setForeground(new Color(47, 79, 79));
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(73, 150, 90, 22);
        contentPane.add(l3);

        JLabel l4 = new JLabel("End Date");
        l4.setForeground(new Color(47, 79, 79));
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(73, 216, 90, 22);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Price");
        l5.setForeground(new Color(47, 79, 79));
        l5.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l5.setBounds(73, 249, 90, 22);
        contentPane.add(l5);

        JLabel l6 = new JLabel("Event_id");
        l6.setForeground(new Color(47, 79, 79));
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setBounds(73, 51, 90, 22);
        contentPane.add(l6);

        t1 = new JTextField();
        t1.setForeground(new Color(47, 79, 79));
        t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t1.setBounds(169, 54, 198, 20);
        contentPane.add(t1);
        t1.setColumns(10);

        startdateChooser = new JDateChooser();
        startdateChooser.setDateFormatString("yyyy-MM-dd");
        startdateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        startdateChooser.setForeground(new Color(105, 105, 105));
        startdateChooser.setBounds(169, 87, 198, 20);
        contentPane.add(startdateChooser);

        t3 = new JTextField();
        t3.setForeground(new Color(47, 79, 79));
        t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t3.setColumns(10);
        t3.setBounds(169, 120, 198, 20);
        contentPane.add(t3);

        t4 = new JTextField();
        t4.setForeground(new Color(47, 79, 79));
        t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t4.setColumns(10);
        t4.setBounds(169, 153, 198, 20);
        contentPane.add(t4);

        enddateChooser = new JDateChooser();
        enddateChooser.setDateFormatString("yyyy-MM-dd");
        enddateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        enddateChooser.setForeground(new Color(105, 105, 105));
        enddateChooser.setBounds(169, 219, 198, 20);
        contentPane.add(enddateChooser);

        t6 = new JTextField();
        t6.setForeground(new Color(47, 79, 79));
        t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t6.setColumns(10);
        t6.setBounds(169, 252, 198, 20);
        contentPane.add(t6);

        b1 = new JButton("Add");
        b1.addActionListener(this);
        b1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        b1.setBounds(102, 300, 100, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        b2.setBounds(212, 300, 108, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        contentPane.add(b2);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(138, 43, 226), 2), "Add Event", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(0, 0, 255)));
        panel.setBounds(10, 29, 398, 344);
        contentPane.add(panel);

        panel.setBackground(Color.WHITE);
        contentPane.setBackground(Color.WHITE);
        random();

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            conn con = new conn();
            boolean dateValid = true;
            if (ae.getSource() == b1) {
                if (!((JTextField) startdateChooser.getDateEditor().getUiComponent()).getText().isEmpty() || !((JTextField) enddateChooser.getDateEditor().getUiComponent()).getText().isEmpty()) {
                    dateValid = date.isDateAfter(((JTextField) startdateChooser.getDateEditor().getUiComponent()).getText(), ((JTextField) enddateChooser.getDateEditor().getUiComponent()).getText());
                }
                if (t1.getText().trim().isEmpty() || t3.getText().trim().isEmpty() || t4.getText().trim().isEmpty() || t6.getText().trim().isEmpty() || ((JTextField) startdateChooser.getDateEditor().getUiComponent()).getText().isEmpty() || ((JTextField) enddateChooser.getDateEditor().getUiComponent()).getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Field(s) are empty");
                } else {
                    if (!t1.getText().matches("-?\\d+")) {
                        JOptionPane.showMessageDialog(null, "Event ID should be Interger");
                    } else if (!t6.getText().matches("-?\\d+")) {
                        JOptionPane.showMessageDialog(null, "Price should be Interger");
                    } else if (!dateValid) {
                        JOptionPane.showMessageDialog(null, "End-date shoud be greater than Start-date");
                    } else {
                        String sql = "insert into event(event_id, title, start_date, description, price, end_date) values(?, ?, ?, ?, ?, ?)";
                        PreparedStatement st = con.c.prepareStatement(sql);
                        // st.setInt(1, Integer.parseInt(textField.getText()));
                        st.setString(1, t1.getText());
                        st.setString(2, t3.getText());
                        st.setString(3, ((JTextField) startdateChooser.getDateEditor().getUiComponent()).getText());
                        st.setString(4, t4.getText());
                        st.setString(5, t6.getText());
                        st.setString(6, ((JTextField) enddateChooser.getDateEditor().getUiComponent()).getText());

                        int rs = st.executeUpdate();
                        if (rs > 0) {
                            JOptionPane.showMessageDialog(null, "Successfully Added");
                            t1.setText("");
                            t2.setText("");
                            t3.setText("");
                            t4.setText("");
                            t5.setText("");
                            t6.setText("");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error");
                        }
                        t1.setText("");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                        t5.setText("");
                        t6.setText("");
                        st.close();
                    }
                }
            }
            if (ae.getSource() == b2) {
                this.setVisible(false);
                new Home().setVisible(true);

            }
            con.c.close();
        } catch (Exception e) {

        }
    }
}
