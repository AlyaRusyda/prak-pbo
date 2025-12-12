package modul12;

import java.net.URL;
import javax.swing.*;

public class DemoLabel {
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setSize(600, 500);

        URL img = FrameB.class.getResource("shakehand2.png");
        ImageIcon ikon = new ImageIcon(img);
        JLabel label = new JLabel("Label", ikon, SwingConstants.CENTER);

        JPanel panel = new JPanel();
        panel.add(label);

        u.add(panel);

        u.setVisible(true);
    }
}
