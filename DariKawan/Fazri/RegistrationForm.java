package DariKawan.Fazri; // ganti sesuai package atau hapus baris ini jika tidak dalam package apapun

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

/*
 * Nama     : M. Fazri Nizar
 * Kelas    : TI Reguler L1
 * NIM      : 09021282328053
 * Tugas    : Mengimplementasikan UI (GUI) untuk Borang Pendaftaran Member
 * Nama File: RegistrationForm.java
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class RegistrationForm extends JFrame {

    public RegistrationForm() {

        super("Borang Pendaftaran Member");

        JLabel titleLabel = new JLabel("Form Registrasi", JLabel.CENTER);
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));

        JLabel nameLabel = new JLabel("Nama*:");
        JLabel emailLabel = new JLabel("Email*:");
        JLabel passwordLabel = new JLabel("Password*:");
        JLabel confirmPasswordLabel = new JLabel("Konfirmasi Password*:");
        JLabel countryLabel = new JLabel("Negara:");
        JLabel provinceLabel = new JLabel("Provinsi:");
        JLabel phoneNumberLabel = new JLabel("Nomor Telepon:");
        JLabel requiredLabel = new JLabel("* Wajib Diisi");

        JTextField nameTextField = new JTextField(20);
        JTextField emailTextField = new JTextField(20);
        JTextField countryTextField = new JTextField(20);
        JTextField provinceTextField = new JTextField(20);
        JTextField phoneNumberTextField = new JTextField(20);

        JPasswordField passwordField = new JPasswordField(20);
        JPasswordField confirmPasswordField = new JPasswordField(20);

        JButton registerButton = new JButton("Daftar");
        JButton clearButton = new JButton("Ambil Data");
        JButton deleteButton = new JButton("Hapus");

        JPanel formPanel = new JPanel(new GridLayout(8, 2, 0, 10)); // 8 baris, 2 kolom, 10 pixels gap secara vertical

        formPanel.add(nameLabel);
        formPanel.add(nameTextField);
        formPanel.add(emailLabel);
        formPanel.add(emailTextField);
        formPanel.add(passwordLabel);
        formPanel.add(passwordField);
        formPanel.add(confirmPasswordLabel);
        formPanel.add(confirmPasswordField);
        formPanel.add(countryLabel);
        formPanel.add(countryTextField);
        formPanel.add(provinceLabel);
        formPanel.add(provinceTextField);
        formPanel.add(phoneNumberLabel);
        formPanel.add(phoneNumberTextField);
        formPanel.add(requiredLabel);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(formPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new GridLayout(1, 3, 10, 0)); // 1 baris, 3 kolom, 10 pixels gap secara horizontal

        bottomPanel.add(registerButton);
        bottomPanel.add(clearButton);
        bottomPanel.add(deleteButton);
        panel.add(bottomPanel, BorderLayout.PAGE_END);

        this.add(panel);

        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // Supaya warna windows-nya merah (sesuai SS)
    public static void setRedWindowTheme() {
        UIManager.put("activeCaption", new javax.swing.plaf.ColorUIResource(Color.RED));
        UIManager.put("activeCaptionText", new javax.swing.plaf.ColorUIResource(Color.WHITE));
        JFrame.setDefaultLookAndFeelDecorated(true);
    }

    public static void main(String[] args) {
        setRedWindowTheme();
        new RegistrationForm();
    }
}
