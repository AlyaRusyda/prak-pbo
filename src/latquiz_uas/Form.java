package latquiz_uas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form extends JFrame {
    public Form() {
        setTitle("Form Usia");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel usia = new JLabel("Masukkan Usia Anda");
        JTextField inputUsia = new JTextField(15);
        JCheckBox check = new JCheckBox("Saya setuju");
        JButton submit = new JButton("Submit");
        JLabel output = new JLabel("");
        
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (check.isSelected()) {
                    output.setText("Data berhasil dikirim");
                } else {
                    output.setText("Silakan centang persetujuan");
                }
            }
        });
        
        add(usia);
        add(inputUsia);
        add(check);
        add(submit);
        add(output);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Form();
    }
}
