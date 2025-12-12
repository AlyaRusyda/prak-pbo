package modul12;

import java.awt.Container;
import javax.swing.JButton;

public class FrameA extends javax.swing.JFrame {
    public FrameA() {
        super("Frame dan Button");
        setSize(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tambahkan komponen sebelum frame ditampilkan
        Container kontainer = getContentPane();
        JButton jbtOK = new JButton("OK");
        kontainer.add(jbtOK);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameA();
    }
}
