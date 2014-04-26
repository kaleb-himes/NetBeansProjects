/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Brendan
 */
import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    private static int bSearchRecursive(int[] array, int query, int low, int high) {
        if (low >= high) {
            if (array[low] == query) {
                return low;
            } else {
                return -1;  // not found
            }
        }
        int mid = (low + high) / 2;
        if (array[mid] == query) {
            return mid;
        } else if (array[mid] > query) {
            // search in first half
            return bSearchRecursive(array, query, low, mid - 1);
        } else { // array[mid] < query:
            return bSearchRecursive(array, query, mid + 1, high);
        }
    }

    public static int binarySearchRecursive(int[] array, int query) {
        return bSearchRecursive(array, query, 0, array.length - 1);
    }

    private static int bSearchNonRec(int[] array, int query) {

        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (array[mid] == query) {
                return mid;
            } else if (array[mid] > query) {
                // search in first half
                high = mid - 1;
            } else { // array[mid] < query:
                low = mid + 1;
            }
        }
        if (array[low] == query) {
            return low;
        } else {
            return -1;  // not found
        }

    }

    private static int simpleSearch(int[] array, int query) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rand = new Random();

        for (int n = 10000; n <= 1000000; n += 10000) {
            System.out.print(n);
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(2 * n);
            }
            // sort the array..
            Arrays.sort(array);
            int numLookFor = 10000;

            int[] lookFor = new int[numLookFor];
            for (int i = 0; i < numLookFor; i++) {
                lookFor[i] = rand.nextInt(2 * n);
            }

            long start = System.currentTimeMillis();
            
                        for (int i = 0; i < 10; i++) {
                simpleSearch(array, lookFor[i]);
            }
            long end = System.currentTimeMillis();
            System.out.print("\t" + (double) (end - start) / 10.0);

            start = System.currentTimeMillis();
            for (int i = 0; i < numLookFor; i++) {
                binarySearchRecursive(array, lookFor[i]);
            }
            end = System.currentTimeMillis();
            System.out.print("\t" + ((double) (end - start)) / (double) numLookFor);

            start = System.currentTimeMillis();
            for (int i = 0; i < numLookFor; i++) {
                bSearchNonRec(array, lookFor[i]);
            }
            end = System.currentTimeMillis();
            System.out.println("\t" + ((double) (end - start)) / (double) numLookFor);

        }
    }
}
