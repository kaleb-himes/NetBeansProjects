
/**
 * Write a description of class MondrianFrame here.
 * 
 * @author Brenan
 * @version 16 Jan 2011
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class MondrianPanel extends JPanel
{
    // instance variables - replace the example below with your own
    private int size = 600;
    

    /**
     * Constructor for objects of class MondrianFrame
     */
    public MondrianPanel()
    {
        setPreferredSize(new Dimension(size, size));
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, size, size);
       
        int j;
        int k;
        int h;
        int l;
        for (int i = 0; i < 2000; i++)
        {
            j = (int)(Math.random()*50);
            k = (int)(Math.random()*50);
            h = (int)(Math.random()*600);
            l = (int)(Math.random()*600);
            g.setColor(Color.BLACK);
            g.fillRect(h - 3, l - 3, j + 6, k + 6);
            g.setColor(new Color ((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
            g.fillRect(h, l, j, k);
        } 
          
    }

}
