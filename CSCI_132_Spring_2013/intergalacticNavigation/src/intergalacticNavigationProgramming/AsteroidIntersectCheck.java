/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalacticNavigationProgramming;

/**
 *
 * @author Brendan
 */
public class AsteroidIntersectCheck {

    public static boolean blockedByCircle(int x1, int y1,
            int x2, int y2,
            int x3, int y3, int r) {
        double t = 0.0;
        if (x1 != x2 || y1 != y2) {
            t = ((x2 - x1) * (x3 - x1) + (y2 - y1) * (y3 - y1)) / ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }

        if (t > 1) {
            t = 1.0;
        }
        if (t < 0) {
            t = 0.0;
        }
        // find closest point (x,y)
        double x = x1 + t * (x2 - x1);
        double y = y1 + t * (y2 - y1);

        double distSq = (x - x3) * (x - x3) + (y - y3) * (y - y3);
        return (distSq <= r * r);
    }
public static boolean isValidRoute(String p1, String p2, String a){
    boolean canTravel = blockedByCircle(PBA.getXCoord(p1), 
                                        PBA.getYCoord(p1), 
                                        PBA.getXCoord(p2), 
                                        PBA.getYCoord(p2), 
                                        PBA.getXCoord(a), 
                                        PBA.getYCoord(a),
                                        PBA.getRadius(a));
    return (canTravel);
}
   
}
