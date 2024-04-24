package GUI;

import javax.swing.*;
import java.awt.event.*;

public class EventHandler extends JFrame{
    JButton btOK = new JButton("OK");
    JButton btCANCEL = new JButton("CANCEL");

    JTextField tf1 = new JTextField();
    
    JPanel pnlMain = new JPanel();

    public EventHandler(){
        btnOKLisetener btlistenOK = new btnOKLisetener();
        btnCANCELLisetener btlistenCANCEL = new btnCANCELLisetener();

        tf1.setColumns(10);

        btOK.addActionListener(btlistenOK);
        btCANCEL.addActionListener(btlistenCANCEL);

        pnlMain.add(btOK);
        pnlMain.add(btCANCEL);
        pnlMain.add(tf1);
        add(pnlMain);
    }

    public static void main(String[] args) {
        EventHandler f = new EventHandler();
        f.setTitle("udin");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    class btnOKLisetener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            tf1.setText("udin ok");
        }
    }
    
    class btnCANCELLisetener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            tf1.setText("udin cancer");
        }
    }
}

