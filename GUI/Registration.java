package GUI;

import javax.swing.*;
import java.awt.*;

public class Registration extends JFrame{
    JPanel[] panel = new JPanel[3];
    JLabel[] lbl = new JLabel[9];
    JTextField[] tf = new JTextField[7];
    JButton[] btn = new JButton[3];

    public Registration(){
        super("Borang Pendaftaran Member");
        this.setIconImage(new ImageIcon(getClass().getResource("iconJava.png")).getImage());

        for(int i = 0; i < panel.length; i++){
            panel[i] = new JPanel();
        }
        panel[0].setLayout(new BorderLayout());
        panel[1].setLayout(new GridLayout(8, 2, 0, 10));
        panel[2].setLayout(new GridLayout(1, 3, 10, 0));

        lbl[0] = new JLabel("Form Registrasi", JLabel.CENTER);
            lbl[0].setForeground(Color.BLUE);
        lbl[1] = new JLabel("Nama*:");
        lbl[2] = new JLabel("Email*:");
        lbl[3] = new JLabel("Password*:");
        lbl[4] = new JLabel("Konfirmasi Password*:");
        lbl[5] = new JLabel("Negara:");
        lbl[6] = new JLabel("Provinsi:");
        lbl[7] = new JLabel("Nomor Telepon:");
        lbl[8] = new JLabel("* Wajib Diisi");

        for(int i = 0; i < tf.length; i++){
            tf[i] = new JTextField(10);
        }
        
        btn[0] = new JButton("Daftar");
        btn[1] = new JButton("Ambil Data");
        btn[2] = new JButton("Hapus");

        //textfield 1-7 label
        for(int i = 0; i < lbl.length; i++){
            panel[1].add(lbl[i]);
            if(i > 0 && i < 8) panel[1].add(tf[i-1]);
        }

        for(int i = 0; i < btn.length; i++){
            panel[2].add(btn[i]);
        }

        panel[0].add(lbl[0], BorderLayout.NORTH);
        panel[0].add(panel[1], BorderLayout.CENTER);
        panel[0].add(panel[2], BorderLayout.PAGE_END);

        this.add(panel[0]);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Registration();
    }
}