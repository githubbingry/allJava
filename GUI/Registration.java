package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
        btn[0].addActionListener(new DaftarAction());
        btn[1] = new JButton("Ambil Data"); //not yet implemented, use file chooser later
        btn[2] = new JButton("Hapus");
        btn[2].addActionListener(new HapusAction());

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
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private boolean isAllFilled(){
        for(int i = 0; i < 4; i++){
            if (tf[i].getText().equals("")){
                return false;
            }
        }
        return true;
    }

    private class DaftarAction implements ActionListener{
        JFrame fNotif = new JFrame("Notifikasi");
        // JPanel pnlNotif = new JPanel(new GridLayout(2, 1, 0, 5));
        JPanel pnlNotif = new JPanel(new FlowLayout());
        JLabel lblNotif = new JLabel();
        JButton btnOK = new JButton("OK");
        JLabel lblImage = new JLabel();
        JLabel lblImgBenar = new JLabel(
            new ImageIcon(
                new ImageIcon("GUI/benar.jpg")
                .getImage()
                .getScaledInstance(50, 50, Image.SCALE_SMOOTH)
            )
        );
        JLabel lblImgSalah = new JLabel(
            new ImageIcon(
                new ImageIcon("GUI/salah.jpg")
                .getImage()
                .getScaledInstance(50, 50, Image.SCALE_SMOOTH)
            )
        );

        @Override
        public void actionPerformed(ActionEvent ae){
            fNotif.setIconImage(new ImageIcon(getClass().getResource("notifikasi.jpg")).getImage());
            btnOK.addActionListener(new CloseNotification());
            if (isAllFilled()){
                // could've use JOptionPane message dialog, but nahh
                // JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Notifikasi", JOptionPane.INFORMATION_MESSAGE);
                lblImage.setIcon(lblImgBenar.getIcon());
                lblNotif.setText("Data berhasil disimpan");
            } else {
                // JOptionPane.showMessageDialog(null, "Data gagal disimpan", "Notifikasi", JOptionPane.ERROR_MESSAGE);
                lblImage.setIcon(lblImgSalah.getIcon());
                lblNotif.setText("Data gagal disimpan");
            }
            pnlNotif.add(lblImage);
            pnlNotif.add(lblNotif);
            pnlNotif.add(btnOK);

            fNotif.add(pnlNotif);
            fNotif.setSize(240, 150);
            fNotif.setLocationRelativeTo(null);
            fNotif.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fNotif.setVisible(true);
        }

        public class CloseNotification implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent ae){
                fNotif.dispose();
            }
        }
    }

    private class HapusAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            for(int i = 0; i < tf.length; i++){
                tf[i].setText("");
            }
        }
    }
    
    public static void main(String[] args) {
        new Registration();
    }
}
