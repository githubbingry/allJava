package GUI;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TestingGUIBar {
    public void buildGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f = new JFrame("udin");
        // f.setUndecorated(true);
        f.setResizable(false);
        removeMinMaxClose(f);
        JPanel p = new JPanel(new GridBagLayout());
        JButton btn = new JButton("Exit");
        p.add(btn,new GridBagConstraints());
        f.getContentPane().add(p);
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        btn.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    System.exit(0);
                }
            }
        );
    }
    public void removeMinMaxClose(Component comp){
        if(comp instanceof AbstractButton) {
            comp.getParent().remove(comp);
        }
        if (comp instanceof Container){
            Component[] comps = ((Container)comp).getComponents();
            for(int x = 0, y = comps.length; x < y; x++) {
                removeMinMaxClose(comps[x]);
            }
        }
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(
            new Runnable(){
                public void run(){
                    // new TestingGUIBar().buildGUI();
                    JOptionPane.showMessageDialog(null, "yo mama", "notification", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(null, "yo mama", "notification", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "yo mama", "notification", JOptionPane.PLAIN_MESSAGE);
                    JOptionPane.showMessageDialog(null, "yo mama", "notification", JOptionPane.WARNING_MESSAGE);
                    JOptionPane.showMessageDialog(null, "yo mama", "notification", JOptionPane.QUESTION_MESSAGE);
                }
            }
        );
    }
}
