package questions;

public class SwapNodeInPair {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public void newNode(int value) {
        Node newn = new Node(value);
        if (head == null) {
            head = newn;
            tail = newn;
            length++;
        } else {
            tail.next = newn;
            newn.prev = tail;
            tail = newn;
            length++;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printr() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.prev;
        }

    }
    public void addFirst(int x){
        Node newn = new Node(x);
        newn.next=head;
        head.prev=newn;
        head=newn;

    }
    public void swapPairs() {
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;

        while (head != null && head.next != null) {
            Node firstNode = head;
            Node secondNode = head.next;

            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            secondNode.prev = previousNode;
            firstNode.prev = secondNode;

            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }

            head = firstNode.next;
            previousNode = firstNode;
        }

        head = dummyNode.next;
        if (head != null) head.prev = null;
    }



}
