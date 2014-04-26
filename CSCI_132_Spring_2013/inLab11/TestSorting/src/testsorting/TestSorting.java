/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsorting;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Brendan
 */
public class TestSorting {

    public static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    public static void exchange(int[] array, int i, int j) {
        // exchange values at positions i and j in array
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void selectionSort(int[] array) {
        for (int fill = 0; fill <= array.length - 2; fill++) {
            int minPos = fill;
            for (int j = fill + 1; j < array.length; j++) {
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }
            exchange(array, fill, minPos);
        }
    }

    public static boolean isSortedAscending(int[] array) {
        for (int i = 0; i <= array.length - 2; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(int[] array) {
        for (int last = array.length - 1; last > 0; last--) {
            boolean madeExchange = false;
            for (int i = 0; i < last; i++) {
                if (array[i + 1] < array[i]) {
                    exchange(array, i, i + 1);
                    madeExchange = true;
                    //printArray(array);
                }
            }
            if (!madeExchange) {
                return;
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int nextPos = 1; nextPos < array.length; nextPos++) {
            int nextVal = array[nextPos];
            int curPos = nextPos;
            while (curPos > 0 && array[curPos - 1] > nextVal) {
                array[curPos] = array[curPos - 1];
                curPos--;
            }
            array[curPos] = nextVal;
        }
    }

    public static void shellSort(int[] array) {
        // Gap between adjacent elements.
        int gap = array.length / 2;
        while (gap > 0) {
            for (int nextPos = gap; nextPos < array.length;
                    nextPos++) {
                // Insert element at nextPos in its subarray.
                insert(array, nextPos, gap);
            } // End for.

            // Reset gap for next pass.
            if (gap == 2) {
                gap = 1;
            } else {
                gap = (int) (gap / 2.2);
            }
        } // End while.
    } // End sort.

    private static void insert(int[] array,
            int nextPos,
            int gap) {
        int nextVal = array[nextPos]; // Element to insert.
        // Shift all values > nextVal in subarray down by gap.
        while ((nextPos > gap - 1) // First element not shifted.
                && (array[nextPos - gap] > nextVal)) {
            array[nextPos] = array[nextPos - gap]; // Shift down.
            nextPos -= gap; // Check next position in subarray.
        }
        array[nextPos] = nextVal; // Insert nextVal.
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int size1 = 100;
        int size2 = 1000;
        int size3 = 10000;
        int size4 = 100000;
//        int size5 = 1000000;
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        int[] array3 = new int[size3];
        int[] array4 = new int[size4];
//        int[] array5 = new int[size5];


        int size = 25;
        int[] A = new int[size];
        Random r = new Random();

        for (int i = 0; i < size; i++) {
            A[i] = r.nextInt(10 * size);
        }
        //ARRAY SIZE 100
        for (int i = 0; i < size1; i++) {
            array1[i] = r.nextInt(10 * size1);
        }
        int[] cloneArray1 = array1.clone();

        //ARRAY SIZE 1000
        for (int i = 0; i < size2; i++) {
            array2[i] = r.nextInt(10 * size2);
        }
        int[] cloneArray2 = array2.clone();

        //ARRAY SIZE 10000
        for (int i = 0; i < size3; i++) {
            array3[i] = r.nextInt(10 * size3);
        }
        int[] cloneArray3 = array3.clone();
        //ARRAY SIZE 100000
        for (int i = 0; i < size4; i++) {
            array4[i] = r.nextInt(10 * size4);
        }
        int[] cloneArray4 = array4.clone();
        //ARRAY SIZE 1000000
//        for (int i = 0; i < size5; i++) {
//            array5[i] = r.nextInt(10 * size5);
//        }
//        int[] cloneArray5 = array5.clone();
        //ARRAY SIZE 100
        printArray(cloneArray1);
        long startTime1 = System.nanoTime();
        selectionSort(cloneArray1);
        long elapsedTime1 = System.nanoTime() - startTime1;
        printArray(cloneArray1);
        System.out.println("is sorted? " + isSortedAscending(cloneArray1));

        cloneArray1 = array1.clone();
        printArray(cloneArray1);
        long startTime2 = System.nanoTime();
        bubbleSort(cloneArray1);
        long elapsedTime2 = System.nanoTime() - startTime2;
        printArray(cloneArray1);
        System.out.println("is sorted? " + isSortedAscending(cloneArray1));

        cloneArray1 = array1.clone();
        printArray(cloneArray1);
        long startTime3 = System.nanoTime();
        Arrays.sort(cloneArray1);
        long elapsedTime3 = System.nanoTime() - startTime3;
        printArray(cloneArray1);
        System.out.println("is sorted? " + isSortedAscending(cloneArray1));

        cloneArray1 = array1.clone();
        printArray(cloneArray1);
        long startTime4 = System.nanoTime();
        shellSort(cloneArray1);
        long elapsedTime4 = System.nanoTime() - startTime4;
        printArray(cloneArray1);
        System.out.println("is sorted? " + isSortedAscending(cloneArray1));


        //ARRAY SIZE 1000
        printArray(cloneArray2);
        long startTime5 = System.nanoTime();
        selectionSort(cloneArray2);
        long elapsedTime5 = System.nanoTime() - startTime5;
        printArray(cloneArray2);
        System.out.println("is sorted? " + isSortedAscending(cloneArray2));

        cloneArray2 = array2.clone();
        printArray(cloneArray2);
        long startTime6 = System.nanoTime();
        bubbleSort(cloneArray2);
        long elapsedTime6 = System.nanoTime() - startTime6;
        printArray(cloneArray2);
        System.out.println("is sorted? " + isSortedAscending(cloneArray2));

        cloneArray2 = array2.clone();
        printArray(cloneArray2);
        long startTime7 = System.nanoTime();
        Arrays.sort(cloneArray2);
        long elapsedTime7 = System.nanoTime() - startTime7;
        printArray(cloneArray2);
        System.out.println("is sorted? " + isSortedAscending(cloneArray2));

        cloneArray2 = array2.clone();
        printArray(cloneArray2);
        long startTime8 = System.nanoTime();
        shellSort(cloneArray2);
        long elapsedTime8 = System.nanoTime() - startTime8;
        printArray(cloneArray2);
        System.out.println("is sorted? " + isSortedAscending(cloneArray2));


//        //ARRAY SIZE 10000
        printArray(cloneArray3);
        long startTime9 = System.nanoTime();
        selectionSort(cloneArray3);
        long elapsedTime9 = System.nanoTime() - startTime9;
        printArray(cloneArray3);
        System.out.println("is sorted? " + isSortedAscending(cloneArray3));

        cloneArray3 = array3.clone();
        printArray(cloneArray3);
        long startTime10 = System.nanoTime();
        bubbleSort(cloneArray3);
        long elapsedTime10 = System.nanoTime() - startTime10;
        printArray(cloneArray3);
        System.out.println("is sorted? " + isSortedAscending(cloneArray3));

        cloneArray3 = array3.clone();
        printArray(cloneArray3);
        long startTime11 = System.nanoTime();
        Arrays.sort(cloneArray3);
        long elapsedTime11 = System.nanoTime() - startTime11;
        printArray(cloneArray3);
        System.out.println("is sorted? " + isSortedAscending(cloneArray3));

        cloneArray3 = array3.clone();
        printArray(cloneArray3);
        long startTime12 = System.nanoTime();
        shellSort(cloneArray3);
        long elapsedTime12 = System.nanoTime() - startTime12;
        printArray(cloneArray3);
        System.out.println("is sorted? " + isSortedAscending(cloneArray3));


        //ARRAY SIZE 100000
        printArray(cloneArray4);
        long startTime13 = System.nanoTime();
        selectionSort(cloneArray4);
        long elapsedTime13 = System.nanoTime() - startTime13;
        printArray(cloneArray4);
        System.out.println("is sorted? " + isSortedAscending(cloneArray4));

        cloneArray4 = array4.clone();
        printArray(cloneArray4);
        long startTime14 = System.nanoTime();
        bubbleSort(cloneArray4);
        long elapsedTime14 = System.nanoTime() - startTime14;
        printArray(cloneArray4);
        System.out.println("is sorted? " + isSortedAscending(cloneArray4));

        cloneArray4 = array4.clone();
        printArray(cloneArray4);
        long startTime15 = System.nanoTime();
        Arrays.sort(cloneArray4);
        long elapsedTime15 = System.nanoTime() - startTime15;
        printArray(cloneArray4);
        System.out.println("is sorted? " + isSortedAscending(cloneArray4));

        cloneArray4 = array4.clone();
        printArray(cloneArray4);
        long startTime16 = System.nanoTime();
        shellSort(cloneArray4);
        long elapsedTime16 = System.nanoTime() - startTime16;
        printArray(cloneArray4);
        System.out.println("is sorted? " + isSortedAscending(cloneArray4));




        System.out.println("selectionSort size 100: "
                + elapsedTime1 + "\n");
        System.out.println("bubbleSort size 100: "
                + elapsedTime2 + "\n");
        System.out.println("Arrays.sort size 100: "
                + elapsedTime3 + "\n");
        System.out.println("shellSort size 100: "
                + elapsedTime4 + "\n");
        System.out.println("selectionSort size 1000: "
                + elapsedTime5 + "\n");
        System.out.println("bubbleSort size 1000: "
                + elapsedTime6 + "\n");
        System.out.println("Arrays.sort size 1000: "
                + elapsedTime7 + "\n");
        System.out.println("shellSort size 1000: "
                + elapsedTime8 + "\n");
        System.out.println("selectionSort size 10000: "
                + elapsedTime9 + "\n");
        System.out.println("bubbleSort size 10000: "
                + elapsedTime10 + "\n");
        System.out.println("Arrays.sort size 10000: "
                + elapsedTime11 + "\n");
        System.out.println("shellSort size 10000: "
                + elapsedTime12 + "\n");
        System.out.println("selectionSort size 100000: "
                + elapsedTime13 + "\n");
        System.out.println("bubbleSort size 100000: "
                + elapsedTime14 + "\n");
        System.out.println("Arrays.sort size 100000: "
                + elapsedTime15 + "\n");
        System.out.println("shellSort size 100000: "
                + elapsedTime16 + "\n");
//        //ARRAY SIZE 1000000
//             printArray(cloneArray5);
//            long startTime17 = System.nanoTime();
//            selectionSort(cloneArray5);
//            long elapsedTime17 = System.nanoTime() - startTime17;
//            printArray(cloneArray5);
//            System.out.println("is sorted? " + isSortedAscending(cloneArray5));
//            System.out.println("selectionSort size 1000000: "
//                + elapsedTime17+"\n");
//            cloneArray5 = array5.clone();
//            printArray(cloneArray5);
//            long startTime18 = System.nanoTime();
//            bubbleSort(cloneArray5);
//            long elapsedTime18 = System.nanoTime() - startTime18;
//            printArray(cloneArray5);
//            System.out.println("is sorted? " + isSortedAscending(cloneArray5));
//            System.out.println("bubbleSort size 1000000: "
//                + elapsedTime18+"\n");
//            cloneArray5 = array5.clone();
//            printArray(cloneArray5);
//            long startTime19 = System.nanoTime();
//            Arrays.sort(cloneArray5);
//            long elapsedTime19 = System.nanoTime() - startTime19;
//            printArray(cloneArray5);
//            System.out.println("is sorted? " + isSortedAscending(cloneArray5));
//            System.out.println("Arrays.sort size 1000000: "
//                + elapsedTime19+"\n");
//            cloneArray5 = array5.clone();
//            printArray(cloneArray5);
//            long startTime20 = System.nanoTime();
//            shellSort(cloneArray5);
//            long elapsedTime20 = System.nanoTime() - startTime20;
//            printArray(cloneArray5);
//            System.out.println("is sorted? " + isSortedAscending(cloneArray5));
//            System.out.println("shellSort size 1000000: "
//                + elapsedTime20+"\n");
    }
}
