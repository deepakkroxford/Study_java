package LinkedListss;
import java.util.*;
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

    }

    // insert at any position
    void insertAtpos(int ind, int value) {

        Node newNode = new Node(value);
        if (ind > size() || ind < 0) {
            System.out.println("Invalid position");
            return;
        } else if (ind == 0) {
            insertFist(value);
        } else if (ind == size()) {
            insetAdEnd(value);
        } else {
            Node temp = head;
            for (int i = 0; i < ind - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // delete at any position

    int deleteAtPos(int ind) {
        int val = 0;
        if (ind > size() || ind < 0) {
            System.out.println("Invalid position");
            return -1;
        } else if (ind == 0) {
            val = deleteAtfirst();
        } else if (ind == size()) {
            val = deleteAtEnd();
        } else {
            Node temp = head;
            for (int i = 0; i < ind - 1; i++) {
                temp = temp.next;
            }
            val = temp.next.data;
            temp.next = temp.next.next;

        }
        return val;
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

    int getElementAtpos(int idx) {
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

}

public class Implementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Linked ll = new Linked();

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1: Insert at beginning");
            System.out.println("2: Insert at end");
            System.out.println("3: InsertAtPos");
            System.out.println("4: Delete from beginning");
            System.out.println("5: Delete from end");
            System.out.println("6: Display list");
            System.out.println("7: Size of list");
            System.out.println("8: Delete from any postion");
            System.out.println("9: getElemnt");
            System.out.println("10: Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value to insert at beginning:");
                    int val1 = scanner.nextInt();
                    ll.insertFist(val1);
                    break;
                case 2:
                    System.out.println("Enter value to insert at end:");
                    int val2 = scanner.nextInt();
                    ll.insetAdEnd(val2);
                    break;
                case 3:
                    System.out.println(" Enter the pos ");
                    int pos = scanner.nextInt();
                    System.out.println("enter the value");
                    int val3 = scanner.nextInt();
                    ll.insertAtpos(pos, val3);
                    break;
                case 4:
                    ll.deleteAtfirst();
                    break;
                case 5:
                    ll.deleteAtEnd();
                    break;
                case 6:
                    ll.printLinkedlist();
                    break;
                case 7:
                    System.out.println(ll.size());
                    break;
                case 8:
                    System.out.println("enter the index");
                    int idx = scanner.nextInt();
                    System.out.println(ll.deleteAtPos(idx));
                    break;

                case 9:
                    System.out.println("enter the index");
                    int idxx = scanner.nextInt();
                    System.out.println(ll.getElementAtpos(idxx));
                    break;
                case 10:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }
}
