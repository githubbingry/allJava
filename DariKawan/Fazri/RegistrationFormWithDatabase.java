package DariKawan.Fazri; // ganti sesuai package atau hapus baris ini jika tidak dalam package apapun

// Java AWT untuk membantu membuat UI (User Interface) dan Event Handling.
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
// Java I/O untuk menulis data ke file.
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// Java.net untuk membuat HTTP Request dan Response terhadap SQLite Database yang di-host.
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
// Untuk keamanan password (hashing + salt)
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
// Java Time untuk mendapatkan waktu saat ini yang terformat.
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
// Java utility untuk membuat List dan mengkonversi List menjadi List yang lain.
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Consumer;
// Java utility untuk memanipulasi String dengan Regular Expression (RegEx)
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

// Initialized for github.com/mfazrinizar

/*
 * Nama     : M. Fazri Nizar
 * Kelas    : TI Reguler L1
 * NIM      : 09021282328053
 * Tugas    : Mengimplementasikan UI (GUI) & Backend (Logical Process) untuk Borang Pendaftaran Member
 * Nama File: RegistrationFormWithDatabase.java
 */

/*
 * DONE:
 * 1. * jika terisi semua, pop dialog "Berhasil didaftarkan." (wajib, selesai)
 * 2. Selain itu, pop dialog "Beberapa bidang formulir yang wajib diisi masih kosong." (wajib, selesai)
 * 3. Membuat validasi dan filter untuk TextField (opsional, selesai).
 * 4. Membuat TextField menggunakan JComboBox dengan kemampuan prediction untuk autocomplete (opsional, selesai).
 * 5. Membuat algoritma hashing (SHA-512) dan salt (SHA1PRNG x Base64) untuk keamanan penyimpanan password (opsional, selesai).
 * 6. Mengintegrasikan dan mengimplementasikan CRUD dengan Relational Database (RDB) SQLite yang dideploy ke CloudFlare Workers (opsional, selesai).
 * 7. Mengambil data dari TextField atau database dan menuliskan ke file teks sesuai directory yang dipilih (opsional, selesai).
 * 8. Membuat progressbar dan mengimplementasikan async process agar tidak membekukan UI saat proses berlangsung (opsional, selesai).
 */

