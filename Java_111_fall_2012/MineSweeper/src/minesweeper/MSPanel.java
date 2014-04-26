package minesweeper;


import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * Write a description of class MSPanel here.
 * 
 * @author Kaleb J Himes
 * @version Jan 26 2013
 */
public class MSPanel extends JPanel
{
    // instance variables - replace the example below with your own
    private int size = 750;
    private MineSweeper MSGame;

    /**
     * Constructor for objects of class MondrianFrame
     */
    public MSPanel(MineSweeper MSGame1)
    {
        setPreferredSize(new Dimension(size, size));
        addMouseListener(new MSGMouseListener());
        MSGame = MSGame1;
    }

    @Override
    public void paint(Graphics g)
    {
        {g.setColor(Color.GRAY);
        int x;
        int y;
        for(int i = 0; i <= 750; i++){
            for(int j = 0; j <= 750; j++){
                x = i*50;
                y = j*50;
        g.fill3DRect(i, j, 50, 50, true);
     
            }  
        }
    }
        g.setColor(Color.BLACK);
        g.drawLine(0,50,750,50);
        g.drawLine(0,100,750,100);
        g.drawLine(0,150,750,150);
        g.drawLine(0,200,750,200);
        g.drawLine(0,250,750,250);
        g.drawLine(0,300,750,300);
        g.drawLine(0,350,750,350);
        g.drawLine(0,400,750,400);
        g.drawLine(0,450,750,450);
        g.drawLine(0,500,750,500);
        g.drawLine(0,550,750,550);
        g.drawLine(0,600,750,600);
        g.drawLine(0,650,750,650);
        g.drawLine(0,700,750,700);
        g.drawLine(0,750,750,750);
        g.drawLine(50,0,50,750);
        g.drawLine(100,0,100,750);
        g.drawLine(150,0,150,750);
        g.drawLine(200,0,200,750);
        g.drawLine(250,0,250,750);
        g.drawLine(300,0,300,750);
        g.drawLine(350,0,350,750);
        g.drawLine(400,0,400,750);
        g.drawLine(450,0,450,750);
        g.drawLine(500,0,500,750);
        g.drawLine(550,0,550,750);
        g.drawLine(600,0,600,750);
        g.drawLine(650,0,650,750);
        g.drawLine(700,0,700,750);
        g.drawLine(750,0,750,750);
       
        Font f = new Font("Times", Font.PLAIN, 30);
        g.setFont(f);
        FontMetrics fm = g.getFontMetrics();
        
        int a = fm.getAscent();
        int h = fm.getHeight();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                char curSquare = MSGame.getSquare(i,j);
                String curSqStr = Character.toString(curSquare);
                int w = fm.stringWidth(curSqStr);
                g.drawString(curSqStr, 50*i + 25 - w/2, 50*j + 25 + a - h/2);
            }
        }
    }

    // INNER CLASS for a Mouse events:

    private class MSGMouseListener implements MouseListener {

        @Override
        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public void mouseClicked(MouseEvent e) {
            int x = e.getX() / 50;
            int y = e.getY() / 50;
            if (MSGame.getSquare(x,y) == ' ') {
                MSGame.setSquare(x,y, MSGame.getCurColor());
                repaint();
                MSGame.reveal();
                MSGame.revealNeighboring();
                MSGame.checkForGameEnd();
                MSGame.randomMines();
            }
        }

        @Override
        public void mouseClicked(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

}