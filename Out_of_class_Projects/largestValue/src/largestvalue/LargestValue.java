package largestvalue;
import java.text.DecimalFormat;
/**
 *
 * @author Kaleb
 */
public class LargestValue {
  
    private static double[] a1 = new double[10000];
    public static void main(String[] args) {
        double n = 0;
        for(int i = 0; i < a1.length; i++){
            a1[i] =  n++;
        }
        double key = (int)(Math.random()*10000);
        System.out.println("\nthe key is:" + key);
        binarySearch(a1, key, 0, a1.length - 1);
    }
    public static double findMax(double[] array){
        double max = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.print("\nMax in the array is:" + new DecimalFormat("##.##").format(max) + "\n");
        return max;
    }
    public static void binarySearch(double[] array, double key, int head, int tail){
        int median = findMedian(head, tail);
        System.out.print("\nmedian = " + median);
        //value is in the lower half
        if(array[median] == key){
            System.out.println("\nThe key was found at location: " + median);
        }
        else if(array[median] > key){
            //key is not in the middle then search lower half
            binarySearch(array, key, head, median);
        }
        else if(array[median] < key){
            binarySearch(array, key, median, tail);
        }
    }
    
    public static int findMedian(int min, int max){
        int mid = (max + min) / 2; 
            return mid;
    }
}
