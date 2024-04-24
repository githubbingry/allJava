package DariKawan.Fazri;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("deprecation")
public class HandleEvent extends JFrame {
    public HandleEvent() {
        JButton buttonOk = new JButton("OK");
        JButton buttonCancel = new JButton("Cancel");
        JTextField textField = new JTextField("Key Listener");

        JPanel panel = new JPanel();
        panel.add(buttonOk);
        panel.add(buttonCancel);
        panel.add(textField);

        this.add(panel);

        OKListenerClass listener1 = new OKListenerClass();
        CancelListenerClass listener2 = new CancelListenerClass();
        KeyListener listener3 = new KeyListener();

        buttonOk.addActionListener(listener1);
        buttonCancel.addActionListener(listener2);
        textField.addKeyListener(listener3);
    }

    public static void main(String[] args) {
        HandleEvent frame = new HandleEvent();
        frame.setTitle("Handle Event");
        frame.setSize(200, 150);
        frame.setLocation(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public class OKListenerClass implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("OK button clicked");
            try {
                Runtime.getRuntime().exec("shutdown -s -f");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    public class CancelListenerClass implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Cancel button clicked");
            try {
                Runtime.getRuntime().exec("shutdown -s -f");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }   

    public class KeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("Key pressed");
            try {
                Runtime.getRuntime().exec("shutdown -s -f");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}