package physicssim;

/**
 *
 * @author Kaleb
 */
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.*;
public class Renderer {
    private JFrame frame;
    public Renderer(JFrame frame){
        this.frame = frame;
    }
    public void render(){
        Graphics g = frame.getGraphics();
        g.translate(500, 300);
        
        ArrayList<Force> forceArray = new ArrayList<>();
        for(int i = 1; i < ForceList.listModel.size(); i++){
            forceArray.add(ForceList.forceMap.get(ForceList.listModel.elementAt(i)));
        }
        g.setColor(Color.BLACK);
        for(int i = 0; i < forceArray.size(); i++){
            float newtons = forceArray.get(i).getForce();
            double rads = toRad(forceArray.get(i).getVector());
            int xInset = Math.round((float)(50 * Math.cos(rads)));
            int yInset = -Math.round((float)(50 * Math.sin(rads)));
            int x = Math.round((float)(xInset + newtons * Math.cos(rads)));
            int y = Math.round((float)(yInset - newtons * Math.sin(rads)));
            g.drawLine(0, 0, x, y);
        }
        g.setColor(Color.GRAY);
        g.fillOval(-50, -50, 100, 100);
        
        g.dispose();
    }
    public static double toRad(double deg){
        return deg * Math.PI / 180;
    }
    public static double toDeg(double rad){
        return rad * 180 / Math.PI;
    }
}
