/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statscalcgui2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Brendan
 * @author Kaleb
 */
public class TestSorting {

    public static void printArray(double[] array) {
//        System.out.print("Array: ");
        statsCalcGUI2.sortedTxt.append("[");
        for (int i = 0; i < array.length; i++) {
            statsCalcGUI2.sortedTxt.append("  " + array[i]+"  |");
        }
        statsCalcGUI2.sortedTxt.append("  ]\n-------------------------------\n");
    }

    public static void exchange(double[] array, int i, int j) {
        // exchange values at positions i and j in array
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void selectionSort(double[] array) {
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

    public static boolean isSortedAscending(double[] array) {
        for (int i = 0; i <= array.length - 2; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(double[] array) {
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

    public static void insertionSort(double[] array) {
        for (int nextPos = 1; nextPos < array.length; nextPos++) {
            double nextVal = array[nextPos];
            int curPos = nextPos;
            while (curPos > 0 && array[curPos - 1] > nextVal) {
                array[curPos] = array[curPos - 1];
                curPos--;
            }
            array[curPos] = nextVal;
        }
    }

    public static void shellSort(double[] array) {
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
   
    private static void insert(double[] array,
            int nextPos,
            int gap) {
        double nextVal = array[nextPos]; // Element to insert.
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
    public static void run() {
            double[] cloneArray1 = new double[statsCalcGUI2.data.size()];
            double[] array1 = new double[statsCalcGUI2.data.size()];
            for(int i = 0; i < array1.length; i++){
                array1[i] = statsCalcGUI2.data.get(i);
            }
            cloneArray1 = array1.clone();
            printArray(cloneArray1);
            long startTime1 = System.nanoTime();
            selectionSort(cloneArray1);
            long elapsedTime1 = System.nanoTime() - startTime1;
            printArray(cloneArray1);
//            System.out.println("is sorted? " + isSortedAscending(cloneArray1));
            statsCalcGUI2.sortedData = cloneArray1.clone();
    }
}

