
/**
 * Write a description of class TestMyList here.
 *
 * @author Brendan
 * @version 1/31/11
 */
import java.util.Scanner;
import java.util.ArrayList;

public class TestMyList {

    public static void doFind(MyList myList, String string) {
        ListNode node = myList.find(string);
        if (node != null) {
            System.out.println("found!");
            System.out.println(node.getString());
        } else {
            System.out.println("not found!");
        }
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        ListNode one = new ListNode("one");
        ListNode two = new ListNode("two");
        ListNode three = new ListNode("three");
        myList.insertAtEnd(one);
        myList.insertAtEnd(two);
        myList.insertAtEnd(three);
        System.out.println("printing list using iterative approach...");
        myList.printList();

        System.out.println("..deleting node three");
        myList.delete(three);
        myList.printList();
        System.out.println("..deleting node one");
        myList.delete(one);
        myList.printList();
        System.out.println("..deleting node two");
        myList.delete(two);
        myList.printList();

//        doFind(myList, "three");
//        doFind(myList, "four");
//        System.out.println("printing list using recursive approach...");
//        myList.recPrintList();


    }
}
