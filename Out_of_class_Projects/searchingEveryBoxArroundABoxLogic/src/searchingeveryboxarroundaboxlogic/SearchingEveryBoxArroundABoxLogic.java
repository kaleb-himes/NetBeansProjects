/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingeveryboxarroundaboxlogic;

/**
 *
 * @author Kaleb
 */
public class SearchingEveryBoxArroundABoxLogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < shortestArray.size()*shortestArray.size(); i++){
        if(one!=-5 && two!= -5 && three!= -5 && four != -5){
        //conditions if one is smallest
        if (one > 0 && two > 0 && three > 0 && four > 0 && one < two && one < three && one < four) {
            smallestNumT = one;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two > 0 && three > 0 && four < 0 && one < two && one < three) {
            smallestNumT = one;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two > 0 && three < 0 && four > 0 && one < two && one < four) {
            smallestNumT = one;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two < 0 && three > 0 && four > 0 && one < three && one < four) {
            smallestNumT = one;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two < 0 && three < 0 && four > 0 && one < four) {
            smallestNumT = one;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two < 0 && three > 0 && four < 0 && one < three) {
            smallestNumT = one;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two > 0 && three < 0 && four < 0 && one < two) {
            smallestNumT = one;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two < 0 && three < 0 && four < 0) {
            smallestNumT = one;
            System.out.print(spot + "\n");
            spot--;

        } //conditions if two is smallest
        else if (one > 0 && two > 0 && three > 0 && four > 0 && two < one && two < three && two < four) {
            smallestNumT = two;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two > 0 && three > 0 && four < 0 && two < one && two < three) {
            smallestNumT = two;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two > 0 && three < 0 && four > 0 && two < one && two < four) {
            smallestNumT = two;
            System.out.print(spot + "\n");
            spot--;

        } else if (one < 0 && two > 0 && three > 0 && four > 0 && two < three && two < four) {
            smallestNumT = two;
            System.out.print(spot + "\n");
            spot--;

        } else if (one < 0 && two > 0 && three < 0 && four > 0 && two < four) {
            smallestNumT = two;
            System.out.print(spot + "\n");
            spot--;

        } else if (one < 0 && two > 0 && three > 0 && four < 0 && two < three) {
            smallestNumT = two;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two > 0 && three < 0 && four < 0 && two < one) {
            smallestNumT = two;
            System.out.print(spot + "\n");
            spot--;

        } else if (one < 0 && two > 0 && three < 0 && four < 0) {
            smallestNumT = two;
            System.out.print(spot + "\n");
            spot--;

        } //conditions if three is smallest
        else if (one > 0 && two > 0 && three > 0 && four > 0 && three < one && three < two && three < four) {
            smallestNumT = three;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two > 0 && three > 0 && four < 0 && three < one && three < two) {
            smallestNumT = three;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two < 0 && three > 0 && four > 0 && three < one && three < four) {
            smallestNumT = three;
            System.out.print(spot + "\n");
            spot--;

        } else if (one < 0 && two > 0 && three > 0 && four > 0 && three < two && three < four) {
            smallestNumT = three;
            System.out.print(spot + "\n");
            spot--;

        } else if (one < 0 && two < 0 && three > 0 && four > 0 && three < four) {
            smallestNumT = three;
            System.out.print(spot + "\n");
            spot--;

        } else if (one < 0 && two > 0 && three > 0 && four < 0 && three < two) {
            smallestNumT = three;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two < 0 && three > 0 && four < 0 && three < one) {
            smallestNumT = three;
            System.out.print(spot + "\n");
            spot--;

        } else if (one < 0 && two < 0 && three > 0 && four < 0) {
            smallestNumT = three;
            System.out.print(spot + "\n");
            spot--;

        } //conditions if four is the smallest
        else if (one > 0 && two > 0 && three > 0 && four > 0 && four < one && four < two && four < three) {
            smallestNumT = four;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two > 0 && three < 0 && four > 0 && four < one && four < two) {
            smallestNumT = four;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two < 0 && three > 0 && four > 0 && four < one && four < three) {
            smallestNumT = four;
            System.out.print(spot + "\n");
            spot--;

        } else if (one < 0 && two > 0 && three > 0 && four > 0 && four < two && four < three) {
            smallestNumT = four;
            System.out.print(spot + "\n");
            spot--;

        } else if (one < 0 && two < 0 && three > 0 && four > 0 && four < three) {
            smallestNumT = four;
            System.out.print(spot + "\n");
            spot--;

        } else if (one < 0 && two > 0 && three < 0 && four > 0 && four < two) {
            smallestNumT = four;
            System.out.print(spot + "\n");
            spot--;

        } else if (one > 0 && two < 0 && three < 0 && four > 0 && four < one) {
            smallestNumT = four;
            System.out.print(spot + "\n");
            spot--;

        } else if (one < 0 && two < 0 && three < 0 && four > 0) {
            smallestNumT = four;
            System.out.print(spot + "\n");
            spot--;

        }
        System.out.print(spot + "\n");
        }
        else if(one==-5 || two==-5 || three==-5 || four==-5){
            atStart = true;
            startFound();
        }
        }
    }
    /**
     *
     * @param spot
     */
