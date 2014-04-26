package intergalacticNavigationProgramming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class BuildTheGraph extends GalaxyMapGUI {

    static String doNotUseTwice;
    static String compare;
    static int xCoord, yCoord, radius;
    static Deque<Integer> buildingPath1 = new ArrayDeque<Integer>();
    static Deque<Integer> Asteroids = new ArrayDeque<Integer>();
    //the x and y coordinates of the 35 non asteroid nodes
    //the 45 nodes consisting of planets (nodes: 1-25), bases (nodes 26 - 35), and asteroids (nodes 36 - 45)
    static int node1, node2, node3, node4, node5, node6, node7, node8, node9, node10, node11,
            node12, node13, node14, node15, node16, node17, node18, node19, node20, node21, node22,
            node23, node24, node25, node26, node27, node28, node29, node30, node31, node32, node33,
            node34, node35, node36, node37, node38, node39, node40, node41, node42, node43, node44,
            node45;
    //r stands for radius so r36 means the radius of the astroid field that is node 36
    static int r36, r37, r38, r39, r40, r41, r42, r43, r44, r45;
    static String[][] galaxy = new String[1000][1000];

    public static void writeTheNodesXYandRadiusifApplicable() {
        int node = 35;
        int asteroid = 45;
        for (int i = 0; i < 45; i++) {
            SecureRandom newX = new SecureRandom();
            SecureRandom newY = new SecureRandom();
            SecureRandom newR = new SecureRandom();
            radius = newR.nextInt(50) + 50;
            xCoord = newX.nextInt(1000);
            yCoord = newY.nextInt(1000);
            createNode(xCoord, yCoord, i);
            if (node >= 0) {
                buildingPath1.push(node);
                node--;
            }
            if (asteroid >= 36) {
                Asteroids.push(asteroid);
                asteroid--;
            }
            if (i == 0) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 1) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 2) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 3) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 4) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 5) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 6) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 7) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 8) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 9) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 10) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 11) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 12) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 13) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 14) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 15) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 16) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 17) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 18) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 19) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 20) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 21) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 22) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 23) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 24) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 25) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 26) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 27) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 28) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 29) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 30) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 31) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 32) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 33) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 34) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 35) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                coordinates.add(radius);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 36) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                coordinates.add(radius);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 37) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                coordinates.add(radius);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 38) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                coordinates.add(radius);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 39) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                coordinates.add(radius);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 40) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                coordinates.add(radius);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 41) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                coordinates.add(radius);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 42) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                coordinates.add(radius);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
            if (i == 43) {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                coordinates.add(radius);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            } else {
                ArrayList<Integer> coordinates = new ArrayList<>();

                coordinates.add(xCoord);
                coordinates.add(yCoord);
                coordinates.add(radius);
                PBA.planetsXY.put(PBA.getPOBAN(i), coordinates);
            }
        }
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if (galaxy[i][j] == null) {
                    galaxy[i][j] = " ";
                }
                if (!" ".equals(galaxy[i][j]) && !"A1".equals(galaxy[i][j])
                        && !"A2".equals(galaxy[i][j]) && !"A3".equals(galaxy[i][j])
                        && !"A4".equals(galaxy[i][j]) && !"A5".equals(galaxy[i][j])
                        && !"A6".equals(galaxy[i][j]) && !"A7".equals(galaxy[i][j])
                        && !"A8".equals(galaxy[i][j]) && !"A9".equals(galaxy[i][j])
                        && !"A10".equals(galaxy[i][j])) {
                    GalaxyMapGUI.GalaxyMapTA.append(galaxy[i][j] + "\n");
//                    GalaxyMapGUI.RouteInstructionsTA.append(galaxy[i][j]+"\n");
                }
                if ("A1".equals(galaxy[i][j])) {
                    r36 = radiusOfAsteroids();
                }
                if ("A2".equals(galaxy[i][j])) {
                    r37 = radiusOfAsteroids();
                }
                if ("A3".equals(galaxy[i][j])) {
                    r38 = radiusOfAsteroids();
                }
                if ("A4".equals(galaxy[i][j])) {
                    r39 = radiusOfAsteroids();
                }
                if ("A5".equals(galaxy[i][j])) {
                    r40 = radiusOfAsteroids();
                }
                if ("A6".equals(galaxy[i][j])) {
                    r41 = radiusOfAsteroids();
                }
                if ("A7".equals(galaxy[i][j])) {
                    r42 = radiusOfAsteroids();
                }
                if ("A8".equals(galaxy[i][j])) {
                    r43 = radiusOfAsteroids();
                }
                if ("A9".equals(galaxy[i][j])) {
                    r44 = radiusOfAsteroids();
                }
                if ("A10".equals(galaxy[i][j])) {
                    r45 = radiusOfAsteroids();
                }
            }
        }
    }

    public static int radiusOfAsteroids() {
        int radius = 0;
        SecureRandom Asteroid = new SecureRandom();
        int anAsteroidField = Asteroid.nextInt(6);
        if (anAsteroidField == 0) {
            radius = 50;
        }
        if (anAsteroidField == 1) {
            radius = 60;
        }
        if (anAsteroidField == 2) {
            radius = 70;
        }
        if (anAsteroidField == 3) {
            radius = 80;
        }
        if (anAsteroidField == 4) {
            radius = 90;
        }
        if (anAsteroidField == 5) {
            radius = 100;
        }
        return radius;
    }

    public static void createNode(int x, int y, int i) {
        galaxy[x][y] = PBA.getPOBAN(i);
    }

    public static void createPaths() throws IOException {
        //we know how many bases and planets there are, could easily replace with a method 
        //but i considered it unnecessary in this case
        int numberOfNodes = 35;
        try {
            node1 = buildingPath1.pop();
            node2 = buildingPath1.pop();
            node3 = buildingPath1.pop();
            node4 = buildingPath1.pop();
            node5 = buildingPath1.pop();
            node6 = buildingPath1.pop();
            node7 = buildingPath1.pop();
            node8 = buildingPath1.pop();
            node9 = buildingPath1.pop();
            node10 = buildingPath1.pop();
            node11 = buildingPath1.pop();
            node12 = buildingPath1.pop();
            node13 = buildingPath1.pop();
            node14 = buildingPath1.pop();
            node15 = buildingPath1.pop();
            node16 = buildingPath1.pop();
            node17 = buildingPath1.pop();
            node18 = buildingPath1.pop();
            node19 = buildingPath1.pop();
            node20 = buildingPath1.pop();
            node21 = buildingPath1.pop();
            node22 = buildingPath1.pop();
            node23 = buildingPath1.pop();
            node24 = buildingPath1.pop();
            node25 = buildingPath1.pop();
            node26 = buildingPath1.pop();
            node27 = buildingPath1.pop();
            node28 = buildingPath1.pop();
            node29 = buildingPath1.pop();
            node30 = buildingPath1.pop();
            node31 = buildingPath1.pop();
            node32 = buildingPath1.pop();
            node33 = buildingPath1.pop();
            node34 = buildingPath1.pop();
            node35 = buildingPath1.pop();
            node36 = Asteroids.pop();

            /*
             * NOTE: UNCOMMENT AS NEEDED TO PROVIDE MORE CONNECTIONS THROUGHOUT THE UNIVERSE
             * OR COMMENT AS DESIRED TO CREATE FEWER CONNECTIONS THROUGHOUT THE UNIVERSE,
             * EVERY POSSIBLE CONNECTION IS HERE SO IF YOU'D LIKE IT TO BE POSSIBLE TO TRAVEL FROM
             * NODE 1 TO ANY OTHER NODE IN ONE SHOT UNCOMMENT EVERTHING
             * 
             * THIS HOWEVER, DOES NOT GUARANTEE THAT TRAVELING FROM NODE 1 TO NODE 35 DIRECTLY
             * WILL BE THE SHORTEST ROUTE FROM 1 TO 35 etc. =)
             * 
             * HOWEVER I ONLY PUT ASTERID CHECKS ON THE CONNECTIONS I WANTED TO MAKE OTHERWISE THIS WOULD
             * HAVE TAKEN ME MUCH LONGER TO DO.
             */
            FileWriter fw = new FileWriter("src\\nodesAndWeights.txt", false);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(numberOfNodes + "\n");
                //THEN WRITE EVERY POSSIBLE CONNECTION IF DESIRED OR... JUST THE UNCOMMENTED ONES!
                //and thank the lord this is an undirected graph or we'd have to write 35^2 iterations, ugg
                //as is we were able to write it this many times... {x | n>0, (35+34+33+...+n-1)}

                for (int i = 0; i < 10; i++) {
                    if (i == 0) {compare = PBA.getPOBAN(node36);}
                    if (i == 1) {compare = PBA.getPOBAN(node37);}
                    if (i == 2) {compare = PBA.getPOBAN(node38);}
                    if (i == 3) {compare = PBA.getPOBAN(node39);}
                    if (i == 4) {compare = PBA.getPOBAN(node40);}
                    if (i == 5) {compare = PBA.getPOBAN(node41);}
                    if (i == 6) {compare = PBA.getPOBAN(node42);}
                    if (i == 7) {compare = PBA.getPOBAN(node43);}
                    if (i == 8) {compare = PBA.getPOBAN(node44);}
                    if (i == 9) {compare = PBA.getPOBAN(node45);}
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node2), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node1 + " " + node2 + " " + CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node2)) + "\n");
                    }

    //        bw.write(node1+" "+node3+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node3))+"\n");
    //        bw.write(node1+" "+node4+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node4))+"\n");
    //        bw.write(node1+" "+node5+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node5))+"\n");
    //        bw.write(node1+" "+node6+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node6))+"\n");
    //        bw.write(node1+" "+node7+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node7))+"\n");
    //        bw.write(node1+" "+node8+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node8))+"\n");
    //        bw.write(node1+" "+node9+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node9))+"\n");
    //        bw.write(node1+" "+node10+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node10))+"\n");
    //        bw.write(node1+" "+node11+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node11))+"\n");
    //        bw.write(node1+" "+node12+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node12))+"\n");
    //        bw.write(node1+" "+node13+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node13))+"\n");
    //        bw.write(node1+" "+node14+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node14))+"\n");
    //        bw.write(node1+" "+node15+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node15))+"\n");
    //        bw.write(node1+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node1+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node17))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node1 + " " + node18 + " " + CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node18)) + "\n");
                    }

    //        bw.write(node1+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node1+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node1+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node1+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node1+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node1+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node1+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node1+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node1+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node1+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node1+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node1+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node1+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node1+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node1+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node1+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node1+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node1), PBA.getPOBAN(node35))+"\n");

                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node2), PBA.getPOBAN(node3), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node2 + " " + node3 + " " + CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node3)) + "\n");
                    }

    //        bw.write(node2+" "+node4+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node4))+"\n");
    //        bw.write(node2+" "+node5+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node5))+"\n");
    //        bw.write(node2+" "+node6+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node6))+"\n");
    //        bw.write(node2+" "+node7+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node7))+"\n");
    //        bw.write(node2+" "+node8+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node8))+"\n");
    //        bw.write(node2+" "+node9+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node9))+"\n");
    //        bw.write(node2+" "+node10+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node10))+"\n");
    //        bw.write(node2+" "+node11+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node11))+"\n");
    //        bw.write(node2+" "+node12+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node12))+"\n");
    //        bw.write(node2+" "+node13+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node13))+"\n");
    //        bw.write(node2+" "+node14+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node14))+"\n");

                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node2), PBA.getPOBAN(node15), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node2 + " " + node15 + " " + CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node15)) + "\n");
                    }
    //        bw.write(node2+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node2+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node17))+"\n");
    //        bw.write(node2+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node2+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node2+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node2+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node2+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node2+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node2+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node2+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node2+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node2+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node2+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node2+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node2+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node2+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node2+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node2+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node2+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node2+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node2), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node3+" "+node4+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node4))+"\n");
    //        bw.write(node3+" "+node5+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node5))+"\n");
    //        bw.write(node3+" "+node6+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node6))+"\n");
    //        bw.write(node3+" "+node7+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node7))+"\n");
    //        bw.write(node3+" "+node8+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node8))+"\n");
    //        bw.write(node3+" "+node9+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node9))+"\n");
    //        bw.write(node3+" "+node10+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node10))+"\n");
    //        bw.write(node3+" "+node11+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node11))+"\n");
    //        bw.write(node3+" "+node12+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node12))+"\n");
    //        bw.write(node3+" "+node13+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node13))+"\n");
    //        bw.write(node3+" "+node14+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node14))+"\n");
    //        bw.write(node3+" "+node15+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node15))+"\n");
    //        bw.write(node3+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node3+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node17))+"\n");
    //        bw.write(node3+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node3+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node19))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node3), PBA.getPOBAN(node20), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node3 + " " + node20 + " " + CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node20)) + "\n");
                    }
    //        bw.write(node3+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node3+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node3+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node3+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node3+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node3+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node3+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node3+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node3+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node3+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node3+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node3+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node3+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node3+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node34))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node3), PBA.getPOBAN(node35), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node3 + " " + node35 + " " + CD.getDistance(PBA.getPOBAN(node3), PBA.getPOBAN(node35)) + "\n");
                    }


                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node4), PBA.getPOBAN(node5), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node4 + " " + node5 + " " + CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node5)) + "\n");
                    }
    //        bw.write(node4+" "+node6+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node6))+"\n");
    //        bw.write(node4+" "+node7+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node7))+"\n");
    //        bw.write(node4+" "+node8+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node8))+"\n");
    //        bw.write(node4+" "+node9+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node9))+"\n");
    //        bw.write(node4+" "+node10+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node10))+"\n");
    //        bw.write(node4+" "+node11+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node11))+"\n");
    //        bw.write(node4+" "+node12+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node12))+"\n");
    //        bw.write(node4+" "+node13+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node13))+"\n");
    //        bw.write(node4+" "+node14+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node14))+"\n");
    //        bw.write(node4+" "+node15+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node15))+"\n");
    //        bw.write(node4+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node4+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node17))+"\n");
    //        bw.write(node4+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node4+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node4+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node4+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node4+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node4+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node4+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node4+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node25))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node4), PBA.getPOBAN(node26), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node4 + " " + node26 + " " + CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node26)) + "\n");
                    }
    //        bw.write(node4+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node4+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node4+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node4+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node4+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node4+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node4+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node4+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node4+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node4), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node5+" "+node6+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node6))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node5), PBA.getPOBAN(node7), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node5 + " " + node7 + " " + CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node7)) + "\n");
                    }
    //        bw.write(node5+" "+node8+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node8))+"\n");
    //        bw.write(node5+" "+node9+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node9))+"\n");
    //        bw.write(node5+" "+node10+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node10))+"\n");
    //        bw.write(node5+" "+node11+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node11))+"\n");
    //        bw.write(node5+" "+node12+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node12))+"\n");
    //        bw.write(node5+" "+node13+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node13))+"\n");
    //        bw.write(node5+" "+node14+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node14))+"\n");
    //        bw.write(node5+" "+node15+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node15))+"\n");
    //        bw.write(node5+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node5+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node17))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node5), PBA.getPOBAN(node18), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node5 + " " + node18 + " " + CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node18)) + "\n");
                    }
    //        bw.write(node5+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node5+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node5+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node5+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node5+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node5+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node5+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node5+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node5+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node5+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node5+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node5+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node5+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node5+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node5+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node5+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node5+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node5), PBA.getPOBAN(node35))+"\n");

                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node6), PBA.getPOBAN(node7), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node6 + " " + node7 + " " + CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node7)) + "\n");
                    }
    //        bw.write(node6+" "+node8+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node8))+"\n");
    //        bw.write(node6+" "+node9+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node9))+"\n");
    //        bw.write(node6+" "+node10+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node10))+"\n");
    //        bw.write(node6+" "+node11+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node11))+"\n");
    //        bw.write(node6+" "+node12+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node12))+"\n");
    //        bw.write(node6+" "+node13+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node13))+"\n");
    //        bw.write(node6+" "+node14+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node14))+"\n");
    //        bw.write(node6+" "+node15+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node15))+"\n");
    //        bw.write(node6+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node6+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node17))+"\n");
    //        bw.write(node6+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node6+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node6+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node6+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node6+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node6+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node6+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node6+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node25))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node6), PBA.getPOBAN(node26), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node6 + " " + node26 + " " + CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node26)) + "\n");
                    }
    //        bw.write(node6+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node6+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node6+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node6+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node6+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node6+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node6+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node6+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node6+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node6), PBA.getPOBAN(node35))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node7), PBA.getPOBAN(node8), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node7 + " " + node8 + " " + CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node8)) + "\n");
                    }
    //        bw.write(node7+" "+node9+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node9))+"\n");
    //        bw.write(node7+" "+node10+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node10))+"\n");
    //        bw.write(node7+" "+node11+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node11))+"\n");
    //        bw.write(node7+" "+node12+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node12))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node7), PBA.getPOBAN(node13), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node7 + " " + node13 + " " + CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node13)) + "\n");
                    }
    //        bw.write(node7+" "+node14+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node14))+"\n");
    //        bw.write(node7+" "+node15+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node15))+"\n");
    //        bw.write(node7+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node7+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node17))+"\n");
    //        bw.write(node7+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node7+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node7+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node7+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node7+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node7+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node7+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node7+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node7+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node7+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node7+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node7+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node7+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node7+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node7+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node7+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node7+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node7+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node7), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node8+" "+node9+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node9))+"\n");
    //        bw.write(node8+" "+node10+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node10))+"\n");
    //        bw.write(node8+" "+node11+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node11))+"\n");
    //        bw.write(node8+" "+node12+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node12))+"\n");
    //        bw.write(node8+" "+node13+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node13))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node8), PBA.getPOBAN(node14), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node8 + " " + node14 + " " + CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node14)) + "\n");
                    }
    //        bw.write(node8+" "+node15+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node15))+"\n");
    //        bw.write(node8+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node8+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node17))+"\n");
    //        bw.write(node8+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node8+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node8+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node8+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node8+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node8+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node8+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node8+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node8+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node8+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node27))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node8), PBA.getPOBAN(node28), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node8 + " " + node28 + " " + CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node28)) + "\n");
                    }
    //        bw.write(node8+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node8+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node8+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node8+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node8+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node8+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node8+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node8), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node9+" "+node10+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node10))+"\n");
    //        bw.write(node9+" "+node11+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node11))+"\n");
    //        bw.write(node9+" "+node12+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node12))+"\n");
    //        bw.write(node9+" "+node13+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node13))+"\n");
    //        bw.write(node9+" "+node14+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node14))+"\n");

                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node9), PBA.getPOBAN(node15), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node9 + " " + node15 + " " + CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node15)) + "\n");
                    }
    //        bw.write(node9+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node9+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node17))+"\n");
    //        bw.write(node9+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node9+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node9+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node9+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node9+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node9+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node9+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node9+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node9+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node9+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node9+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node28))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node9), PBA.getPOBAN(node29), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node9 + " " + node29 + " " + CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node29)) + "\n");
                    }
    //        bw.write(node9+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node9+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node9+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node9+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node9+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node9+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node9), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node10+" "+node11+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node11))+"\n");
    //        bw.write(node10+" "+node12+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node12))+"\n");
    //        bw.write(node10+" "+node13+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node13))+"\n");
    //        bw.write(node10+" "+node14+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node14))+"\n");
    //        bw.write(node10+" "+node15+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node15))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node10), PBA.getPOBAN(node16), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node10 + " " + node16 + " " + CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node16)) + "\n");
                    }
    //        bw.write(node10+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node17))+"\n");
    //        bw.write(node10+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node10+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node10+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node10+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node10+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node10+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node10+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node10+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node10+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node10+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node10+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node10+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node29))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node10), PBA.getPOBAN(node30), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node10 + " " + node30 + " " + CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node30)) + "\n");
                    }
    //        bw.write(node10+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node10+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node10+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node10+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node10+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node10), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node11+" "+node12+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node12))+"\n");
    //        bw.write(node11+" "+node13+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node13))+"\n");
    //        bw.write(node11+" "+node14+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node14))+"\n");
    //        bw.write(node11+" "+node15+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node15))+"\n");
    //        bw.write(node11+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node16))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node11), PBA.getPOBAN(node17), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node11 + " " + node17 + " " + CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node17)) + "\n");
                    }
    //        bw.write(node11+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node11+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node11+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node11+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node11+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node11+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node11+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node11+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node11+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node11+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node11+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node11+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node11+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node30))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node11), PBA.getPOBAN(node31), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node11 + " " + node31 + " " + CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node31)) + "\n");
                    }
    //        bw.write(node11+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node11+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node11+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node11+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node11), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node12+" "+node13+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node13))+"\n");
    //        bw.write(node12+" "+node14+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node14))+"\n");
    //        bw.write(node12+" "+node15+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node15))+"\n");
    //        bw.write(node12+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node12+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node17))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node12), PBA.getPOBAN(node18), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node12 + " " + node18 + " " + CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node18)) + "\n");
                    }
    //        bw.write(node12+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node12+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node12+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node12+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node12+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node12+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node12+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node12+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node12+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node12+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node12+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node12+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node12+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node31))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node12), PBA.getPOBAN(node32), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node12 + " " + node32 + " " + CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node32)) + "\n");
                    }
    //        bw.write(node12+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node12+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node12+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node12), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node13+" "+node14+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node14))+"\n");
    //        bw.write(node13+" "+node15+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node15))+"\n");
    //        bw.write(node13+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node13+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node17))+"\n");
    //        bw.write(node13+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node18))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node13), PBA.getPOBAN(node19), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node13 + " " + node19 + " " + CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node19)) + "\n");
                    }
    //        bw.write(node13+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node13+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node13+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node13+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node13+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node13+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node13+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node13+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node13+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node13+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node13+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node13+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node13+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node13+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node33))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node13), PBA.getPOBAN(node34), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node13 + " " + node34 + " " + CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node34)) + "\n");
                    }
    //        bw.write(node13+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node13), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node14+" "+node15+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node15))+"\n");
    //        bw.write(node14+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node14+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node17))+"\n");
    //        bw.write(node14+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node14+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node19))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node14), PBA.getPOBAN(node20), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node14 + " " + node20 + " " + CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node20)) + "\n");
                    }
    //        bw.write(node14+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node14+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node14+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node14+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node14+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node14+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node14+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node14+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node14+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node14+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node14+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node14+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node14+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node33))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node14), PBA.getPOBAN(node34), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node14 + " " + node34 + " " + CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node34)) + "\n");
                    }
    //        bw.write(node14+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node14), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node15+" "+node16+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node16))+"\n");
    //        bw.write(node15+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node17))+"\n");
    //        bw.write(node15+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node15+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node15+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node20))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node15), PBA.getPOBAN(node21), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node15 + " " + node21 + " " + CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node21)) + "\n");
                    }
    //        bw.write(node15+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node15+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node15+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node15+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node15+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node15+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node15+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node15+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node15+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node15+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node15+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node15+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node15+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node15+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node15), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node16+" "+node17+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node17))+"\n");
    //        bw.write(node16+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node16+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node16+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node16+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node21))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node16), PBA.getPOBAN(node22), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node16 + " " + node22 + " " + CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node22)) + "\n");
                    }
    //        bw.write(node16+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node16+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node16+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node16+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node16+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node16+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node16+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node16+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node16+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node16+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node16+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node16+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node16+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node16), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node17+" "+node18+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node18))+"\n");
    //        bw.write(node17+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node17+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node17+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node17+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node22))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node17), PBA.getPOBAN(node23), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node17 + " " + node23 + " " + CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node23)) + "\n");
                    }
    //        bw.write(node17+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node17+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node17+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node17+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node17+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node17+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node17+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node17+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node17+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node17+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node17+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node17+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node17), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node18+" "+node19+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node19))+"\n");
    //        bw.write(node18+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node18+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node18+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node18+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node23))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node18), PBA.getPOBAN(node24), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node18 + " " + node24 + " " + CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node24)) + "\n");
                    }
    //        bw.write(node18+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node18+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node18+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node18+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node18+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node18+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node18+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node18+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node18+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node18+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node18+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node18), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node19+" "+node20+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node20))+"\n");
    //        bw.write(node19+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node19+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node19+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node19+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node24))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node19), PBA.getPOBAN(node25), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node19 + " " + node25 + " " + CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node25)) + "\n");
                    }
    //        bw.write(node19+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node19+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node19+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node19+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node19+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node19+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node19+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node19+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node19+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node19+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node19), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node20+" "+node21+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node21))+"\n");
    //        bw.write(node20+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node20+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node20+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node20+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node25))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node20), PBA.getPOBAN(node26), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node20 + " " + node26 + " " + CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node26)) + "\n");
                    }
    //        bw.write(node20+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node20+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node20+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node20+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node20+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node20+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node20+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node20+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node20+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node20), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node21+" "+node22+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node22))+"\n");
    //        bw.write(node21+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node21+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node21+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node21+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node26))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node21), PBA.getPOBAN(node27), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node21 + " " + node27 + " " + CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node27)) + "\n");
                    }
    //        bw.write(node21+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node21+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node21+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node21+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node21+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node21+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node21+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node21+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node21), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node22+" "+node23+" "+CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node23))+"\n");
    //        bw.write(node22+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node22+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node22+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node22+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node27))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node22), PBA.getPOBAN(node28), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node22 + " " + node28 + " " + CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node28)) + "\n");
                    }
    //        bw.write(node22+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node22+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node22+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node22+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node22+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node22+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node22+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node22), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node23+" "+node24+" "+CD.getDistance(PBA.getPOBAN(node23), PBA.getPOBAN(node24))+"\n");
    //        bw.write(node23+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node23), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node23+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node23), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node23+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node23), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node23+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node23), PBA.getPOBAN(node28))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node23), PBA.getPOBAN(node29), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node23 + " " + node29 + " " + CD.getDistance(PBA.getPOBAN(node23), PBA.getPOBAN(node29)) + "\n");
                    }
    //        bw.write(node23+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node23), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node23+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node23), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node23+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node23), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node23+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node23), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node23+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node23), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node23+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node23), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node24+" "+node25+" "+CD.getDistance(PBA.getPOBAN(node24), PBA.getPOBAN(node25))+"\n");
    //        bw.write(node24+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node24), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node24+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node24), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node24+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node24), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node24+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node24), PBA.getPOBAN(node29))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node24), PBA.getPOBAN(node30), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node24 + " " + node30 + " " + CD.getDistance(PBA.getPOBAN(node24), PBA.getPOBAN(node30)) + "\n");
                    }
    //        bw.write(node24+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node24), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node24+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node24), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node24+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node24), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node24+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node24), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node24+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node24), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node25+" "+node26+" "+CD.getDistance(PBA.getPOBAN(node25), PBA.getPOBAN(node26))+"\n");
    //        bw.write(node25+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node25), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node25+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node25), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node25+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node25), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node25+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node25), PBA.getPOBAN(node30))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node25), PBA.getPOBAN(node31), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node25 + " " + node31 + " " + CD.getDistance(PBA.getPOBAN(node25), PBA.getPOBAN(node31)) + "\n");
                    }
    //        bw.write(node25+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node25), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node25+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node25), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node25+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node25), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node25+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node25), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node26+" "+node27+" "+CD.getDistance(PBA.getPOBAN(node26), PBA.getPOBAN(node27))+"\n");
    //        bw.write(node26+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node26), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node26+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node26), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node26+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node26), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node26+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node26), PBA.getPOBAN(node31))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node26), PBA.getPOBAN(node32), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node26 + " " + node32 + " " + CD.getDistance(PBA.getPOBAN(node26), PBA.getPOBAN(node32)) + "\n");
                    }
    //        bw.write(node26+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node26), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node26+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node26), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node26+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node26), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node27+" "+node28+" "+CD.getDistance(PBA.getPOBAN(node27), PBA.getPOBAN(node28))+"\n");
    //        bw.write(node27+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node27), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node27+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node27), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node27+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node27), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node27+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node27), PBA.getPOBAN(node32))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node27), PBA.getPOBAN(node33), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node27 + " " + node33 + " " + CD.getDistance(PBA.getPOBAN(node27), PBA.getPOBAN(node33)) + "\n");
                    }
    //        bw.write(node27+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node27), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node27+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node27), PBA.getPOBAN(node35))+"\n");

    //        bw.write(node28+" "+node29+" "+CD.getDistance(PBA.getPOBAN(node28), PBA.getPOBAN(node29))+"\n");
    //        bw.write(node28+" "+node30+" "+CD.getDistance(PBA.getPOBAN(node28), PBA.getPOBAN(node30))+"\n");
    //        bw.write(node28+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node28), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node28+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node28), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node28+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node28), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node28+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node28), PBA.getPOBAN(node34))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node28), PBA.getPOBAN(node35), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node28 + " " + node35 + " " + CD.getDistance(PBA.getPOBAN(node28), PBA.getPOBAN(node35)) + "\n");
                    }
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node29), PBA.getPOBAN(node30), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node29 + " " + node30 + " " + CD.getDistance(PBA.getPOBAN(node29), PBA.getPOBAN(node30)) + "\n");
                    }
    //        bw.write(node29+" "+node31+" "+CD.getDistance(PBA.getPOBAN(node29), PBA.getPOBAN(node31))+"\n");
    //        bw.write(node29+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node29), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node29+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node29), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node29+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node29), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node29+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node29), PBA.getPOBAN(node35))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node30), PBA.getPOBAN(node31), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node30 + " " + node31 + " " + CD.getDistance(PBA.getPOBAN(node30), PBA.getPOBAN(node31)) + "\n");
                    }
    //        bw.write(node30+" "+node32+" "+CD.getDistance(PBA.getPOBAN(node30), PBA.getPOBAN(node32))+"\n");
    //        bw.write(node30+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node30), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node30+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node30), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node30+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node30), PBA.getPOBAN(node35))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node31), PBA.getPOBAN(node32), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node31 + " " + node32 + " " + CD.getDistance(PBA.getPOBAN(node31), PBA.getPOBAN(node32)) + "\n");
                    }
    //        bw.write(node31+" "+node33+" "+CD.getDistance(PBA.getPOBAN(node31), PBA.getPOBAN(node33))+"\n");
    //        bw.write(node31+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node31), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node31+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node31), PBA.getPOBAN(node35))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node32), PBA.getPOBAN(node33), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node32 + " " + node33 + " " + CD.getDistance(PBA.getPOBAN(node32), PBA.getPOBAN(node33)) + "\n");
                    }
    //        bw.write(node32+" "+node34+" "+CD.getDistance(PBA.getPOBAN(node32), PBA.getPOBAN(node34))+"\n");
    //        bw.write(node32+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node32), PBA.getPOBAN(node35))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node33), PBA.getPOBAN(node34), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node33 + " " + node34 + " " + CD.getDistance(PBA.getPOBAN(node33), PBA.getPOBAN(node34)) + "\n");
                    }
    //        bw.write(node33+" "+node35+" "+CD.getDistance(PBA.getPOBAN(node33), PBA.getPOBAN(node35))+"\n");
                    if (ValidRoute.isValidRoute(PBA.getPOBAN(node34), PBA.getPOBAN(node35), compare) == false
                            && ValidRoute.isValidRoute(PBA.getPOBAN(node1), PBA.getPOBAN(node18), compare) != true) {
                        //if no intersections with asteroids, then go ahead and add this connection to the file.
                        bw.write(node34 + " " + node35 + " " + CD.getDistance(PBA.getPOBAN(node34), PBA.getPOBAN(node35)) + "\n");
                    }
                }
            }
        } catch (java.util.NoSuchElementException ex) {
        }
    }
}