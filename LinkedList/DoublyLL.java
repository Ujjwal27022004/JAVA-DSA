package LinkedList;

public class DoublyLL {

    private Node head;
    private Node tail;
    int size;

    DoublyLL(int size) {
        this.size = size;
    }

    DoublyLL() {
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void InsertFirst(int val) {
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void InserLast(int value) {
        Node node = new Node(value);
        node.next = null;
        node.prev = tail;
        tail = node;
    }

    public void Display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");

        System.out.println("Print in Reverse");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }
}
