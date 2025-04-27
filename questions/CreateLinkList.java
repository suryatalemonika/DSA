class Node {
    int val;
    Node next;

    Node(int val) { // constructor with same class name
        this.val = val;
        next = null;
    }
}

public class CreateLinkList {
    public static void main(String[] args) {
        int[] values = { 2, 3, 4, 5 };
        // create a instance for linked list
        Node head = new Node(values[0]);
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        Node printnode = head;
        while (printnode != null) {
            System.out.print(printnode.val + " -> ");
            printnode = printnode.next;
        }
        System.out.println("null");
    }
}