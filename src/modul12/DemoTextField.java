package modul12;

import javax.swing.*;

public class DemoTextField {
    public static void main(String[] args) {
        Utama u = new Utama();

        JLabel nama = new JLabel("Nama: ");
        JLabel password = new JLabel("Password: ");

        JTextField inputNama = new JTextField(15);
        JPasswordField inputpsw = new JPasswordField(15);

        JPanel panel = new JPanel();
        panel.add(nama);
        panel.add(inputNama);
        panel.add(password);
        panel.add(inputpsw);

        u.add(panel);

        u.setVisible(true);
    }
}
