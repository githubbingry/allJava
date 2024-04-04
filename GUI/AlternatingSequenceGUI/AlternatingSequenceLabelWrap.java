package GUI.AlternatingSequenceGUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigInteger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class AlternatingSequenceLabelWrap extends JFrame{
    JPanel pnlAll = new JPanel();
    JPanel[] pnlInput = new JPanel[3];
    JPanel pnlWarning = new JPanel();
    JPanel pnlButton = new JPanel();
    JPanel pnlHasil = new JPanel();

    // JLabel lblContohSequence = new JLabel();
    // JLabel lblFormula = new JLabel();
    JLabel lblNAngka = new JLabel();
    JLabel lblAGanjil = new JLabel();
    JLabel lblBGenap = new JLabel();
    JLabel[] lblWarning = new JLabel[2];
    JLabel lblHTMLWarning = new JLabel();
    JLabel lblHasilText = new JLabel();
    JLabel[] lblHasilArray = new JLabel[1];
    JLabel lblPenjelasan = new JLabel();

    JTextArea taNAngka = new JTextAreaDigitOnly();
    JTextArea taAGanjil = new JTextAreaDigitOnly();
    JTextArea taBGenap = new JTextAreaDigitOnly();

    JButton btnHitung = new JButton();
    JButton btnReset = new JButton();
    JButton btnPenjelasan = new JButton();

    public AlternatingSequenceLabelWrap(){
        super("Sum of Alternating Sequence of a and b (Big Integer)");

        for(int i = 0; i < pnlInput.length; i++){
            pnlInput[i] = new JPanel();
            pnlInput[i].setLayout(new GridLayout(1, 2, 0, 4));
        }
        pnlWarning.setLayout(new GridLayout(4, 1));
        pnlButton.setLayout(new GridLayout(1, 2, 4, 0));
        // pnlButton.setLayout(new GridLayout(1, 3, 4, 0)); //gunakan ini jika button penjelasan ditambah
        pnlHasil.setLayout(new GridLayout(5, 1));

        lblNAngka.setText("Input n (banyak angka pada barisan) :");
        pnlInput[0].add(lblNAngka);
        taNAngka.setColumns(21);
        taNAngka.setWrapStyleWord(true);
        taNAngka.setLineWrap(true);
        pnlInput[0].add(taNAngka);

        lblAGanjil.setText("Input a (kelipatan tiap Ganjil) :");
        pnlInput[1].add(lblAGanjil);
        taAGanjil.setColumns(21);
        taAGanjil.setLineWrap(true);
        pnlInput[1].add(taAGanjil);
        
        lblBGenap.setText("Input b (kelipatan tiap Genap) :");
        pnlInput[2].add(lblBGenap);
        taBGenap.setColumns(21);
        taBGenap.setLineWrap(true);
        pnlInput[2].add(taBGenap);

        lblWarning[0] = new JLabel("PERINGATAN!! :", SwingConstants.CENTER);
        lblWarning[1] = new JLabel("Hasil akan keluar lama jika angka yang di input terlalu besar");
        pnlWarning.add(new JLabel());
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

        btnPenjelasan.setText("Penjelasan"); //masih belum digunakan
        pnlButton.add(new JLabel());
        // pnlButton.add(btnPenjelasan);

        lblHasilText.setText("Hasil Penjumlahan Barisan:");
        lblHasilText.setHorizontalAlignment(0);
        pnlHasil.add(lblHasilText);

        for(int i = 0; i < pnlInput.length; i++){
            pnlAll.add(pnlInput[i]);
        }
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
            taNAngka.setText("");
            taAGanjil.setText("");
            taBGenap.setText("");
            lblHasilText.setText("Hasil Penjumlahan Barisan:");
            for (int i = 0; i < lblHasilArray.length; i++){
                pnlHasil.remove(lblHasilArray[i]);
                lblHasilArray[i].setText("");
            }
            lblHasilText.setVisible(true);
            btnHitung.setEnabled(true);
        }
    }

    private class JTextAreaDigitOnly extends JTextArea {
        public JTextAreaDigitOnly(){
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
            BigInteger n = new BigInteger(taNAngka.getText());
            BigInteger a = new BigInteger(taAGanjil.getText());
            BigInteger b = new BigInteger(taBGenap.getText());
            HitungSequenceBigInteger hitung= new HitungSequenceBigInteger(n, a, b);
            BigInteger sum = hitung.getSum();
            isiHasilArray(sum);
            lblHasilText.setText("Hasil Penjumlahan Barisan:"+sum);
            lblHasilText.setVisible(false);
            btnHitung.setEnabled(false);
        }

        private void isiHasilArray(BigInteger sum){
            String sumString = sum.toString();
            int banyakDigit = sumString.length();
            int banyakBaris = banyakDigit/70 +1;
            lblHasilArray = new JLabel[banyakBaris];
            for(int i = 0, awal = 0; i < lblHasilArray.length; i++){
                lblHasilArray[i] = new JLabel("", SwingConstants.CENTER);
                if(banyakDigit >= 70) {
                    lblHasilArray[i].setText(sumString.substring(awal, awal + 70));
                    awal += 70;
                    banyakDigit -= 70;
                } else {
                    lblHasilArray[i].setText(sumString.substring(awal, awal + banyakDigit));
                }
                pnlHasil.add(lblHasilArray[i]); //uncomment ts
            }
        }
    }

    private class HitungSequenceBigInteger{
        private BigInteger sum;

        private HitungSequenceBigInteger(BigInteger n, BigInteger a, BigInteger b) {
            BigInteger nol = BigInteger.ZERO, satu = BigInteger.ONE, dua = BigInteger.TWO;
            this.sum = nol;
            // int counta = 0, countb = 0, temp = 0;
            // for(int i = 1; i <= n; i++){
            //     if(i % 2 != 0){
            //         temp = a*++counta;
            //         this.sum += temp;
            //     } else {
            //         temp = b*++countb;
            //         this.sum += temp;
            //     }
            // }
            //too late
            // BigInteger counta = nol, countb = nol, temp = nol;
            // for(BigInteger i = satu;
            //     i.compareTo(n) < 0 || i.compareTo(n) == 0;
            //     i = i.add(satu))
            // {
            //     if(i.mod(dua).equals(nol)){
            //         countb = countb.add(satu);
            //         temp = b.multiply(countb);
            //     } else {
            //         counta = counta.add(satu);
            //         temp = a.multiply(counta);
            //     }
            //     this.sum = this.sum.add(temp);
            // }
            
            // int sumFormula = 0, even = 0, odd = 0;
            // even = n/2;
            // odd = (n+1)/2;
            // sumFormula = a*odd*(odd+1)/2 + b*even*(even+1)/2;
            //maybe this work?
            //update : it does !!!
            BigInteger odd = nol, even = nol, oddMultiply = nol, evenMultiply = nol;
            odd = n.add(satu).divide(dua);
            even = n.divide(dua);
            oddMultiply = a.multiply(odd).multiply(odd.add(satu)).divide(dua);
            evenMultiply = b.multiply(even).multiply(even.add(satu)).divide(dua);
            this.sum = oddMultiply.add(evenMultiply);
        }

        public BigInteger getSum(){
            return this.sum;
        }
    }
    
    public static void main(String[] args) {
        new AlternatingSequenceLabelWrap();
    }
}