//    public static int smallestAdjacentNum() {
//        int T = smallestNumT;
//        for (int i = 0; i < shortestArray.size(); i++) {
//            for (int j = 0; j < shortestArray.size(); j++) {
//                
//                if (shortestArray.get(i).get(j) == A) {
//                    one = shortestArray.get(i).get(j + 1);
//
//                    two = shortestArray.get(i - 1).get(j);
//
//                    three = shortestArray.get(i + 1).get(j);
//
//                    four = shortestArray.get(i).get(j - 1);
//
//                } 
//            }
//        }
//
//        //conditions if one is smallest
//        if (one > 0 && two > 0 && three > 0 && four > 0 && one < two && one < three && one < four) {
//            smallestNumGeneral = one;
//        } else if (one > 0 && two > 0 && three > 0 && four < 0 && one < two && one < three) {
//            smallestNumGeneral = one;
//        } else if (one > 0 && two > 0 && three < 0 && four > 0 && one < two && one < four) {
//            smallestNumGeneral = one;
//        } else if (one > 0 && two < 0 && three > 0 && four > 0 && one < three && one < four) {
//            smallestNumGeneral = one;
//        } else if (one > 0 && two < 0 && three < 0 && four > 0 && one < four) {
//            smallestNumGeneral = one;
//        } else if (one > 0 && two < 0 && three > 0 && four < 0 && one < three) {
//            smallestNumGeneral = one;
//        } else if (one > 0 && two > 0 && three < 0 && four < 0 && one < two) {
//            smallestNumGeneral = one;
//        } else if (one > 0 && two < 0 && three < 0 && four < 0) {
//            smallestNumGeneral = one;
//        } //conditions if two is smallest
//        else if (one > 0 && two > 0 && three > 0 && four > 0 && two < one && two < three && two < four) {
//            smallestNumGeneral = two;
//        } else if (one > 0 && two > 0 && three > 0 && four < 0 && two < one && two < three) {
//            smallestNumGeneral = two;
//        } else if (one > 0 && two > 0 && three < 0 && four > 0 && two < one && two < four) {
//            smallestNumGeneral = two;
//        } else if (one < 0 && two > 0 && three > 0 && four > 0 && two < three && two < four) {
//            smallestNumGeneral = two;
//        } else if (one < 0 && two > 0 && three < 0 && four > 0 && two < four) {
//            smallestNumGeneral = two;
//        } else if (one < 0 && two > 0 && three > 0 && four < 0 && two < three) {
//            smallestNumGeneral = two;
//        } else if (one > 0 && two > 0 && three < 0 && four < 0 && two < one) {
//            smallestNumGeneral = two;
//        } else if (one < 0 && two > 0 && three < 0 && four < 0) {
//            smallestNumGeneral = two;
//        } //conditions if three is smallest
//        else if (one > 0 && two > 0 && three > 0 && four > 0 && three < one && three < two && three < four) {
//            smallestNumGeneral = three;
//        } else if (one > 0 && two > 0 && three > 0 && four < 0 && three < one && three < two) {
//            smallestNumGeneral = three;
//        } else if (one > 0 && two < 0 && three > 0 && four > 0 && three < one && three < four) {
//            smallestNumGeneral = three;
//        } else if (one < 0 && two > 0 && three > 0 && four > 0 && three < two && three < four) {
//            smallestNumGeneral = three;
//        } else if (one < 0 && two < 0 && three > 0 && four > 0 && three < four) {
//            smallestNumGeneral = three;
//        } else if (one < 0 && two > 0 && three > 0 && four < 0 && three < two) {
//            smallestNumGeneral = three;
//        } else if (one > 0 && two < 0 && three > 0 && four < 0 && three < one) {
//            smallestNumGeneral = three;
//        } else if (one < 0 && two < 0 && three > 0 && four < 0) {
//            smallestNumGeneral = three;
//        } //conditions if four is the smallest
//        else if (one > 0 && two > 0 && three > 0 && four > 0 && four < one && four < two && four < three) {
//            smallestNumGeneral = four;
//        } else if (one > 0 && two > 0 && three < 0 && four > 0 && four < one && four < two) {
//            smallestNumGeneral = four;
//        } else if (one > 0 && two < 0 && three > 0 && four > 0 && four < one && four < three) {
//            smallestNumGeneral = four;
//        } else if (one < 0 && two > 0 && three > 0 && four > 0 && four < two && four < three) {
//            smallestNumGeneral = four;
//        } else if (one < 0 && two < 0 && three > 0 && four > 0 && four < three) {
//            smallestNumGeneral = four;
//        } else if (one < 0 && two > 0 && three < 0 && four > 0 && four < two) {
//            smallestNumGeneral = four;
//        } else if (one > 0 && two < 0 && three < 0 && four > 0 && four < one) {
//            smallestNumGeneral = four;
//        } else if (one < 0 && two < 0 && three < 0 && four > 0) {
//            smallestNumGeneral = four;
//        }
//
//        System.out.print(smallestNumGeneral
//                + "\n");
//        return smallestNumGeneral;
//    }
// TODO code application logic here
    }
}
