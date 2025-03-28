package Linked_List;

public class SwapNodeInPair {
    private Node head;
    private Node tail;
    private int length;

    public SwapNodeInPair() {
    }

    public void newNode(int value) {
        Node newn = new Node(value);
        if (this.head == null) {
            this.head = newn;
            this.tail = newn;
            ++this.length;
        } else {
            this.tail.next = newn;
            newn.prev = this.tail;
            this.tail = newn;
            ++this.length;
        }

    }

    public void print() {
        for(Node temp = this.head; temp != null; temp = temp.next) {
            System.out.print(temp.value + " ");
        }

        System.out.println();
    }

    public void printr() {
        for(Node temp = this.tail; temp != null; temp = temp.prev) {
            System.out.print(temp.value + " ");
        }

    }

    public void addFirst(int x) {
        Node newn = new Node(x);
        newn.next = this.head;
        this.head.prev = newn;
        this.head = newn;
    }

    public void swapPairs() {
        Node dummyNode = new Node(0);
        dummyNode.next = this.head;

        Node firstNode;
        for(Node previousNode = dummyNode; this.head != null && this.head.next != null; previousNode = firstNode) {
            firstNode = this.head;
            Node secondNode = this.head.next;
            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            secondNode.prev = previousNode;
            firstNode.prev = secondNode;
            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }

            this.head = firstNode.next;
        }

        this.head = dummyNode.next;
        if (this.head != null) {
            this.head.prev = null;
        }

    }

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }
}
