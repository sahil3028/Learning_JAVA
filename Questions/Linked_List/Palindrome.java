package Linked_List;

public class Palindrome {
    private Node head;
    private Node tail;
    private int len;

    public Palindrome() {
    }

    public void newNode(int value) {
        Node newn = new Node(value);
        if (this.head == null) {
            this.head = newn;
            this.tail = newn;
            ++this.len;
        } else {
            this.tail.next = newn;
            newn.prev = this.tail;
            this.tail = newn;
            ++this.len;
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

    public void removel() {
        this.tail = this.tail.prev;
        this.tail.next = null;
    }

    public void addFirst(int x) {
        Node newn = new Node(x);
        newn.next = this.head;
        this.head.prev = newn;
        this.head = newn;
    }

    public void removeFirst() {
        this.head = this.head.next;
        this.head.prev = null;
    }

    public void get(int x) {
        Node temp = this.head;

        for(int i = 1; i < x; ++i) {
            temp = temp.next;
        }

        System.out.println(temp.value);
    }

    public void set(int x, int val) {
        Node temp = this.head;

        for(int i = 1; i < x; ++i) {
            temp = temp.next;
        }

        temp.value = val;
    }

    public void insert(int x, int val) {
        Node temp = this.head;
        Node newn = new Node(val);

        for(int i = 1; i < x; ++i) {
            temp = temp.next;
        }

        if (x == 1) {
            this.addFirst(val);
        } else {
            temp.prev.next = newn;
            newn.prev = temp.prev;
            newn.next = temp;
            temp.prev = newn;
            ++this.len;
        }

    }

    public boolean isPalindrome() {
        Node start = this.head;
        Node end = this.tail;
        if (this.head == null) {
            return true;
        } else {
            while(start.next != null) {
                if (start.value != end.value) {
                    return false;
                }

                start = start.next;
                end = end.prev;
            }

            return true;
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
