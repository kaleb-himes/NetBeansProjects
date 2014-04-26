package hashlab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author kaleb.himes
 */
public class HashLab {

    public static int size = 5;
    public static Objects[] Main = new Objects[size];
    private static int tracker = 0;
    private static boolean placed = false;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        for (int i = 0; i < size; i++) {
            Main[i] = new Objects(-99, "");
        }
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        BufferedReader br = new BufferedReader(new FileReader(s + "\\src\\hashlab\\testText.txt"));

        String fileLine = br.readLine();

        int key;

        try {
            //get the first line in the file, substring on space
            String word1 = fileLine.substring(0, fileLine.indexOf(" "));

            //we don't want the space
            int indexofblank = fileLine.indexOf(" ");

            //so substring on the next spot after the space
            String word2 = fileLine.substring(indexofblank + 1, fileLine.length());

            //trim both just in case
            word1.trim();
            word2.trim();

            //convert string number to an int
            key = Integer.valueOf(word1);

            //place first line into Main array
            System.out.print("attempting to place: ");
            System.out.print(key + " ");
            System.out.print(word2 + "\n");
            Main = place(key, word2).clone();

            //populate the array with keyValues
        } catch (java.lang.NullPointerException ex) {
        }
        //counter to count the number of lines in the file
        //int counter = 1;

        //there's a new line
        while (fileLine != null) {

            //System.out.println(fileLine);
            fileLine = br.readLine();
            //counter++;
            try {
                String word1 = fileLine.substring(0, fileLine.indexOf(" "));

                int indexofblank = fileLine.indexOf(" ");

                String word2 = fileLine.substring(indexofblank + 1, fileLine.length());

                word1.trim();
                word2.trim();

                key = Integer.valueOf(word1);
                System.out.print("Attempting to place: ");
                System.out.print(key + " ");
                System.out.print(word2 + "\n");
                Main = place(key, word2).clone();

            } catch (java.lang.NullPointerException ex) {
            }

            for (int i = 0; i < Main.length; i++) {
                if (i < (Main.length - 1)) {
                    if (Main[i].getInt() != -99) {
                        System.out.print("[" + Main[i].getInt() + "," + Main[i].getData() + "],");
                    } else {
                        System.out.print("[  ,  ],");
                    }
                } else {
                    if (Main[i].getInt() != -99) {
                    System.out.print("[" + Main[i].getInt() + "," + Main[i].getData() + "]\n\n");
                    }else{
                        System.out.print("[  ,  ]\n\n");
                    }
                }
            }

        }
        User.Run();
        //System.out.println("There are " + counter + " lines in the file");
    }

    public static Objects[] place(int placingInt, String placingWord) {
        tracker++;
        placed = false;
        Objects[] newA;
        int insertP = (placingInt % size);
        System.out.println("attempting to place at position " +insertP+" in the hash");
        while (tracker < (.8 * size) && placed != true) {
            //num mod arraylength empty: place
            if (insertP < Main.length && Main[insertP].getInt() == -99) {
                Main[insertP].setInt(placingInt);
                Main[insertP].setData(placingWord);
                placed = true;
                System.out.println("value was placed: " + placed);
            } //num mod arraylength + 1 empty: place
            else if (insertP + 1 < Main.length && Main[insertP + 1].getInt() == -99) {
                System.out.println("Spot was occupied, moving to next open spot");
                Main[insertP + 1].setInt(placingInt);
                Main[insertP + 1].setData(placingWord);
                placed = true;
                System.out.println("value was placed: " + placed);
                //i = 0 (loop back to the beginning)    
            } else if (insertP < (Main.length - 1)) {
                insertP++;
            } else {
                System.out.println("HIT THE END, LOOPED BACK!!");
                insertP = 0;
            }
        }
        placed = false;

        if (tracker >= (.8 * size)) {
            System.out.println("\nWOOPS 80% FULL DOUBLING THE ARRAY!!!!!\n");
            size = size * 2;
            newA = new Objects[size];
            //set all the new array empty    
            for (int i = 0; i < newA.length; i++) {
                newA[i] = new Objects(-99, "");
            }
            //go through the old array and re-hash to new array
            for (int i = 0; i < Main.length; i++) {
                placed = false;
                int x = Main[i].getInt();
                String y = Main[i].getData();
                int insert = (x % (size));
                while (placed == false && insert >= 0) {
                    //num mod arraylength empty: place
                    if (insert < newA.length && newA[insert].getInt() == -99) {
                        newA[insert].setInt(x);
                        newA[insert].setData(y);
                        placed = true;
                    } //num mod arraylength + 1 empty: place
                    else if (insert + 1 < newA.length && newA[insert + 1].getInt() == -99) {
                        System.out.println("A Spot was occupied while re-hashing, shifting to next open spot");
                        newA[insert + 1].setInt(x);
                        newA[insert + 1].setData(y);
                        placed = true;
                    } else if (insert < (newA.length - 1)) {
                        insert++;
                    } else {
                        System.out.println("HIT THE END, LOOPING BACK!!!");
                        insert = 0;
                    }
                }
            }
            Main = newA.clone();
            System.out.print("This is Main after the clone\n");
//            for (int i = 0; i < Main.length; i++) {
//                if (i < Main.length - 1) {
//                    System.out.print("[" + Main[i].getInt() + "," + Main[i].getData() + "],");
//                } else {
//                    System.out.print("[" + Main[i].getInt() + "," + Main[i].getData() + "]\n");
//                }
//            }
        }
        return Main;
    }
}
