package latquiz_uas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormUsia extends JFrame {

    public FormUsia() {
        setTitle("Form Usia");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblUsia = new JLabel("Masukkan Usia Anda");
        JTextField txtUsia = new JTextField(15);
        JCheckBox cbSetuju = new JCheckBox("Saya setuju");
        JButton btnSubmit = new JButton("Submit");
        JLabel lblOutput = new JLabel("");

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbSetuju.isSelected()) {
                    lblOutput.setText("Data berhasil dikirim");
                } else {
                    lblOutput.setText("Silakan centang persetujuan");
                }
            }
        });

        add(lblUsia);
        add(txtUsia);
        add(cbSetuju);
        add(btnSubmit);
        add(lblOutput);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FormUsia();
    }
}
