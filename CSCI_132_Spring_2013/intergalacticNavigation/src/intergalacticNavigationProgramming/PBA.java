/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalacticNavigationProgramming;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kaleb
 */
public class PBA extends BuildTheGraph {
    static String s;
    static int x;
    static int x_i;
    static int y_i;
    static int r;
    static String p1 = "planet ringer";
    static String p2 = "planet collosi";
    static String p3 = "planet eerath";
    static String p4 = "planet med";
    static String p5 = "planet acron";
    static String p6 = "planet bob";
    static String p7 = "planet craxus";
    static String p8 = "planet drob";
    static String p9 = "planet enreti";
    static String p10 = "planet forp";
    static String p11 = "planet grath";
    static String p12 = "planet hoth";
    static String p13 = "planet ipro";
    static String p14 = "planet jorg";
    static String p15 = "planet kalto";
    static String p16 = "planet lorf";
    static String p17 = "planet mov";
    static String p18 = "planet norl";
    static String p19 = "planet omn";
    static String p20 = "planet phat";
    static String p21 = "planet quorn";
    static String p22 = "planet rogue";
    static String p23 = "planet spron";
    static String p24 = "planet talgath";
    static String p25 = "planet uun";
    static String b1 = "base calzo";
    static String b2 = "base juji";
    static String b3 = "base maldo";
    static String b4 = "base nabu";
    static String b5 = "base pluto";
    static String b6 = "base quar";
    static String b7 = "base tranquility";
    static String b8 = "base xzen";
    static String b9 = "base yolo";
    static String b10 = "base zork";
    static String A1 = "A1";
    static String A2 = "A2";
    static String A3 = "A3";
    static String A4 = "A4";
    static String A5 = "A5";
    static String A6 = "A6";
    static String A7 = "A7";
    static String A8 = "A8";
    static String A9 = "A9";
    static String A10 = "A10";
    static HashMap<String, ArrayList<Integer>> planetsXY = new HashMap<>();
    //getPOBAN = get Planet Or Base At Node, provide a node 1- 35 to return
    public static String getPOBAN(int x) {
        
        if (x == 0) {
            s = p1;
        }
        if (x == 1) {
            s = p2;
        }
        if (x == 2) {
            s = p3;
        }
        if (x == 3) {
            s = p4;
        }
        if (x == 4) {
            s = p5;
        }
        if (x == 5) {
            s = p6;
        }
        if (x == 6) {
            s = p7;
        }
        if (x == 7) {
            s = p8;
        }
        if (x == 8) {
            s = p9;
        }
        if (x == 9) {
            s = p10;
        }
        if (x == 10) {
            s = p11;
        }
        if (x == 11) {
            s = p12;
        }
        if (x == 12) {
            s = p13;
        }
        if (x == 13) {
            s = p14;
        }
        if (x == 14) {
            s = p15;
        }
        if (x == 15) {
            s = p16;
        }
        if (x == 16) {
            s = p17;
        }
        if (x == 17) {
            s = p18;
        }
        if (x == 18) {
            s = p19;
        }
        if (x == 19) {
            s = p20;
        }
        if (x == 20) {
            s = p21;
        }
        if (x == 21) {
            s = p22;
        }
        if (x == 22) {
            s = p23;
        }
        if (x == 23) {
            s = p24;
        }
        if (x == 24) {
            s = p25;
        }
        if (x == 25) {
            s = b1;
        }
        if (x == 26) {
            s = b2;
        }
        if (x == 27) {
            s = b3;
        }
        if (x == 28) {
            s = b4;
        }
        if (x == 29) {
            s = b5;
        }
        if (x == 30) {
            s = b6;
        }
        if (x == 31) {
            s = b7;
        }
        if (x == 32) {
            s = b8;
        }
        if (x == 33) {
            s = b9;
        }
        if (x == 34) {
            s = b10;
        }
        if (x == 35) {
            s = A1;
        }
        if (x == 36) {
            s = A2;
        }
        if (x == 37) {
            s = A3;
        }
        if (x == 38) {
            s = A4;
        }
        if (x == 39) {
            s = A5;
        }
        if (x == 40) {
            s = A6;
        }
        if (x == 41) {
            s = A7;
        }
        if (x == 42) {
            s = A8;
        }
        if (x == 43) {
            s = A9;
        }
        if (x == 44) {
            s = A10;
        }
        return (s);
    }
    public static int getNode(String s){
        
        if ("planet ringer".equals(s)){
            x = 0;
        }
        if ("planet collosi".equals(s)){
            x = 1;
        }
        if ("planet eerath".equals(s)){
            x = 2;
        }
        if ("planet med".equals(s)){
            x = 3;
        }
        if ("planet acron".equals(s)){
            x = 4;
        }
        if ("planet bob".equals(s)){
            x = 5;
        }
        if ("planet craxus".equals(s)){
            x = 6;
        }
        if ("planet drob".equals(s)){
            x = 7;
        }
        if ("planet enreti".equals(s)){
            x = 8;
        }
        if ("planet forp".equals(s)){
            x = 9;
        }
        if ("planet grath".equals(s)){
            x = 10;
        }
        if ("planet hoth".equals(s)){
            x = 11;
        }
        if ("planet ipro".equals(s)){
            x = 12;
        }
        if ("planet jorg".equals(s)){
            x = 13;
        }
        if ("planet kalto".equals(s)){
            x = 14;
        }
        if ("planet lorf".equals(s)){
            x = 15;
        }
        if ("planet mov".equals(s)){
            x = 16;
        }
        if ("planet norl".equals(s)){
            x = 17;
        }
        if ("planet omn".equals(s)){
            x = 18;
        }
        if ("planet phat".equals(s)){
            x = 19;
        }
        if ("planet quorn".equals(s)){
            x = 20;
        }
        if ("planet rogue".equals(s)){
            x = 21;
        }
        if ("planet spron".equals(s)){
            x = 22;
        }
        if ("planet talgath".equals(s)){
            x = 23;
        }
        if ("planet uun".equals(s)){
            x = 24;
        }
        if ("base calzo".equals(s)){
            x = 25;
        }
        if ("base juji".equals(s)){
            x = 26;
        }
        if ("base maldo".equals(s)){
            x = 27;
        }
        if ("base nabu".equals(s)){
            x = 28;
        }
        if ("base pluto".equals(s)){
            x = 29;
        }
        if ("base quar".equals(s)){
            x = 30;
        }
        if ("base tranquility".equals(s)){
            x = 31;
        }
        if ("base xzen".equals(s)){
            x = 32;
        }
        if ("base yolo".equals(s)){
            x = 33;
        }
        if ("base zork".equals(s)){
            x = 34;
        }
        if ("A1".equals(s)){
            x = 35;
        }
        if ("A2".equals(s)){
            x = 36;
        }
        if ("A3".equals(s)){
            x = 37;
        }
        if ("A4".equals(s)){
            x = 38;
        }
        if ("A5".equals(s)){
            x = 39;
        }
        if ("A6".equals(s)){
            x = 40;
        }
        if ("A7".equals(s)){
            x = 41;
        }
        if ("A8".equals(s)){
            x = 42;
        }
        if ("A9".equals(s)){
            x = 43;
        }
        if ("A10".equals(s)){
            x = 44;
        }
        return (x);
    }
    public static int getXCoord(String s){
        
        int value = planetsXY.get(s).get(0);
        
        if ("planet ringer".equals(s)){
            x_i = value;
        }
        if ("planet collosi".equals(s)){
            x_i = value;
        }
        if ("planet eerath".equals(s)){
            x_i = value;
        }
        if ("planet med".equals(s)){
            x_i = value;
        }
        if ("planet acron".equals(s)){
            x_i = value;
        }
        if ("planet bob".equals(s)){
            x_i = value;
        }
        if ("planet craxus".equals(s)){
            x_i = value;
        }
        if ("planet drob".equals(s)){
            x_i = value;
        }
        if ("planet enreti".equals(s)){
            x_i = value;
        }
        if ("planet forp".equals(s)){
            x_i = value;
        }
        if ("planet grath".equals(s)){
            x_i = value;
        }
        if ("planet hoth".equals(s)){
            x_i = value;
        }
        if ("planet ipro".equals(s)){
            x_i = value;
        }
        if ("planet jorg".equals(s)){
            x_i = value;
        }
        if ("planet kalto".equals(s)){
            x_i = value;
        }
        if ("planet lorf".equals(s)){
            x_i = value;
        }
        if ("planet mov".equals(s)){
            x_i = value;
        }
        if ("planet norl".equals(s)){
            x_i = value;
        }
        if ("planet omn".equals(s)){
            x_i = value;
        }
        if ("planet phat".equals(s)){
            x_i = value;
        }
        if ("planet quorn".equals(s)){
            x_i = value;
        }
        if ("planet rogue".equals(s)){
            x_i = value;
        }
        if ("planet spron".equals(s)){
            x_i = value;
        }
        if ("planet talgath".equals(s)){
            x_i = value;
        }
        if ("planet uun".equals(s)){
            x_i = value;
        }
        if ("base calzo".equals(s)){
            x_i = value;
        }
        if ("base juji".equals(s)){
            x_i = value;
        }
        if ("base maldo".equals(s)){
            x_i = value;
        }
        if ("base nabu".equals(s)){
            x_i = value;
        }
        if ("base pluto".equals(s)){
            x_i = value;
        }
        if ("base quar".equals(s)){
            x_i = value;
        }
        if ("base tranquility".equals(s)){
            x_i = value;
        }
        if ("base xzen".equals(s)){
            x_i = value;
        }
        if ("base yolo".equals(s)){
            x_i = value;
        }
        if ("base zork".equals(s)){
            x_i = value;
        }
        if ("A1".equals(s)){
            x_i = value;
        }
        if ("A2".equals(s)){
            x_i = value;
        }
        if ("A3".equals(s)){
            x_i = value;
        }
        if ("A4".equals(s)){
            x_i = value;
        }
        if ("A5".equals(s)){
            x_i = value;
        }
        if ("A6".equals(s)){
            x_i = value;
        }
        if ("A7".equals(s)){
            x_i = value;
        }
        if ("A8".equals(s)){
            x_i = value;
        }
        if ("A9".equals(s)){
            x_i = value;
        }
        if ("A10".equals(s)){
            x_i = value;
        }
        //print lines for debugging purposes only, uncomment to see results
//        System.out.println();
//        System.out.println("The string that came in was:" + s + "\nthe key was : " + planetsXY
//                + "\n the x_i coordinate returned was: " + planetsXY.get(s).get(0));
//        System.out.println();
        return (x_i);
        
    }
    public static int getYCoord(String s){
        
        int value = planetsXY.get(s).get(1);
        
        if ("planet ringer".equals(s)){
            y_i = value;
        }
        if ("planet collosi".equals(s)){
            y_i = value;
        }
        if ("planet eerath".equals(s)){
            y_i = value;
        }
        if ("planet med".equals(s)){
            y_i = value;
        }
        if ("planet acron".equals(s)){
            y_i = value;
        }
        if ("planet bob".equals(s)){
            y_i = value;
        }
        if ("planet craxus".equals(s)){
            y_i = value;
        }
        if ("planet drob".equals(s)){
            y_i = value;
        }
        if ("planet enreti".equals(s)){
            y_i = value;
        }
        if ("planet forp".equals(s)){
            y_i = value;
        }
        if ("planet grath".equals(s)){
            y_i = value;
        }
        if ("planet hoth".equals(s)){
            y_i = value;
        }
        if ("planet ipro".equals(s)){
            y_i = value;
        }
        if ("planet jorg".equals(s)){
            y_i = value;
        }
        if ("planet kalto".equals(s)){
            y_i = value;
        }
        if ("planet lorf".equals(s)){
            y_i = value;
        }
        if ("planet mov".equals(s)){
            y_i = value;
        }
        if ("planet norl".equals(s)){
            y_i = value;
        }
        if ("planet omn".equals(s)){
            y_i = value;
        }
        if ("planet phat".equals(s)){
            y_i = value;
        }
        if ("planet quorn".equals(s)){
            y_i = value;
        }
        if ("planet rogue".equals(s)){
            y_i = value;
        }
        if ("planet spron".equals(s)){
            y_i = value;
        }
        if ("planet talgath".equals(s)){
            y_i = value;
        }
        if ("planet uun".equals(s)){
            y_i = value;
        }
        if ("base calzo".equals(s)){
            y_i = value;
        }
        if ("base juji".equals(s)){
            y_i = value;
        }
        if ("base maldo".equals(s)){
            y_i = value;
        }
        if ("base nabu".equals(s)){
            y_i = value;
        }
        if ("base pluto".equals(s)){
            y_i = value;
        }
        if ("base quar".equals(s)){
            y_i = value;
        }
        if ("base tranquility".equals(s)){
            y_i = value;
        }
        if ("base xzen".equals(s)){
            y_i = value;
        }
        if ("base yolo".equals(s)){
            y_i = value;
        }
        if ("base zork".equals(s)){
            y_i = value;
        }
        if ("A1".equals(s)){
            y_i = value;
        }
        if ("A2".equals(s)){
            y_i = value;
        }
        if ("A3".equals(s)){
            y_i = value;
        }
        if ("A4".equals(s)){
            y_i = value;
        }
        if ("A5".equals(s)){
            y_i = value;
        }
        if ("A6".equals(s)){
            y_i = value;
        }
        if ("A7".equals(s)){
            y_i = value;
        }
        if ("A8".equals(s)){
            y_i = value;
        }
        if ("A9".equals(s)){
            y_i = value;
        }
        if ("A10".equals(s)){
            y_i = value;
        }
        return (y_i);
    }
    public static int getRadius(String s){
        int value = planetsXY.get(s).get(2);
        if ("A1".equals(s)){
            r = value;
        }
        if ("A2".equals(s)){
            r = value;
        }
        if ("A3".equals(s)){
            r = value;
        }
        if ("A4".equals(s)){
            r = value;
        }
        if ("A5".equals(s)){
            r = value;
        }
        if ("A6".equals(s)){
            r = value;
        }
        if ("A7".equals(s)){
            r = value;
        }
        if ("A8".equals(s)){
            r = value;
        }
        if ("A9".equals(s)){
            r = value;
        }
        if ("A10".equals(s)){
            r = value;
        }
        return (r);
    }
}
