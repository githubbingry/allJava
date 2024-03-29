package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Payment extends JPanel{
    JFrame frame = new JFrame();
    JLabel[] lbl = new JLabel[5];
    JTextField[] tf = new JTextField[5];
    JButton btnCompute = new JButton("Compute Payment");
    Border border = BorderFactory.createTitledBorder("Enter loan amount, interest rate, and years");
    JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
    
    public Payment(){
        super();
        frame.setIconImage(new ImageIcon(getClass().getResource("iconJava.png")).getImage());

        lbl[0] = new JLabel("Annual Interest Rate");
        lbl[1] = new JLabel("Number of Years");
        lbl[2] = new JLabel("Loan Amount");
        lbl[3] = new JLabel("Monthly Payment");
        lbl[4] = new JLabel("Total Payment");

        for(int i = 0; i < tf.length; i++){
            // tf[i] = new JTextField("123", 10);
            tf[i] = new JTextField(10);
        }

        // btnCompute.addActionListener(e ->
        // {
        //     // your code here
        // });

        // frame.setLayout(new GridLayout(5, 2)); //kesalahan kecil
        this.setLayout(new GridLayout(5, 2));
        for(int i = 0; i < 5; i++){
            this.add(lbl[i]);
            this.add(tf[i]);
        }

        this.setBorder(border);
        bottomPanel.add(new JLabel());
        bottomPanel.add(btnCompute);
        frame.add(this, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Payment();
        // Payment p = new Payment();
        // String s = p.tf[0].getText().toString();
        // int a = Integer.parseInt(s);
        // System.out.println(a);

        // System.out.println(Integer.parseInt(new Payment().tf[0].getText().toString()));
    }
}
