package DariKawan.Fazri; // ganti sesuai package atau hapus baris ini jika tidak dalam package apapun

/*
 * Nama     : M. Fazri Nizar
 * Kelas    : TI Reguler L1
 * NIM      : 09021282328053
 * Tugas    : Mengimplementasikan UI (GUI) untuk Kalkulator Pinjaman (Loan Calculator)
 * Nama File: LoanCalculatorOnlyUI.java
 */

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.Border;

public class LoanCalculatorOnlyUI extends JPanel {

    private JTextField loanAmountTextField;
    private JTextField interestRateTextField;
    private JTextField yearsTextField;
    private JTextField monthlyPaymentTextField;
    private JTextField totalPaymentTextField;

    public LoanCalculatorOnlyUI() {
        super();

        JFrame frame = new JFrame("Loan Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        loanAmountTextField = new JTextField(10);
        interestRateTextField = new JTextField(10);
        yearsTextField = new JTextField(10);
        monthlyPaymentTextField = new JTextField(10);
        totalPaymentTextField = new JTextField(10);
        monthlyPaymentTextField.setEditable(false);
        totalPaymentTextField.setEditable(false);

        JLabel loanAmountLabel = new JLabel("Loan Amount:");
        JLabel interestRateLabel = new JLabel("Interest Rate:");
        JLabel yearsLabel = new JLabel("Number of Years:");
        JLabel monthlyPaymentLabel = new JLabel("Monthly Payment:");
        JLabel totalPaymentLabel = new JLabel("Total Payment:");

        this.setLayout(new GridLayout(5, 2));
        this.add(loanAmountLabel);
        this.add(loanAmountTextField);
        this.add(interestRateLabel);
        this.add(interestRateTextField);
        this.add(yearsLabel);
        this.add(yearsTextField);
        this.add(monthlyPaymentLabel);
        this.add(monthlyPaymentTextField);
        this.add(totalPaymentLabel);
        this.add(totalPaymentTextField);

        Border border = BorderFactory.createTitledBorder("Enter loan amount, interest rate, and years");
        this.setBorder(border);

        JButton computeButton = new JButton("Compute Payment");
        
        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
        bottomPanel.add(new JLabel());
        bottomPanel.add(computeButton);

        frame.add(this, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    // Supaya warna windows-nya merah (sesuai SS)
    public static void setRedWindowTheme() {
        UIManager.put("activeCaption", new javax.swing.plaf.ColorUIResource(Color.RED));
        UIManager.put("activeCaptionText", new javax.swing.plaf.ColorUIResource(Color.WHITE));
        JFrame.setDefaultLookAndFeelDecorated(true);
    }

    public static void main(String[] args) {
        // setRedWindowTheme();
        new LoanCalculatorOnlyUI();
    }
}