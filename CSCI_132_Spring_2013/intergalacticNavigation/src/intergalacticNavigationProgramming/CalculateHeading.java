/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalacticNavigationProgramming;

/**
 *
 * @author kaleb.himes
 */
public class CalculateHeading {
     
    public static double computeBearing(double x1, double y1, double x2, double y2) {

        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double angleRadians = Math.acos((y2 - y1) / length); // in radians
        double angleDegrees = Math.toDegrees(angleRadians);

        if (x2 > x1) {
            return angleDegrees;
        }
        return (360 - angleDegrees);
    }
    public static double computeHeading(String s1, String s2){
        double heading = computeBearing(PBA.getXCoord(s1), PBA.getYCoord(s1), PBA.getXCoord(s2), PBA.getYCoord(s2));
        //print lines were for debugging purposes, uncomment to see how it's working.
//        System.out.println("string 1 : "+ s1);
//        System.out.println("String 2 : " + s2);
//        System.out.println("xCoord of string 1 : " + PBA.getXCoord(s1));
//        System.out.println("yCoord of string 1 : " + PBA.getYCoord(s1));
//        System.out.println("xCoord of string 2 : " + PBA.getXCoord(s2));
//        System.out.println("yCoord of string 2 : " + PBA.getYCoord(s2));
        return (heading);
    }

              
}
