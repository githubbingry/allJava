package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
    JButton btnReset = new JButton("Reset");
    Border border = BorderFactory.createTitledBorder("Enter loan amount, interest rate, and years");
    JPanel bottomPanel = new JPanel(new GridLayout(1, 2, 5, 0));
    
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
            tf[i] = new JTextFieldDigitOnly();
        }

        tf[3].setEditable(false);
        tf[4].setEditable(false);

        btnCompute.addActionListener(new ComputeButton());
        btnReset.addActionListener(new ResetButton());
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
        // bottomPanel.add(new JLabel());
        bottomPanel.add(btnReset);
        bottomPanel.add(btnCompute);
        frame.add(this, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private class ComputeButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            double interest = Double.parseDouble(tf[0].getText());
            
            int  year =  Integer.parseInt(tf[1].getText());
            
            double loanAmount = Double.parseDouble(tf[2].getText());
            
            Loan loan = new Loan(interest, year, loanAmount);
            
            tf[3].setText(String.format("%f", loan.getMonthlyPayment()));
            
            tf[4].setText(String.format("%f", loan.getTotalPayment()));
        }
    }
    
    // craft a loan class, to store loan details
    public class Loan{
        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private java.util.Date loanDate;
        
        public Loan(){
            this(0, 0, 0);
        }
        
        public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new java.util.Date();
        }
        
        public double getAnnualInterestRate(){
            return this.annualInterestRate;
        }
        
        public void setAnnualInterestRate(double annualInterestRate){
            this.annualInterestRate = annualInterestRate;
        }
        
        public int getNumberOfYears(){
            return this.numberOfYears;
        }
        
        public void setNumberOfYears(int numberOfYears){
            this.numberOfYears = numberOfYears;
        }
        
        public double getLoanAmount(){
            return this.loanAmount;
        }
        
        public double getMonthlyPayment(){
            double monthlyInterestRate = annualInterestRate / 1200;
            // double monthlyPayment = loanAmount * monthlyInterestRate / (1-(1 / Math.pow(1+monthlyInterestRate, numberOfYears * 12)));
            double monthlyPayment = loanAmount * monthlyInterestRate * 3;
            return monthlyPayment;
        }
        
        public double getTotalPayment(){
            double  totalPayment = getMonthlyPayment() * numberOfYears *12;
            return totalPayment;
        }
        
        public java.util.Date getLoanDate(){
            return this.loanDate;
        }
    }

    private class ResetButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            for(int i = 0; i < tf.length; i++){
                tf[i].setText("");
            }
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

    public static void main(String[] args) {
        new Payment();
        // Payment p = new Payment();
        // String s = p.tf[0].getText().toString();
        // int a = Integer.parseInt(s);
        // System.out.println(a);

        // System.out.println(Integer.parseInt(new Payment().tf[0].getText().toString()));
    }
}
