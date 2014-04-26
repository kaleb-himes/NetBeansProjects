/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsorting;

import java.util.Random;
import java.util.Arrays;

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

    public static void mergeSort(int[] array) {
        //System.out.println("before: " + Arrays.toString(array));
        if (array.length > 1) {
            int leftSize = array.length / 2;
            int rightSize = array.length - leftSize;
            int[] leftSide = new int[leftSize];
            int[] rightSide = new int[rightSize];
            for (int i = 0; i < leftSize; i++) {
                leftSide[i] = array[i];
            }
            for (int i = leftSize; i < array.length; i++) {
                rightSide[i - leftSize] = array[i];
            }
            mergeSort(leftSide);
            mergeSort(rightSide);
            merge(leftSide, rightSide, array);
        }
        //System.out.println("after : " + Arrays.toString(array));
    }

    private static void merge(int[] left, int[] right, int[] merge) {
        int leftPos = 0;
        int rightPos = 0;
        int mergePos = 0;
        while (leftPos < left.length || rightPos < right.length) {
            if (leftPos < left.length && rightPos < right.length) {
                if (left[leftPos] <= right[rightPos]) {
                    merge[mergePos++] = left[leftPos++];
                } else {
                    merge[mergePos++] = right[rightPos++];
                }
            } else {
                if (leftPos == left.length) {
                    merge[mergePos++] = right[rightPos++];
                } else {
                    merge[mergePos++] = left[leftPos++];
                }
            }
        }
    }

    private static int partition(int[] A, int low, int high) { 
        // modified slightly from what we discussed in class:
        int pivot = A[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (A[j] <= pivot) {
                i = i + 1;
                exchange(A, i, j);
            }
        }
        exchange(A, i+1, high);
        return i+1;
    }

    private static void qS(int[] array, int low, int high) {
        // sort array[low..high]
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            qS(array, low, pivotIndex - 1);
            qS(array, pivotIndex + 1, high);
        }
    }

    public static void quickSort(int[] array) {
        qS(array, 0, array.length - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int size = 20;
        int[] A = new int[size];
        Random r = new Random();

        for (int i = 0; i < size; i++) {
            A[i] = r.nextInt(10 * size);
        }

        printArray(A);
        
        //selectionSort(A);
        //bubbleSort(A);
        //Arrays.sort(A);
        //shellSort(A);
        //mergeSort(A);
        quickSort(A);
        
        printArray(A);
        
        System.out.println("is sorted? " + isSortedAscending(A));
    }
}
