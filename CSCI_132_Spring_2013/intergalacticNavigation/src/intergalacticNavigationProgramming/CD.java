/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalacticNavigationProgramming;

import java.security.SecureRandom;

/**
 *
 * @author Kaleb
 */
public class CD {
    //pCMUTD stands for pre-Calculated Messed Up Time Distance since the space time continuum is screwed.
    public static double pCMUTD(int x1, int y1, int x2, int y2){
        SecureRandom random = new SecureRandom();
        double R = random.nextInt(5)+0.5;
        double distance = (Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1))));
        double pCMUTD = distance * R;
        return (pCMUTD);
    }
    public static double getDistance(String s1, String s2){
        double distance = pCMUTD(PBA.getXCoord(s1), PBA.getYCoord(s1), PBA.getXCoord(s2), PBA.getYCoord(s2));
        return distance;
    }
}