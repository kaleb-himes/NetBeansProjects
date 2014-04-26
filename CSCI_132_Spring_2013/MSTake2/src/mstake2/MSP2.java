package mstake2;



/**
 *
 * @author Kaleb
 */

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MSP2 extends JPanel
{
    // instance variables - replace the example below with your own
    private int size = 750;
    private MSTake2 msGame;
    

    /**
     * Constructor for objects of class MondrianFrame
     */
    public MSP2(MSTake2 msGame1)
    {
        setPreferredSize(new Dimension(size, size));
        addMouseListener(new MSMouseListener());
        msGame = msGame1;
    }
           
    public void paint(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
// kind of lengthly i know but easiest way to see what I was doing 
// and get all the lines correctly drawn
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
                char curSquare = msGame.getSquare(i,j);
                String curSqStr = Character.toString(curSquare);
                int w = fm.stringWidth(curSqStr);
                g.drawString(curSqStr, 50*i + 25 - w/2, 50*j + 25 + a - h/2);
                int x = getX() / 50;
                int y = getY() / 50;
                if (msGame.getSquare(x,y) == ' ') {
                msGame.placeMines(); // randomly places the mines before user 
                                    //has a chance to click anything.
                repaint(); //repaints the squares with the mines in them.
                
               }
            }
        }
    }
    

    // INNER CLASS for a Mouse events:

    private class MSMouseListener implements MouseListener {

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
            //most of this is original code from tictactoe, however i 
            //added these in so that if I was able to cover all squares
            //you would still be able to reveal the numbers underneath,
            // only clicking on an '*' would result in a game over prior to
            //uncovering everything else.
            if (msGame.getSquare(x,y) == ' ' || 
                    msGame.getSquare(x,y) == '1' ||
                    msGame.getSquare(x,y) == '2' || 
                    msGame.getSquare(x,y) == '3' ||
                    msGame.getSquare(x,y) == '4' || 
                    msGame.getSquare(x,y) == '5' ||
                    msGame.getSquare(x,y) == '6' || 
                    msGame.getSquare(x,y) == '7' ||
                    msGame.getSquare(x,y) == '8') {
                msGame.setSquare(x,y, msGame.getCurPlayer());
                repaint();
                msGame.ComputerAI(x,y);
                 msGame.checkForWin();
            }
            if(msGame.getSquare(x,y) == 'O'){
                msGame.checkForGameEnd();
            }
        }
    }
}

