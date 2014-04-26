
/**
 * Write a description of class ListNode here.
 *
 * @author Brendan
 * @version 1/31/11
 */
public class ListNode {
    // instance variables - replace the example below with your own

    private String str;
    private ListNode next, prev;

    /**
     * Constructor for objects of class ListNode
     */
    public ListNode(String str) {
        // initialise instance variables
        this.str = str;
        next = null;
        prev = null;
    }

    public String getString() {
        return str;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
