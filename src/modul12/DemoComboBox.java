package modul12;

import javax.swing.*;

public class DemoComboBox {
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setSize(500, 100);

        String[] pilihan = {
            "Sangat tidak setuju",
            "Tidak setuju",
            "Kurang setuju",
            "Setuju",
            "Sangat setuju"
        };

        JComboBox<String> combo = new JComboBox<>(pilihan);

        JPanel panel = new JPanel();
        JLabel pernyataan = new JLabel(
            "Modul Praktikum Pemrograman Berorientasi Objek jelas dan mudah."
        );

        panel.add(pernyataan);
        panel.add(combo);

        u.add(panel);
        u.setVisible(true);
    }
}
