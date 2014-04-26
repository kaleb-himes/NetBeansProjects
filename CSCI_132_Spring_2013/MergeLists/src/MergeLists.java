
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Collections;

public class MergeLists {
    
    public static ArrayList<Integer> merge(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> merged = new ArrayList<>();
            Collections.sort(l1);
            Collections.sort(l2);
            merged.addAll(l1);
            merged.addAll(l2);
            Collections.sort(merged);
            for(int slot = 0; slot < merged.size(); slot++) {
         if(merged.get(slot).equals(merged.get(slot++))){
                merged.remove(merged.get(slot));
            }
         else if(merged.get(slot).equals(merged.get(slot--))){
             merged.remove(merged.get(slot));
         }
             
        }
/*
 * ************************************************************************
 * tried to get some of these methods to work for hours, used merged.get(int)
 * merged.remove(int) if said int is equal to another int, tried using a comparison with if merged.get(slot containingint).equals(merged.get(slot +1)) etc.
 * all of these compile fine and then just run forever without doing anything
 * I found Collections.sort and implemented that, works fine then after saw the 
 * not on the website that we're not supposed to use it, but I've been working on this since 10am and it's now 19:00 hours so i'm done. I give up. Not sure why
 * we can't use existing java classes if we're able to implement them properly but oh well.I got some methods to work and couldn't get others to. 
 */             
            
//            int i;
//            i = 0;
//            while(i != merged.size()){
//            if(merged.get(i) == merged.get(i+1)){
//            merged.remove(merged.get(i+1));
//            i++;
//            }
//        else if(merged.get(i).equals(merged.get(i+1))){
//                merged.remove(i+1);
//        }
//        else if(merged.get(i) > merged.get(i+1)){
//        merged.add(i+1, new Integer(merged.get(i)));
//          }
//            }
/*
 * ***************************************************************************
 */
        return merged;
    }

    public static ArrayList<Integer> makeRandomIncreasingList(int length) {
        
        ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < length; i++){
                int j;
                j = (int) (Math.random()*10);
            list.add(new Integer(j));
               }
        return list;     
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
