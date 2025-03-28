package questions.LinkedList;

public class SwapFirstAndLastNode {
    private Node head;
    private Node tail;
    private int len;

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
            len++;
        } else {
            tail.next = newn;
            newn.prev = tail;
            tail = newn;
            len++;
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

    public void removel(){
        tail=tail.prev;
        tail.next=null;
    }

    public void addFirst(int x){
        Node newn = new Node(x);
        newn.next=head;
        head.prev=newn;
        head=newn;

    }
    public void removeFirst(){
        head=head.next;
        head.prev=null;
    }
    public void get(int x){
        Node temp=head;
        for(int i=1;i<x;i++){
            temp=temp.next;
        }
        System.out.println(temp.value);
    }
    public void set(int x,int val){
        Node temp=head;
        for(int i=1;i<x;i++){
            temp=temp.next;
        }
        temp.value=val;
    }
    public void insert(int x, int val){
        Node temp=head;
        Node newn =new Node(val);

        for(int i=1; i<x;i++){
            temp=temp.next;
        }
        if(x==1){
            addFirst(val);
        }else {
            temp.prev.next = newn;
            newn.prev = temp.prev;
            newn.next = temp;
            temp.prev = newn;
            len++;
        }
    }
    public void remove(int x){
        Node temp=head;
        for(int i=1;i<x-1;i++){
            temp=temp.next;
        }
    }

    public void swapFirstLast(){
        if(len<2){
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        int ss= head.value;
        head.value=temp.value;
        temp.value=ss;
    }
}
