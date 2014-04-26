
/**
 * Write a description of class MyList here.
 *
 * @author Brendan
 * @version 1/31/11
 */
public class MyList {
    // instance variables - replace the example below with your own

    private ListNode head, tail;

    /**
     * Constructor for objects of class MyList
     */
    public MyList() {
        // initialise instance variables
        head = null;
        tail = null;
    }

    public void insertAtEnd(ListNode node) {
        if (tail == null) {
            head = node;
            tail = node;
            return;
        }
        // otherwise the list is non-empty:

        tail.setNext(node);
        node.setPrev(tail);
        tail = node;
    }

    public void delete(ListNode node) {
        if (contains(node)) {
            // node to delete is in the middle of the list:
            if (node != head && node != tail) {
                node.getPrev().setNext(node.getNext());
                node.getNext().setPrev(node.getPrev());
            }

            if (node == head) { 
                head = node.getNext();
                if (head != null) {
                    head.setPrev(null);
                }
            }
            if (node == tail) {
                tail = node.getPrev();
                if (tail != null) {
                    tail.setNext(null);
                }
            }


            node.setNext(null);
            node.setPrev(null);
        }
    }

    public void printList() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getString());
            currentNode = currentNode.getNext();
        }
    }

    public void recPrintList() {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.println(head.getString());
        MyList remainder = new MyList();
        remainder.insertAtEnd(head.getNext());
        remainder.recPrintList();
    }

    public ListNode find(String str) {
        ListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.getString().equals(str)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public boolean contains(ListNode node) {
        ListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode == node) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }
}
