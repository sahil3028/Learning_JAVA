package linkedl;

/*
public class LinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

        private Node head;
        private Node tail;

        public LinkedList(int val){
            Node newn=new Node(val);
            head=newn;
            tail=newn;
        }
        public void printList(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.val);
                temp=temp.next;
            }
        }
        public void getHead(){
            if(head==null){
                System.out.println("linked list is empty");
            }else {
                System.out.println("Head: "+head);
            }
        }
        public void gerTail(){
            if(tail==null){
                System.out.println("empty");
            }else {
                System.out.println("Tail: "+tail);
            }
        }
        public int getLength(){
            if(head==null){
                System.out.println("Length= 0");
                return 0;
            }
            Node temp=head;
            int i;
            for( i=1;temp.next!=null;i++) temp=temp.next;
            return i;
        }

        public void append(int val){
            Node newn=new Node(val);
            if(head==null){
                head=newn;
                tail=newn;
            }else {
                Node temp=head;
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newn;
                tail=newn;
            }
        }
        public void removeLast(){
            if (head==null){
                System.out.println("empty");
            }else {
                Node temp=head,pre=head;
                while(temp.next!= null){
                    pre=temp;
                    temp=temp.next;
                }
                pre.next=null;
                tail=pre;
            }
        }
        public void prepend(int val){
            Node newn =new Node(val);
            if(head==null){
                head=newn;
                tail=newn;
            }
            else{
                newn.next = head;
                head = newn;
            }
        }

        public void removeFirst(){
            if(head!=null) {
                Node temp=head;
                head = head.next;
                temp.next=null;
            }
        }
        public void get(int x){
            if (x>getLength()){
                System.out.println("Not Exist");
                return;
            }
            Node temp=head;
            for(int i=1;i<x;i++){
                temp=temp.next;
            }
            System.out.println(temp);
        }

        public void set(int x,int v){
            if (x>getLength()){
                System.out.println("Not Exist");
                return;
            }
            Node temp=head;
            for(int i=1;i<x;i++){
                temp=temp.next;
            }
            temp.val=v;
        }
        public void insert(int x, int v){
            if (x>getLength()){
                System.out.println("Not Exist");
                return;
            }
            Node temp=head;
            for(int i=1;i<x-1;i++){
                temp=temp.next;
            }
            Node newn=new Node(v);
            newn.next=temp.next;
            temp.next=newn;
        }
        public void remove(int x){
            if (x>getLength()){
                System.out.println("Not Exist");
                return;
            }
            Node temp=head;
            for(int i=1;i<x-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        public void reverse(){
            if(head==null){
                System.out.println("empty");
                return;
            }
            else {
                Node bef=null,pre=head,aft=head;
                head=tail;
                tail=pre;
                while (pre!=null){
                    aft=aft.next;
                    pre.next=bef;
                    bef=pre;
                    pre=aft;
                }
                */
/*tail=head;
                head=pre;*//*

            }
        }



    }
*/

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value)  {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

}







