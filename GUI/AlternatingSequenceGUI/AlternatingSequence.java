package GUI.AlternatingSequenceGUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AlternatingSequence extends JFrame{
    JPanel pnlAll = new JPanel();
    JPanel pnlInput = new JPanel();
    JPanel pnlWarning = new JPanel();
    JPanel pnlButton = new JPanel();
    JPanel pnlHasil = new JPanel();

    // JLabel lblContohSequence = new JLabel();
    // JLabel lblFormula = new JLabel();
    JLabel lblNAngka = new JLabel();
    JLabel lblAGanjil = new JLabel();
    JLabel lblBGenap = new JLabel();
    JLabel[] lblWarning = new JLabel[5];
    JLabel lblHTMLWarning = new JLabel();
    JLabel lblHasil = new JLabel();
    JLabel lblPenjelasan = new JLabel();

    JTextField tfNAngka = new JTextFieldDigitOnly();
    JTextField tfAGanjil = new JTextFieldDigitOnly();
    JTextField tfBGenap = new JTextFieldDigitOnly();

    JButton btnHitung = new JButton();
    JButton btnReset = new JButton();
    JButton btnPenjelasan = new JButton();

    public AlternatingSequence(){
        super("Sum of Alternating Sequence of a and b");

        pnlInput.setLayout(new GridLayout(3, 2, 0, 4));
        pnlWarning.setLayout(new GridLayout(5, 1));
        pnlButton.setLayout(new GridLayout(1, 3, 4, 0));
        pnlHasil.setLayout(new GridLayout(1, 1));

        lblNAngka.setText("Input n (banyak angka pada barisan) :");
        pnlInput.add(lblNAngka);
        tfNAngka.setColumns(21);
        pnlInput.add(tfNAngka);

        lblAGanjil.setText("Input a (kelipatan tiap Ganjil) :");
        pnlInput.add(lblAGanjil);
        tfAGanjil.setColumns(21);
        pnlInput.add(tfAGanjil);
        
        lblBGenap.setText("Input b (kelipatan tiap Genap) :");
        pnlInput.add(lblBGenap);
        tfBGenap.setColumns(21);
        pnlInput.add(tfBGenap);

        lblWarning[0] = new JLabel("PERINGATAN!! :", SwingConstants.CENTER);
        lblWarning[1] = new JLabel("Hasil tidak akan akurat jika nilai n atau a atau b terlalu besar");
        lblWarning[2] = new JLabel("dikarenakan keluar dari batas maks integer yaitu 2^31-1.");
        lblWarning[3] = new JLabel("Contoh untuk a = 3 dan b = 5 :");
        lblWarning[4] = new JLabel("batas n adalah 46339 dengan jumlah 2147372430");
        for (int i = 0; i < lblWarning.length; i++){ pnlWarning.add(lblWarning[i]); }

        lblHTMLWarning.setText( //doesnt work why?
            "<html>"
            + warningString(lblWarning)
            .replaceAll("<","&lt;")
            .replaceAll(">", "&gt;")
            .replaceAll("\n", "<br/>") +
            "</html>"
        );
        // pnlWarning.add(lblHTMLWarning);

        btnReset.setText("Reset");
        btnReset.addActionListener(new ResetButton());
        pnlButton.add(btnReset);

        btnHitung.setText("Hitung Jumlah");
        btnHitung.addActionListener(new HitungButton());
        pnlButton.add(btnHitung);

        btnPenjelasan.setText("Penjelasan");
        pnlButton.add(btnPenjelasan);

        lblHasil.setText("Hasil Penjumlahan Barisan: ");
        pnlHasil.add(lblHasil);

        pnlAll.add(pnlInput);
        pnlAll.add(pnlWarning);
        pnlAll.add(pnlButton);
        pnlAll.add(pnlHasil);

        this.add(pnlAll);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private String warningString(JLabel[] lblWarning){
        String s = "\n";
        for (int i = 0; i < lblWarning.length; i++){
            s += lblWarning[i] + "\n";
        }
        return s;
    }

    private class ResetButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            tfNAngka.setText("");
            tfAGanjil.setText("");
            tfBGenap.setText("");
            lblHasil.setText("Hasil Penjumlahan Barisan: ");
        }
    }

    private class JTextFieldDigitOnly extends JTextField {
        public JTextFieldDigitOnly(){
            addKeyListener(
                new KeyAdapter() {
                    public void keyTyped(KeyEvent e) {
                        char ch = e.getKeyChar();
                        if (!isNumber(ch) && !isValidSignal(ch) && !validatePoint(ch)  && ch != '\b') {
                            e.consume();
                        }
                    }
                }
            );
        }
    
        private boolean isNumber(char ch){
            return ch >= '0' && ch <= '9';
        }
    
        private boolean isValidSignal(char ch){
            if( (getText() == null || "".equals(getText().trim()) ) && ch == '-'){
                return true;
            }
            return false;
        }
    
        private boolean validatePoint(char ch){
            if(ch != '.'){
                return false;
            }
    
            if(getText() == null || "".equals(getText().trim())){
                setText("0.");
                return false;
            }else if("-".equals(getText())){
                setText("-0.");
            }
            return true;
        }
    }

    private class HitungButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            lblHasil.setText("Hasil Penjumlahan Barisan: ");
            int n = Integer.parseInt(tfNAngka.getText());
            int a = Integer.parseInt(tfAGanjil.getText());
            int b = Integer.parseInt(tfBGenap.getText());
            HitungSequence hitung= new HitungSequence(n, a, b);
            lblHasil.setText(lblHasil.getText() + hitung.getSum());
        }
    }

    private class HitungSequence{
        private int sum;

        private HitungSequence(int n, int a, int b) {
            sum = 0;
            int counta = 0, countb = 0, temp = 0;
            for(int i = 1; i <= n; i++){
                if(i % 2 != 0){
                    temp = a*++counta;
                } else {
                    temp = b*++countb;
                }
                this.sum += temp;
            }
        }

        public int getSum(){
            return this.sum;
        }
    }
    
    public static void main(String[] args) {
        new AlternatingSequence();
        
        // Scanner x = new Scanner(System.in);
        // int n = x.nextInt(), sumLoop = 0, counta = 0, countb = 0, temp = 0;
        // int a = x.nextInt(), b = x.nextInt();
        // for(int i = 1; i <= n; i++){
        //     if(i % 2 != 0){
        //         temp = a*++counta;
        //         sumLoop += temp;
        //         // System.out.print(temp + " ");
        //     } else {
        //         temp = b*++countb;
        //         sumLoop += temp;
        //         // System.out.print(temp + " ");
        //     }
        // }
        // System.out.println("\n"+sumLoop); // maks n = 46339, sum = 21

        // int sumFormula = 0, even = 0, odd = 0;
        // even = n/2;
        // odd = (n+1)/2;
        // sumFormula = a*odd*(odd+1)/2 + b*even*(even+1)/2; //maybe because of multiplication operation?
        // System.out.println(sumFormula); //maks n = 41447, sum = 1717915980

        // x.close();
    }
}
