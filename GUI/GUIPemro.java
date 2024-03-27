package GUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIPemro {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // buat object
        JButton button = new JButton("ok");
        JLabel label1 = new JLabel("nama");
        JLabel label2 = new JLabel("jurusan");
        JTextField text1 = new JTextField(50); //text ukuran 50
        JTextField text2 = new JTextField(50);

        GridLayout grid = new GridLayout(3,2,5,3);
        frame.setLayout(grid);

        //add component
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(button);

        frame.setSize(400, 300); // ukuran
        frame.setLocationRelativeTo(null); //null = tengah
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pencet close untuk tutup
        frame.setVisible(true); //biar keliatan

    }
}
