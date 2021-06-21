package event.management.system;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class AddPaymentDetails extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JButton b1, b2, b3;
    private JComboBox comboBox;
    private JDateChooser dateChooser;

    public static void main(String[] args) {
        new AddPaymentDetails().setVisible(true);
    }

    public AddPaymentDetails() {
        setBounds(450, 300, 617, 363);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Event_id");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setBounds(40, 52, 87, 24);
        contentPane.add(lblNewLabel);

        JLabel lblStudentid = new JLabel("Student_id");
        lblStudentid.setForeground(Color.BLACK);
        lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblStudentid.setBounds(243, 52, 87, 24);
        contentPane.add(lblStudentid);

        JLabel lblBook = new JLabel("Event Name");
        lblBook.setForeground(Color.BLACK);
        lblBook.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblBook.setBounds(40, 98, 90, 24);
        contentPane.add(lblBook);

        JLabel lblName = new JLabel("Std Name");
        lblName.setForeground(Color.BLACK);
        lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblName.setBounds(300, 98, 71, 24);
        contentPane.add(lblName);

        JLabel lblCourse = new JLabel("Event Price");
        lblCourse.setForeground(Color.BLACK);
        lblCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCourse.setBounds(40, 143, 87, 24);
        contentPane.add(lblCourse);

        JLabel lblBranch = new JLabel("Paid");
        lblBranch.setForeground(Color.BLACK);
        lblBranch.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblBranch.setBounds(303, 144, 75, 24);
        contentPane.add(lblBranch);

        JLabel lblDateOfIssue = new JLabel("Register Date");
        lblDateOfIssue.setForeground(Color.BLACK);
        lblDateOfIssue.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblDateOfIssue.setBounds(40, 188, 105, 29);
        contentPane.add(lblDateOfIssue);

        JLabel lblDateOfReturn = new JLabel("Payment Date");
        lblDateOfReturn.setForeground(Color.BLACK);
        lblDateOfReturn.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblDateOfReturn.setBounds(40, 234, 118, 29);
        contentPane.add(lblDateOfReturn);

        textField = new JTextField();
        textField.setForeground(new Color(105, 105, 105));
        textField.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        textField.setBounds(110, 56, 105, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setForeground(new Color(105, 105, 105));
        textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        textField_1.setBounds(340, 56, 93, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setBounds(443, 52, 105, 29);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        textField_2 = new JTextField();
        textField_2.setEditable(false);
        textField_2.setForeground(new Color(0, 100, 0));
        textField_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        textField_2.setBounds(128, 102, 162, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setEditable(false);
        textField_3.setForeground(new Color(0, 100, 0));
        textField_3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        textField_3.setColumns(10);
        textField_3.setBounds(380, 102, 179, 20);
        contentPane.add(textField_3);

        textField_4 = new JTextField();
        textField_4.setEditable(false);
        textField_4.setForeground(new Color(0, 100, 0));
        textField_4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        textField_4.setColumns(10);
        textField_4.setBounds(128, 147, 162, 20);
        contentPane.add(textField_4);

        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Yes", "No"}));
        comboBox.setForeground(new Color(47, 79, 79));
        comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        comboBox.setBounds(380, 147, 179, 20);
        contentPane.add(comboBox);

        textField_6 = new JTextField();
        textField_6.setForeground(new Color(0, 100, 0));
        textField_6.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        textField_6.setEditable(false);
        textField_6.setColumns(10);
        textField_6.setBounds(167, 194, 162, 20);
        contentPane.add(textField_6);

        dateChooser = new JDateChooser();
        dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
        dateChooser.setBounds(167, 234, 172, 29);
        contentPane.add(dateChooser);

        b2 = new JButton("Add Payment Data");
        b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        b2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
        b2.setBounds(369, 179, 149, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        contentPane.add(b2);

        b3 = new JButton("Back");
        b3.addActionListener(this);
        b3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        b3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
        b3.setBounds(369, 231, 149, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 69, 0), 2, true), "Payment-Panel",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(220, 20, 60)));
        panel.setBounds(10, 24, 569, 269);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            conn con = new conn();
            if (ae.getSource() == b1) {
                String sql = "select * from registerevent where student_id = ? and event_id =?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, textField_1.getText());
                st.setString(2, textField.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    textField_2.setText(rs.getString("ename"));
                    textField_3.setText(rs.getString("sname"));
                    textField_4.setText(rs.getString("price"));
                    textField_6.setText(rs.getString("dateOfRegister"));
                }
                st.close();
                rs.close();

            }
            if (ae.getSource() == b2) {
                String sql = "insert into payment_data(event_id, student_id, ename, sname, event_price, is_paid, dateOfRegister, dateOfPayment) values(?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, textField.getText());
                st.setString(2, textField_1.getText());
                st.setString(3, textField_2.getText());
                st.setString(4, textField_3.getText());
                st.setString(5, textField_4.getText());
                st.setString(6, (String) comboBox.getSelectedItem());
                st.setString(7, textField_6.getText());

                st.setString(8, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                int i = st.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Payment Successful");
//                    delete();
                } else {
                    JOptionPane.showMessageDialog(null, "error");
                }
            }
            if (ae.getSource() == b3) {
                this.setVisible(false);
                new Home().setVisible(true);

            }
        } catch (Exception e) {

        }
    }
}
