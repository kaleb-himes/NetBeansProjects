/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bmumey
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextPanelDemo extends JFrame {

    private JTextArea textArea;

    public TextPanelDemo() {
        setTitle("Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel aPanel = new JPanel();

        textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        aPanel.add(textArea);
        setContentPane(aPanel);
        pack();

    }
    
    public void updateText(String s) {
        textArea.setText(s);
    }
}
