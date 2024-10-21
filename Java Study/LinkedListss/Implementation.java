package LinkedListss;

/*
 * Fist we have to create the class Node
 */

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class Linked {
    public static Node head;
    public static Node tail;
    int size = 0;

    public void insertFist(int data) {
        // 2->1
        Node newNode = new Node(data);
        // base case
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;

        }
        size++;
    }

    public void insetAdEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int deleteAtfirst() {
        int val = 0;
        Node temp = head;
        // base case
        if (temp == null) {
            System.out.println("the list is empty");
            return 0;
        }
        // if one element is present
        else if (temp.next == null) {
            val = head.data;
            head = null;
            temp = null;

        } else {

            val = head.data;
            head = temp.next;
            temp.next = null;
        }
        size--;
        return val;
    }

    // 1->2->3->4->null
    public int deleteAtEnd() {
        int val = 0;

        if (head == null) {
            return 0;
        } else if (head == tail) {
            val = head.data;
            head = null;
        } else {
            Node prev = head;
            val = tail.data;
            while (prev.next != tail) {
                prev = prev.next;
            }
            prev.next = null;
            tail = prev;
        }
        size--;
        return val;
    }

    public void printLinkedlist() {
        Node temp = head;
        if (temp == null) {
            System.out.println("the list is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;

            }
            System.out.println();

        }
    }

    public void lengths() {
        System.out.println("the size " + size);
    }

}

public class Implementation {
    public static void main(String[] args) {
        Linked l1 = new Linked();
        l1.insertFist(12);
        l1.insertFist(15);
        l1.insertFist(20);
        l1.insetAdEnd(66);
        System.out.println("the delete data is " + l1.deleteAtfirst());
        System.out.println("the delete data at end is"+l1.deleteAtEnd());
        l1.printLinkedlist();
        l1.lengths();

    }
}