// Komponen-komponen Java Swing yang digunakan untuk membuat UI (User Interface) dengan JFrame, JLabel, JTextField, JPasswordField, JButton, dan lain-lain.
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
// Java Swing untuk membuat Concurrent Task (Async Task) dan Callback Result untuk diolah agar UI tidak membeku saat proses berlangsung.
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
// Java Swing untuk memanajemen Look, Feel, Color, dan Style dari UI (User Interface) Window.
import javax.swing.UIManager;
// Java Swing untuk membuat filter terhadap TextField.
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class RegistrationFormWithDatabase extends JFrame {
    private JTextField nameTextField;
    private JTextField emailTextField;
    private JTextField countryTextField;
    private JTextField provinceTextField;
    private JTextField phoneNumberTextField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JLabel nameErrorLabel;
    private JLabel emailErrorLabel;
    private JLabel passwordErrorLabel;
    private JLabel confirmPasswordErrorLabel;
    private JLabel phoneNumberErrorLabel;
    AutoCompleteComboBox countryComboBox;

    HttpClient client = HttpClient.newHttpClient();

    public RegistrationFormWithDatabase() {
        super("Borang Pendaftaran Member");
        // warmUpHttpRequestAsync("https://google.com");

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

        nameTextField = new JTextField(20);
        emailTextField = new JTextField(20);
        countryTextField = new JTextField(20);

        List<String> countries = Arrays.asList("United States", "Canada", "Afghanistan", "Albania", "Algeria",
                "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and/or Barbuda", "Argentina",
                "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh",
                "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia",
                "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory",
                "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Cape Verde",
                "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island",
                "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Cook Islands", "Costa Rica",
                "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica",
                "Dominican Republic", "East Timor", "Ecudaor", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea",
                "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France",
                "France, Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon",
                "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe",
                "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands",
                "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)",
                "Iraq", "Ireland", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan",
                "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kosovo", "Kuwait",
                "Kyrgyzstan", "Lao People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia",
                "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia",
                "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique",
                "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of",
                "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar",
                "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand",
                "Nicaragua", "Niger", "Nigeria", "Niue", "Norfork Island", "Northern Mariana Islands", "Norway", "Oman",
                "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn",
                "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda",
                "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino",
                "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore",
                "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa",
                "South Georgia South Sandwich Islands", "South Sudan", "Spain", "Sri Lanka", "St. Helena",
                "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbarn and Jan Mayen Islands", "Swaziland", "Sweden",
                "Switzerland", "Syrian Arab Republic", "Taiwan", "Tajikistan", "Tanzania, United Republic of",
                "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan",
                "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom",
                "United States minor outlying islands", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City State",
                "Venezuela", "Vietnam", "Virigan Islands (British)", "Virgin Islands (U.S.)",
                "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zaire", "Zambia", "Zimbabwe");
        countryComboBox = new AutoCompleteComboBox(countries);

        provinceTextField = new JTextField(20);
        phoneNumberTextField = new JTextField(20);
        ((AbstractDocument) phoneNumberTextField.getDocument()).setDocumentFilter(new PhoneNumberTextFieldFilter());

        passwordField = new JPasswordField(20);
        confirmPasswordField = new JPasswordField(20);

        nameErrorLabel = new JLabel("");
        nameErrorLabel.setForeground(Color.RED);
        emailErrorLabel = new JLabel("");
        emailErrorLabel.setForeground(Color.RED);
        passwordErrorLabel = new JLabel("");
        passwordErrorLabel.setForeground(Color.RED);
        confirmPasswordErrorLabel = new JLabel("");
        confirmPasswordErrorLabel.setForeground(Color.RED);
        phoneNumberErrorLabel = new JLabel("");
        phoneNumberErrorLabel.setForeground(Color.RED);

        JButton registerButton = new JButton("Daftar");
        JButton getDataButton = new JButton("Ambil Data");
        JButton deleteButton = new JButton("Hapus");

        registerButton.addActionListener(new RegisterButtonListener());
        getDataButton.addActionListener(new GetDataButtonListener());
        deleteButton.addActionListener(new DeleteButtonListener());

        JPanel formPanel = new JPanel(new GridLayout(8, 2, 0, 10)); // 8 baris, 2 kolom, 10 pixels gap secara vertical

        JPanel namePanel = new JPanel(new BorderLayout());
        namePanel.add(nameTextField, BorderLayout.CENTER);
        namePanel.add(nameErrorLabel, BorderLayout.PAGE_END);
        formPanel.add(nameLabel);
        formPanel.add(namePanel);

        JPanel emailPanel = new JPanel(new BorderLayout());
        emailPanel.add(emailTextField, BorderLayout.CENTER);
        emailPanel.add(emailErrorLabel, BorderLayout.PAGE_END);
        formPanel.add(emailLabel);
        formPanel.add(emailPanel);

        JPanel passwordPanel = new JPanel(new BorderLayout());
        passwordPanel.add(passwordField, BorderLayout.CENTER);
        passwordPanel.add(passwordErrorLabel, BorderLayout.PAGE_END);
        formPanel.add(passwordLabel);
        formPanel.add(passwordPanel);

        JPanel confirmPasswordPanel = new JPanel(new BorderLayout());
        confirmPasswordPanel.add(confirmPasswordField, BorderLayout.CENTER);
        confirmPasswordPanel.add(confirmPasswordErrorLabel, BorderLayout.PAGE_END);
        formPanel.add(confirmPasswordLabel);
        formPanel.add(confirmPasswordPanel);

        formPanel.add(countryLabel);
        formPanel.add(countryComboBox);
        formPanel.add(provinceLabel);
        formPanel.add(provinceTextField);

        JPanel phoneNumberPanel = new JPanel(new BorderLayout());
        phoneNumberPanel.add(phoneNumberTextField, BorderLayout.CENTER);
        phoneNumberPanel.add(phoneNumberErrorLabel, BorderLayout.PAGE_END);
        formPanel.add(phoneNumberLabel);
        formPanel.add(phoneNumberPanel);

        formPanel.add(requiredLabel);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(formPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new GridLayout(1, 3, 10, 0)); // 1 baris, 3 kolom, 10 pixels gap secara
                                                                      // horizontal
        bottomPanel.add(registerButton);
        bottomPanel.add(getDataButton);
        bottomPanel.add(deleteButton);
        panel.add(bottomPanel, BorderLayout.PAGE_END);

        this.add(panel);

        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class RegisterButtonListener implements ActionListener {
        // Hard-Coded ID dan API Key, seharusnya terdapat di environment variables atau
        // di-request dari server
        // API Credential (ACCOUNT_ID, DATABASE_ID, dan BEARER_TOKEN) sewaktu-waktu
        // dapat berubah
        // Kontak developer jika sudah tidak valid (dari GitHub di atas)
        private final String ACCOUNT_ID = "YWVmZmYzZjI5NjlhY2ZlNmQwMzAwN2I5NGY4ZDgyMmM=";
        private final String DATABASE_ID = "N2JkMTk4ZTAtZjk4Ni00ZGI2LWFjYTQtOTAwYmQ2ZGI3MmQ5";
        private final String API_URL = "https://api.cloudflare.com/client/v4/accounts/"
                + new String(Base64.getUrlDecoder().decode(ACCOUNT_ID), StandardCharsets.UTF_8)
                + "/d1/database/"
                + new String(Base64.getUrlDecoder().decode(DATABASE_ID), StandardCharsets.UTF_8) + "/query";
        private final String BEARER_TOKEN = new String(
                Base64.getUrlDecoder().decode("MmJobm9ycHBObWhsTDlSUjNLLVRaSy1CMmRXbnFUalFZdThralM0ZQ=="),
                StandardCharsets.UTF_8);

        @Override
        public void actionPerformed(ActionEvent e) {
            clearInvalidLabel();

            if (isMandatoryFieldEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Semua atau beberapa bidang formulir yang wajib diisi masih kosong.");
            } else {
                if (isFormValid()) {
                    doesEmailExistAsync(emailTextField.getText(), API_URL, BEARER_TOKEN, exists -> {
                        if (exists) {
                            emailErrorLabel.setText("Email sudah terdaftar.");
                            JOptionPane.showMessageDialog(null, "Email sudah terdaftar. Gunakan email lain.");
                        } else {
                            registerUserAsync(API_URL, BEARER_TOKEN, success -> {
                                if (success) {
                                    System.out.println("Registrasi Sukses.");
                                } else {
                                    System.out.println("Registrasi Gagal.");
                                }
                            });
                        }
                    });
                }
            }
        }
    }

    class GetDataButtonListener implements ActionListener {
        // Hard-Coded ID dan API Key, seharusnya terdapat di environment variables atau
        // di-request dari server
        // API Credential (ACCOUNT_ID, DATABASE_ID, dan BEARER_TOKEN) sewaktu-waktu
        // dapat berubah
        // Kontak developer jika sudah tidak valid (dari GitHub di atas)
        private final String ACCOUNT_ID = "YWVmZmYzZjI5NjlhY2ZlNmQwMzAwN2I5NGY4ZDgyMmM=";
        private final String DATABASE_ID = "N2JkMTk4ZTAtZjk4Ni00ZGI2LWFjYTQtOTAwYmQ2ZGI3MmQ5";
        private final String API_URL = "https://api.cloudflare.com/client/v4/accounts/"
                + new String(Base64.getUrlDecoder().decode(ACCOUNT_ID), StandardCharsets.UTF_8)
                + "/d1/database/"
                + new String(Base64.getUrlDecoder().decode(DATABASE_ID), StandardCharsets.UTF_8) + "/query";
        private final String BEARER_TOKEN = new String(
                Base64.getUrlDecoder().decode("MmJobm9ycHBObWhsTDlSUjNLLVRaSy1CMmRXbnFUalFZdThralM0ZQ=="),
                StandardCharsets.UTF_8);

        @Override
        public void actionPerformed(ActionEvent e) {
            clearInvalidLabel();

            Object[] options = { "TextField", "Database" };
            int n = JOptionPane.showOptionDialog(null,
                    "Dari mana Anda ingin mengambil data?",
                    "Pilih Sumber Data",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (n == JOptionPane.YES_OPTION) { // TextField dipilih
                if (isMandatoryFieldEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Semua atau beberapa bidang formulir yang wajib diisi masih kosong.");
                } else if (isFormValid()) {

                    JFileChooser fileChooser = new JFileChooser();
                    if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                        File file = fileChooser.getSelectedFile();
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file + ".txt"))) {
                            writer.write(
                                    "Waktu: " + getCurrentZonedTime()
                                            + " (WIB, Data Diambil dari TextField Langsung)");
                            writer.newLine();
                            writer.write("Nama: " + nameTextField.getText());
                            writer.newLine();
                            writer.write("Email: " + emailTextField.getText());
                            writer.newLine();
                            writer.write(
                                    "Negara: " + countryComboBox.getItemAt(countryComboBox.getSelectedIndex()));
                            writer.newLine();
                            writer.write("Provinsi: " + provinceTextField.getText());
                            writer.newLine();
                            writer.write("Nomor Telepon: " + phoneNumberTextField.getText());
                            writer.newLine();
                            JOptionPane.showMessageDialog(null, "Data Terambil dari TextField.");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            } else if (n == JOptionPane.NO_OPTION) { // Database dipilih
                JPanel panel = new JPanel(new GridLayout(2, 2));
                JTextField getDataEmailField = new JTextField();
                JPasswordField getDataPasswordField = new JPasswordField();
                panel.add(new JLabel("Email:"));
                panel.add(getDataEmailField);
                panel.add(new JLabel("Password:"));
                panel.add(getDataPasswordField);

                int result = JOptionPane.showConfirmDialog(null, panel, "Masukkan email dan password terdaftar",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (result == JOptionPane.OK_OPTION) {
                    String inputEmail = getDataEmailField.getText();
                    String inputPassword = new String(getDataPasswordField.getPassword());

                    boolean emailInvalid = !FormValidator.isEmailValid(inputEmail);
                    boolean passwordInvalid = !FormValidator.isPasswordValid(inputPassword);

                    if (emailInvalid || passwordInvalid) {
                        if (emailInvalid)
                            JOptionPane.showMessageDialog(null, "Email tidak valid.");
                        if (passwordInvalid)
                            JOptionPane.showMessageDialog(null, "Password minimal 8 karakter.");
                    } else {
                        checkPasswordAsync(inputEmail, inputPassword, API_URL, BEARER_TOKEN,
                                passwordCheckResult -> {

                                    System.out.println("Password check result: " + passwordCheckResult);

                                    if (passwordCheckResult.equals("CORRECT")) {
                                        int dialogResult = JOptionPane.showConfirmDialog(null,
                                                "Email dan Password benar, klik OK untuk melanjutkan", "Konfirmasi",
                                                JOptionPane.OK_CANCEL_OPTION);
                                        if (dialogResult == JOptionPane.OK_OPTION) {

                                            getUserDataAsync(inputEmail, API_URL, BEARER_TOKEN, userData -> {
                                                if (userData != null) {
                                                    JFileChooser fileChooser = new JFileChooser();
                                                    if (fileChooser
                                                            .showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                                                        File file = fileChooser.getSelectedFile();
                                                        try (BufferedWriter writer = new BufferedWriter(
                                                                new FileWriter(file + ".txt"))) {
                                                            writer.write(
                                                                    "Waktu Saat Diambil: " + getCurrentZonedTime()
                                                                            + " (WIB, Data Diambil dari Database)");
                                                            writer.newLine();
                                                            writer.write("Nama: " + userData[0]);
                                                            writer.newLine();
                                                            writer.write("Email: " + userData[1]);
                                                            writer.newLine();
                                                            writer.write("Negara: " + userData[2]);
                                                            writer.newLine();
                                                            writer.write("Provinsi: " + userData[3]);
                                                            writer.newLine();
                                                            writer.write("Nomor Telepon: " + userData[4]);
                                                            writer.newLine();
                                                            writer.write(
                                                                    "Waktu Saat Terdaftar: " + userData[5]
                                                                            + " (WIB)");
                                                            writer.newLine();
                                                            JOptionPane.showMessageDialog(null,
                                                                    "Data Terambil dari Database");
                                                        } catch (IOException ex) {
                                                            JOptionPane.showMessageDialog(null,
                                                                    "Terdapat masalah. Coba lagi atau hubungi developer. ");
                                                            ex.printStackTrace();
                                                        }
                                                    }
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Gagal mendapatkan data. Coba lagi atau hubungi developer.");
                                                }
                                            });
                                        }
                                    } else if (passwordCheckResult.equals("INCORRECT")) {
                                        JOptionPane.showMessageDialog(null, "Email atau Password salah.");
                                    } else if (passwordCheckResult.equals("EMAIL-DOES-NOT-EXIST")) {
                                        JOptionPane.showMessageDialog(null, "Email atau Password salah."); // Menghindari
                                                                                                           // brute
                                                                                                           // force
                                    } else if (passwordCheckResult.equals("BAD-REQUEST")) {
                                        JOptionPane.showMessageDialog(null,
                                                "Gagal mendapatkan data. Coba lagi (kode: " + passwordCheckResult
                                                        + ")");
                                    } else if (passwordCheckResult.equals("BAD-RESPONSE")) {
                                        JOptionPane.showMessageDialog(null,
                                                "Gagal mendapatkan data. Cek koneksi internet Anda atau hubungi developer (kode: "
                                                        + passwordCheckResult + ")");
                                    } else if (passwordCheckResult.equals("BAD-FORMAT")) {
                                        JOptionPane.showMessageDialog(null,
                                                "Gagal mendapatkan data. Hubungi developer (kode: "
                                                        + passwordCheckResult
                                                        + ")");
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "Gagal mendapatkan data. Hubungi developer.");
                                    }
                                });
                    }
                }
            }
        }
    }

    // Menghapus semua value yang diinput dalam TextField.
    class DeleteButtonListener implements ActionListener {
        // Hard-Coded ID dan API Key, seharusnya terdapat di environment variables atau
        // di-request dari server
        // API Credential (ACCOUNT_ID, DATABASE_ID, dan BEARER_TOKEN) sewaktu-waktu
        // dapat berubah
        // Kontak developer jika sudah tidak valid (dari GitHub di atas)
        private final String ACCOUNT_ID = "YWVmZmYzZjI5NjlhY2ZlNmQwMzAwN2I5NGY4ZDgyMmM=";
        private final String DATABASE_ID = "N2JkMTk4ZTAtZjk4Ni00ZGI2LWFjYTQtOTAwYmQ2ZGI3MmQ5";
        private final String API_URL = "https://api.cloudflare.com/client/v4/accounts/"
                + new String(Base64.getUrlDecoder().decode(ACCOUNT_ID), StandardCharsets.UTF_8)
                + "/d1/database/"
                + new String(Base64.getUrlDecoder().decode(DATABASE_ID), StandardCharsets.UTF_8) + "/query";
        private final String BEARER_TOKEN = new String(
                Base64.getUrlDecoder().decode("MmJobm9ycHBObWhsTDlSUjNLLVRaSy1CMmRXbnFUalFZdThralM0ZQ=="),
                StandardCharsets.UTF_8);

        @Override
        public void actionPerformed(ActionEvent e) {
            Object[] options = { "TextField", "Database" };
            int n = JOptionPane.showOptionDialog(null,
                    "Dari mana Anda ingin menghapus data?",
                    "Pilih Sumber Data",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (n == JOptionPane.YES_OPTION) { // TextField dipilih
                clearInvalidLabel();
                nameTextField.setText("");
                emailTextField.setText("");
                passwordField.setText("");
                confirmPasswordField.setText("");
                countryTextField.setText("");
                provinceTextField.setText("");
                phoneNumberTextField.setText("");
                emailErrorLabel.setText("");
                countryComboBox.setSelectedIndex(0);

            } else if (n == JOptionPane.NO_OPTION) { // Database dipilih
                JPanel panel = new JPanel(new GridLayout(2, 2));
                JTextField deleteDataEmailField = new JTextField();
                JPasswordField deleteDataPasswordField = new JPasswordField();
                panel.add(new JLabel("Email:"));
                panel.add(deleteDataEmailField);
                panel.add(new JLabel("Password:"));
                panel.add(deleteDataPasswordField);

                int result = JOptionPane.showConfirmDialog(null, panel, "Masukkan email dan password terdaftar",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (result == JOptionPane.OK_OPTION) {
                    String inputEmail = deleteDataEmailField.getText();
                    String inputPassword = new String(deleteDataPasswordField.getPassword());

                    boolean emailInvalid = !FormValidator.isEmailValid(inputEmail);
                    boolean passwordInvalid = !FormValidator.isPasswordValid(inputPassword);

                    if (emailInvalid || passwordInvalid) {
                        if (emailInvalid)
                            JOptionPane.showMessageDialog(null, "Email tidak valid.");
                        if (passwordInvalid)
                            JOptionPane.showMessageDialog(null, "Password minimal 8 karakter.");
                    } else {
                        checkPasswordAsync(inputEmail, inputPassword, API_URL, BEARER_TOKEN,
                                passwordCheckResult -> {
                                    if (passwordCheckResult.equals("CORRECT")) {
                                        int dialogResult = JOptionPane.showConfirmDialog(null,
                                                "Email dan Password benar, klik OK untuk menghapus data", "Konfirmasi",
                                                JOptionPane.OK_CANCEL_OPTION);
                                        if (dialogResult == JOptionPane.OK_OPTION) {
                                            deleteUserDataAsync(inputEmail, API_URL, BEARER_TOKEN, deleteIsSuccess -> {
                                                if (deleteIsSuccess) {
                                                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Gagal menghapus data. Coba lagi atau hubungi developer.");
                                                }
                                            });
                                        }
                                    } else if (passwordCheckResult.equals("INCORRECT")) {
                                        JOptionPane.showMessageDialog(null, "Email atau Password salah");
                                    } else if (passwordCheckResult.equals("EMAIL-DOES-NOT-EXIST")) {
                                        JOptionPane.showMessageDialog(null, "Email atau Password salah."); // Menghindari
                                                                                                           // brute
                                                                                                           // force
                                    } else if (passwordCheckResult.equals("BAD-REQUEST")) {
                                        JOptionPane.showMessageDialog(null,
                                                "Gagal menghapus data. Coba lagi (kode: " + passwordCheckResult + ")");
                                    } else if (passwordCheckResult.equals("BAD-RESPONSE")) {
                                        JOptionPane.showMessageDialog(null,
                                                "Gagal menghapus data. Cek koneksi internet Anda atau hubungi developer (kode: "
                                                        + passwordCheckResult + ")");
                                    } else if (passwordCheckResult.equals("BAD-FORMAT")) {
                                        JOptionPane.showMessageDialog(null,
                                                "Gagal menghapus data. Hubungi developer (kode: " + passwordCheckResult
                                                        + ")");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Gagal menghapus data. Hubungi developer.");
                                    }
                                });
                    }
                }
            }
        }
    }

    // Memfilter value input dalam TextField untuk nomor telepon agar hanya menerima
    // karakter digit/angka, tanda +, dan tanda whitespace ( ).
    class PhoneNumberTextFieldFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                throws BadLocationException {
            if (string.matches("[0-9+(-) ]*")) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            if (text.matches("[0-9+(-) ]*")) {
                super.replace(fb, offset, length, text, attrs);
            }
        }
    }

    // Reusable method untuk menghapus label-label error.
    private void clearInvalidLabel() {
        nameErrorLabel.setText("");
        emailErrorLabel.setText("");
        passwordErrorLabel.setText("");
        confirmPasswordErrorLabel.setText("");
        phoneNumberErrorLabel.setText("");
    }

    // Reusable class untuk validasi masukan tiap TextField.
    class FormValidator {
        public static boolean isNameValid(String name) {
            return !name.isEmpty();
        }

        public static boolean isEmailValid(String email) {
            return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        }

        public static boolean isCountryValid(String country) {
            return !country.isEmpty();
        }

        public static boolean isProvinceValid(String province) {
            return !province.isEmpty();
        }

        public static boolean isPasswordValid(String password) {
            return password.length() >= 8;
        }

        public static boolean isPhoneNumberValid(String phoneNumber) {
            return phoneNumber.isEmpty() || phoneNumber.matches("^\\+[1-9]\\d{9,14}$");
        }

        public static boolean isPasswordConfirmationValid(String password, String confirmPassword) {
            return password.equals(confirmPassword);
        }
    }

    private boolean isMandatoryFieldEmpty() {
        if (nameTextField.getText().isEmpty()) {
            nameErrorLabel.setText("Nama tidak boleh kosong.");
        }
        if (emailTextField.getText().isEmpty()) {
            emailErrorLabel.setText("Email tidak boleh kosong.");
        }
        if (new String(passwordField.getPassword()).isEmpty()) {
            passwordErrorLabel.setText("Password tidak boleh kosong.");
        }
        if (new String(confirmPasswordField.getPassword()).isEmpty()) {
            confirmPasswordErrorLabel.setText("Konfirmasi Password tidak boleh kosong.");
        }

        return nameTextField.getText().isEmpty() || emailTextField.getText().isEmpty()
                || new String(passwordField.getPassword()).isEmpty()
                || new String(confirmPasswordField.getPassword()).isEmpty();
    }

    private boolean isFormValid() {
        boolean nameInvalid = !FormValidator.isNameValid(nameTextField.getText());
        boolean emailInvalid = !FormValidator.isEmailValid(emailTextField.getText());
        boolean passwordInvalid = !FormValidator.isPasswordValid(new String(passwordField.getPassword()));
        boolean confirmPasswordInvalid = !FormValidator.isPasswordValid(new String(confirmPasswordField.getPassword()));
        boolean phoneNumberInvalid = !FormValidator.isPhoneNumberValid(phoneNumberTextField.getText());
        boolean passwordConfirmationInvalid = !FormValidator.isPasswordConfirmationValid(
                new String(passwordField.getPassword()), new String(confirmPasswordField.getPassword()));

        if (nameInvalid)
            nameErrorLabel.setText("Nama tidak boleh kosong.");
        if (emailInvalid)
            emailErrorLabel.setText("Email tidak valid. Masukkan kembali.");
        if (passwordInvalid)
            passwordErrorLabel.setText("Password minimal 8 karakter.");
        if (confirmPasswordInvalid)
            confirmPasswordErrorLabel.setText("Konfirmasi Password minimal 8 karakter.");
        if (phoneNumberInvalid) {
            phoneNumberErrorLabel.setText("Nomor Telepon "
                    + (phoneNumberTextField.getText().length() > 15 - 1 ? "maksimal 15" : "minimal 10")
                    + " digit dengan kode negara (+62821xx)");
        }
        if (passwordConfirmationInvalid) {
            passwordErrorLabel.setText("Password tidak sama dengan Konfirmasi Password.");
            confirmPasswordErrorLabel.setText("Konfirmasi Password tidak sama dengan Password.");
        }

        return !emailInvalid && !passwordInvalid && !confirmPasswordInvalid && !phoneNumberInvalid
                && !passwordConfirmationInvalid;
    }

    // AutoCompleteComboBox untuk menampilkan dropdown list yang berisi item-item
    // dengan kemampuan prediksi berdasarkan input user.
    class AutoCompleteComboBox extends JComboBox<String> {
        private final List<String> dictionary;

        public AutoCompleteComboBox(List<String> dictionary) {
            super(dictionary.toArray(new String[0]));
            this.dictionary = dictionary;
            this.setEditable(true);
            final JTextField textfield = (JTextField) this.getEditor().getEditorComponent();
            textfield.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent ke) {
                    SwingUtilities.invokeLater(() -> {
                        if (ke.getKeyCode() == KeyEvent.VK_UP || ke.getKeyCode() == KeyEvent.VK_DOWN) {
                            return;
                        }
                        filter(textfield.getText());
                        if (!textfield.getText().isEmpty()) {
                            showPopup(); // Menunjukkan dropdown list jika textfield tidak kosong
                        }
                    });
                }
            });

            this.insertItemAt("", 0); // Tambahkan "" sebagai item pertama (agar value pertama kali user menjalankan
                                      // program kosong)
            this.setSelectedIndex(0);
        }

        public void filter(String enteredText) {
            List<String> filteredItems = dictionary.stream()
                    .filter(item -> item.toLowerCase().startsWith(enteredText.toLowerCase()))
                    .collect(Collectors.toList());

            if (filteredItems.isEmpty()) {
                String[] array = { enteredText };
                this.setModel(new DefaultComboBoxModel<>(array));
            } else {
                this.setModel(new DefaultComboBoxModel<>(filteredItems.toArray(new String[0])));
            }

            JTextField textfield = (JTextField) this.getEditor().getEditorComponent();
            textfield.setText(enteredText);
        }
    }

    private static String getHashedPassword(String passwordToHash, byte[] salt) {
        String hashedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt);
            byte[] bytes = md.digest(passwordToHash.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            hashedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashedPassword;
    }

    // Salt
    private static byte[] getSalt() throws NoSuchAlgorithmException {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return salt;
    }

    private class DoesEmailExistTask extends SwingWorker<Boolean, Void> {
        private String email;
        private String API_URL;
        private String BEARER_TOKEN;
        private JDialog progressDialog;
        private Consumer<Boolean> callback;

        public DoesEmailExistTask(String email, String API_URL, String BEARER_TOKEN, Consumer<Boolean> callback) {
            this.email = email;
            this.API_URL = API_URL;
            this.BEARER_TOKEN = BEARER_TOKEN;
            this.callback = callback;

            progressDialog = new JDialog((Frame) null, "Mohon tunggu...", true);
            JProgressBar progressBar = new JProgressBar();
            progressBar.setIndeterminate(true);
            progressDialog.getContentPane().add(progressBar);
            progressDialog.pack();
            progressDialog.setLocationRelativeTo(null);
        }

        @Override
        protected Boolean doInBackground() throws Exception {
            SwingUtilities.invokeLater(() -> progressDialog.setVisible(true));

            boolean result = doesEmailExist(email, API_URL, BEARER_TOKEN);

            SwingUtilities.invokeLater(() -> progressDialog.setVisible(false));

            return result;
        }

        @Override
        protected void done() {
            try {
                Boolean result = get();
                callback.accept(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void doesEmailExistAsync(String email, String API_URL, String BEARER_TOKEN, Consumer<Boolean> callback) {
        new DoesEmailExistTask(email, API_URL, BEARER_TOKEN, callback).execute();
    }

    private boolean doesEmailExist(String email, final String API_URL, final String BEARER_TOKEN) {
        final String CHECK_EMAIL_QUERY = "SELECT COUNT(*) FROM registration_details WHERE email = ?;";

        String checkEmailBody = String.format("{\n" +
                "\"params\": [\n" +
                "  \"%s\"\n" +
                "],\n" +
                "\"sql\": \"%s\"\n" +
                "}",
                email,
                CHECK_EMAIL_QUERY);

        HttpRequest checkEmailRequest = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .header("Authorization", "Bearer " + BEARER_TOKEN)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(checkEmailBody))
                .build();

        try {
            HttpResponse<String> checkEmailResponse = client.send(checkEmailRequest, BodyHandlers.ofString());

            // Parse the response to get the count
            String responseBody = checkEmailResponse.body();
            Pattern pattern = Pattern.compile("\"COUNT\\(\\*\\)\"\\s*:\\s*(\\d+)");
            Matcher matcher = pattern.matcher(responseBody);

            if (matcher.find()) {
                int count = Integer.parseInt(matcher.group(1));
                return count > 0;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    private class RegisterUserTask extends SwingWorker<Boolean, Void> {
        private String API_URL;
        private String BEARER_TOKEN;
        private JDialog progressDialog;
        private Consumer<Boolean> callback;

        public RegisterUserTask(String API_URL, String BEARER_TOKEN, Consumer<Boolean> callback) {
            this.API_URL = API_URL;
            this.BEARER_TOKEN = BEARER_TOKEN;
            this.callback = callback;

            progressDialog = new JDialog((Frame) null, "Mohon tunggu...", true);
            JProgressBar progressBar = new JProgressBar();
            progressBar.setIndeterminate(true);
            progressDialog.getContentPane().add(progressBar);
            progressDialog.pack();
            progressDialog.setLocationRelativeTo(null);
        }

        @Override
        protected Boolean doInBackground() throws Exception {
            SwingUtilities.invokeLater(() -> progressDialog.setVisible(true));

            boolean result = registerUser(API_URL, BEARER_TOKEN);

            SwingUtilities.invokeLater(() -> progressDialog.setVisible(false));

            return result;
        }

        @Override
        protected void done() {
            try {
                Boolean result = get();
                callback.accept(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void registerUserAsync(String API_URL, String BEARER_TOKEN, Consumer<Boolean> callback) {
        new RegisterUserTask(API_URL, BEARER_TOKEN, callback).execute();
    }

    private boolean registerUser(final String API_URL, final String BEARER_TOKEN) {
        final String REGISTER_QUERY = "INSERT INTO registration_details (name, email, country, province, phone_number, password, salt, registered_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        String registeredTime = getCurrentZonedTime();

        byte[] salt = null;
        try {
            salt = getSalt();
        } catch (NoSuchAlgorithmException e1) {
            JOptionPane.showMessageDialog(null, "Terdapat masalah, coba ganti password atau tekan tombol Daftar lagi.");
            return false;
        }

        String encodedSalt = Base64.getEncoder().encodeToString(salt);

        String body = String.format("{\n" +
                "\"params\": [\n" +
                "  \"%s\",\n" +
                "  \"%s\",\n" +
                "  \"%s\",\n" +
                "  \"%s\",\n" +
                "  \"%s\",\n" +
                "  \"%s\",\n" +
                "  \"%s\",\n" +
                "  \"%s\"\n" +
                "],\n" +
                "\"sql\": \"%s\"\n" +
                "}",
                new String(nameTextField.getText()),
                new String(emailTextField.getText()),
                new String(countryComboBox.getItemAt(countryComboBox.getSelectedIndex()) == null ? ""
                        : countryComboBox.getItemAt(countryComboBox.getSelectedIndex())),
                new String(provinceTextField.getText()),
                new String(phoneNumberTextField.getText()),
                new String(getHashedPassword((new String(passwordField.getPassword())), salt)),
                encodedSalt,
                registeredTime,
                REGISTER_QUERY);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .header("Authorization", "Bearer " + BEARER_TOKEN)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                JOptionPane.showMessageDialog(null, "Berhasil didaftarkan.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Gagal didaftarkan. Cek koneksi internet Anda atau hubungi developer.");
                return false;
            }

        } catch (IOException | InterruptedException e1) {
            JOptionPane.showMessageDialog(null, "Gagal didaftarkan. Coba lagi.");
            e1.printStackTrace();
            return false;
        }
    }

    private class CheckPasswordTask extends SwingWorker<String, Void> {
        private String inputEmail;
        private String inputPassword;
        private String API_URL;
        private String BEARER_TOKEN;
        private JDialog progressDialog;
        private Consumer<String> callback;

        public CheckPasswordTask(String inputEmail, String inputPassword, String API_URL, String BEARER_TOKEN,
                Consumer<String> callback) {
            this.inputEmail = inputEmail;
            this.inputPassword = inputPassword;
            this.API_URL = API_URL;
            this.BEARER_TOKEN = BEARER_TOKEN;
            this.callback = callback;

            progressDialog = new JDialog((Frame) null, "Mohon tunggu...", true);
            JProgressBar progressBar = new JProgressBar();
            progressBar.setIndeterminate(true);
            progressDialog.getContentPane().add(progressBar);
            progressDialog.pack();
            progressDialog.setLocationRelativeTo(null);
        }

        @Override
        protected String doInBackground() throws Exception {
            SwingUtilities.invokeLater(() -> progressDialog.setVisible(true));

            String result = checkPassword(inputEmail, inputPassword, API_URL, BEARER_TOKEN);

            SwingUtilities.invokeLater(() -> progressDialog.setVisible(false));

            return result;
        }

        @Override
        protected void done() {
            try {
                String result = get();
                callback.accept(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void checkPasswordAsync(String inputEmail, String inputPassword, String API_URL, String BEARER_TOKEN,
            Consumer<String> callback) {
        new CheckPasswordTask(inputEmail, inputPassword, API_URL, BEARER_TOKEN, callback).execute();
    }

    private String checkPassword(String inputEmail, String inputPassword, final String API_URL,
            final String BEARER_TOKEN) {
        final String GET_USER_QUERY = "SELECT password, salt FROM registration_details WHERE email = ?;";

        String body = String.format("{\n" +
                "\"params\": [\n" +
                "  \"%s\"\n" +
                "],\n" +
                "\"sql\": \"%s\"\n" +
                "}",
                inputEmail,
                GET_USER_QUERY);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .header("Authorization", "Bearer " + BEARER_TOKEN)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            // System.out.println(response.body() + "walawe");
            // System.out.println(response.toString());
            // System.out.println(response.body().toString() + " apa ini we");

            if (response.statusCode() == 200) {
                String responseBody = response.body();
                Pattern pattern = Pattern.compile("\"password\"\\s*:\\s*\"(.*)\",\\s*\"salt\"\\s*:\\s*\"(.*)\"");
                Pattern patternEmpty = Pattern.compile("\"results\"\\s*:\\s*\\[\\]");
                Matcher matcher = pattern.matcher(responseBody);
                Matcher matcherEmpty = patternEmpty.matcher(responseBody);

                if (matcher.find()) {
                    String password = matcher.group(1);
                    // System.out.println(password);
                    String salt = matcher.group(2);
                    // System.out.println(salt);

                    String hashedInputPassword = getHashedPassword(inputPassword, Base64.getDecoder().decode(salt));
                    if (hashedInputPassword.equals(password)) {
                        return "CORRECT";
                    } else {
                        return "INCORRECT";
                    }
                } else if (matcherEmpty.find()) {
                    return "EMAIL-DOES-NOT-EXIST";
                } else {
                    return "BAD-FORMAT";
                }
            } else {
                return "BAD-RESPONSE";
            }

        } catch (IOException | InterruptedException e1) {
            e1.printStackTrace();
            return "BAD-REQUEST";
        }
    }

    private class GetUserDataTask extends SwingWorker<String[], Void> {
        private String inputEmail;
        private String API_URL;
        private String BEARER_TOKEN;
        private JDialog progressDialog;
        private Consumer<String[]> callback;

        public GetUserDataTask(String inputEmail, String API_URL, String BEARER_TOKEN, Consumer<String[]> callback) {
            this.inputEmail = inputEmail;
            this.API_URL = API_URL;
            this.BEARER_TOKEN = BEARER_TOKEN;
            this.callback = callback;

            progressDialog = new JDialog((Frame) null, "Mohon tunggu...", true);
            JProgressBar progressBar = new JProgressBar();
            progressBar.setIndeterminate(true);
            progressDialog.getContentPane().add(progressBar);
            progressDialog.pack();
            progressDialog.setLocationRelativeTo(null);
        }

        @Override
        protected String[] doInBackground() throws Exception {
            SwingUtilities.invokeLater(() -> progressDialog.setVisible(true));

            String[] result = getUserData(inputEmail, API_URL, BEARER_TOKEN);

            SwingUtilities.invokeLater(() -> progressDialog.setVisible(false));

            return result;
        }

        @Override
        protected void done() {
            try {
                String[] result = get();
                callback.accept(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void getUserDataAsync(String inputEmail, String API_URL, String BEARER_TOKEN, Consumer<String[]> callback) {
        new GetUserDataTask(inputEmail, API_URL, BEARER_TOKEN, callback).execute();
    }

    private String[] getUserData(String inputEmail, final String API_URL, final String BEARER_TOKEN) {
        final String GET_USER_QUERY = "SELECT name, email, country, province, phone_number, registered_time FROM registration_details WHERE email = ?;";

        String body = String.format("{\n" +
                "\"params\": [\n" +
                "  \"%s\"\n" +
                "],\n" +
                "\"sql\": \"%s\"\n" +
                "}",
                inputEmail,
                GET_USER_QUERY);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .header("Authorization", "Bearer " + BEARER_TOKEN)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                String responseBody = response.body();
                Pattern pattern = Pattern.compile(
                        "\"name\"\\s*:\\s*\"(.*)\",\\s*\"email\"\\s*:\\s*\"(.*)\",\\s*\"country\"\\s*:\\s*\"(.*)\",\\s*\"province\"\\s*:\\s*\"(.*)\",\\s*\"phone_number\"\\s*:\\s*\"(.*)\",\\s*\"registered_time\"\\s*:\\s*\"(.*)\"");
                Matcher matcher = pattern.matcher(responseBody);

                if (matcher.find()) {
                    String name = matcher.group(1);
                    String email = matcher.group(2);
                    String country = matcher.group(3);
                    String province = matcher.group(4);
                    String phoneNumber = matcher.group(5);
                    String registeredTime = matcher.group(6);

                    return new String[] { name, email, country, province, phoneNumber, registeredTime };
                } else {
                    return null;
                }
            } else {
                return null;
            }

        } catch (IOException | InterruptedException e1) {
            e1.printStackTrace();
            return null;
        }
    }

    private class DeleteUserDataTask extends SwingWorker<Boolean, Void> {
        private String inputEmail;
        private String API_URL;
        private String BEARER_TOKEN;
        private JDialog progressDialog;
        private Consumer<Boolean> callback;

        public DeleteUserDataTask(String inputEmail, String API_URL, String BEARER_TOKEN, Consumer<Boolean> callback) {
            this.inputEmail = inputEmail;
            this.API_URL = API_URL;
            this.BEARER_TOKEN = BEARER_TOKEN;
            this.callback = callback;

            progressDialog = new JDialog((Frame) null, "Mohon tunggu...", true);
            JProgressBar progressBar = new JProgressBar();
            progressBar.setIndeterminate(true);
            progressDialog.getContentPane().add(progressBar);
            progressDialog.pack();
            progressDialog.setLocationRelativeTo(null);
        }

        @Override
        protected Boolean doInBackground() throws Exception {
            SwingUtilities.invokeLater(() -> progressDialog.setVisible(true));

            boolean result = deleteUserData(inputEmail, API_URL, BEARER_TOKEN);

            SwingUtilities.invokeLater(() -> progressDialog.setVisible(false));

            return result;
        }

        @Override
        protected void done() {
            try {
                Boolean result = get();
                callback.accept(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void deleteUserDataAsync(String inputEmail, String API_URL, String BEARER_TOKEN,
            Consumer<Boolean> callback) {
        new DeleteUserDataTask(inputEmail, API_URL, BEARER_TOKEN, callback).execute();
    }

    private boolean deleteUserData(String inputEmail, final String API_URL, final String BEARER_TOKEN) {
        final String DELETE_USER_QUERY = "DELETE FROM registration_details WHERE email = ?;";

        String body = String.format("{\n" +
                "\"params\": [\n" +
                "  \"%s\"\n" +
                "],\n" +
                "\"sql\": \"%s\"\n" +
                "}",
                inputEmail,
                DELETE_USER_QUERY);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .header("Authorization", "Bearer " + BEARER_TOKEN)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return true;
            } else {
                return false;
            }

        } catch (IOException | InterruptedException e1) {
            e1.printStackTrace();
            return false;
        }
    }

    private class WarmUpHttpRequestTask extends SwingWorker<Void, Void> {
        private String API_URL;

        public WarmUpHttpRequestTask(String API_URL) {
            this.API_URL = API_URL;
        }

        @Override
        protected Void doInBackground() throws Exception {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .GET()
                    .build();

            HttpClient client = HttpClient.newHttpClient();

            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Warm up request sent, response code: " + response.statusCode());
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

            return null;
        }
    }

    @SuppressWarnings("unused")
    private void warmUpHttpRequestAsync(String API_URL) {
        new WarmUpHttpRequestTask(API_URL).execute();
    }

    private String getCurrentZonedTime() {
        ZonedDateTime nowWIB = ZonedDateTime.now(ZoneId.of("Asia/Jakarta"));
        return nowWIB.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    // Supaya warna window-nya merah (sesuai SS).
    public static void setRedWindowTheme() {
        UIManager.put("activeCaption", new javax.swing.plaf.ColorUIResource(Color.RED));
        UIManager.put("activeCaptionText", new javax.swing.plaf.ColorUIResource(Color.WHITE));
        JFrame.setDefaultLookAndFeelDecorated(true);
    }

    public static void main(String[] args) {
        setRedWindowTheme();
        new RegistrationFormWithDatabase();
    }
}
