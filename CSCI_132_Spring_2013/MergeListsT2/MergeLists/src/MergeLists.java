
import java.util.ArrayList;

public class MergeLists {

    public static ArrayList<Integer> merge(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        // you need to write this
    }

    public static ArrayList<Integer> makeRandomIncreasingList(int length) {
        // you need to write this
    }

    public static void doMergeTest() {
        ArrayList<Integer> list1 = makeRandomIncreasingList(10);
        ArrayList<Integer> list2 = makeRandomIncreasingList(20);
        ArrayList<Integer> mergedList = merge(list1, list2);
        System.out.println("List 1:" + list1);
        System.out.println("List 2:" + list2);
        System.out.println("Merged list:" + mergedList);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Performing merge test #" + (i + 1) + ":");
            doMergeTest();
        }
    }
}
