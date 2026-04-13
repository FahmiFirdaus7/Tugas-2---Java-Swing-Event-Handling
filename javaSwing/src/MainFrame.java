import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
    private JTextField sisi, panjang, lebar, tinggi;
    private JLabel hasilPersegi, hasilBalok;

    public MainFrame() {
        setTitle("Perhitungan Persegi & Balok");
        setSize(400, 350);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // === PERSEGI ===
        JLabel label1 = new JLabel("Sisi:");
        label1.setBounds(30, 30, 80, 25);
        add(label1);

        sisi = new JTextField();
        sisi.setBounds(120, 30, 100, 25);
        add(sisi);

        JButton hitungPersegi = new JButton("Hitung Persegi");
        hitungPersegi.setBounds(230, 30, 130, 25);
        add(hitungPersegi);

        hasilPersegi = new JLabel("Hasil:");
        hasilPersegi.setBounds(120, 60, 200, 25);
        add(hasilPersegi);

        // === BALOK ===
        JLabel label2 = new JLabel("Panjang:");
        label2.setBounds(30, 110, 80, 25);
        add(label2);

        panjang = new JTextField();
        panjang.setBounds(120, 110, 100, 25);
        add(panjang);

        JLabel label3 = new JLabel("Lebar:");
        label3.setBounds(30, 140, 80, 25);
        add(label3);

        lebar = new JTextField();
        lebar.setBounds(120, 140, 100, 25);
        add(lebar);

        JLabel label4 = new JLabel("Tinggi:");
        label4.setBounds(30, 170, 80, 25);
        add(label4);

        tinggi = new JTextField();
        tinggi.setBounds(120, 170, 100, 25);
        add(tinggi);

        JButton hitungBalok = new JButton("Hitung Balok");
        hitungBalok.setBounds(230, 140, 130, 25);
        add(hitungBalok);

        hasilBalok = new JLabel("Hasil:");
        hasilBalok.setBounds(120, 200, 250, 25);
        add(hasilBalok);

        // Tombol Reset
        JButton reset = new JButton("Reset");
        reset.setBounds(150, 250, 80, 30);
        add(reset);

        // === EVENT HANDLING ===

        // Hitung Persegi
        hitungPersegi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double s = Double.parseDouble(sisi.getText());
                    double luas = s * s;
                    hasilPersegi.setText("Luas Persegi: " + luas);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, 
                        "Input sisi harus angka!", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Hitung Balok
        hitungBalok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double p = Double.parseDouble(panjang.getText());
                    double l = Double.parseDouble(lebar.getText());
                    double t = Double.parseDouble(tinggi.getText());

                    double volume = p * l * t;

                    hasilBalok.setText("Volume Balok: " + volume);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, 
                        "Semua input harus angka!", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Reset
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sisi.setText("");
                panjang.setText("");
                lebar.setText("");
                tinggi.setText("");
                hasilPersegi.setText("Hasil:");
                hasilBalok.setText("Hasil:");
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}