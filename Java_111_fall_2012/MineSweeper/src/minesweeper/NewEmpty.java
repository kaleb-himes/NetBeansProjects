import java.awt.* ;
import java.awt.event.* ;
import java.awt.geom.* ;
import javax.swing.* ;
import javax.swing.JPanel;
import javax.swing.event.* ;
    public class MyMineSweeperGui extends MineSweeper{
        public void minesweeper(){
            GridLayout layout = new GridLayout(rows,columns);
            MyMineSweeperLogic.startNewGame(rows,columns);
            JPanel p = new JPanel();
            p.setLayout(layout);
            Button [][] label = new Button[rows][columns];
                for(int x=0;x<columns;x++){
                    for(int y=0;y<rows;y++){
                       label[x][y] = new Button();
                       label[x][y].setPreferredSize(new Dimension(20,20));
                       label[x][y].setBackground(new Color(33,58,156));
                       p.add(label[x][y]);

               }
            }
        }
        public static void main(String[] args){
            JFrame f = new JFrame();
            f.add(new MyMineSweeperGui());
            f.setVisible();
            f.pack();
    }
