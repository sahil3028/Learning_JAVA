package linkedl;

//public class LinkedList {
//    class Node {
//        int value;
//        Node next;
//
//        Node(int value) {
//            this.value = value;
//        }
//    }
//
//    private Node head;
//    private Node tail;
//    private int length;
//
//    public void newNode(int val) {
//        Node newn = new Node(val);
//        Node temp = head;
//        if (head == null) {
//            head = newn;
//            tail = newn;
//        } else {
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newn;
//            tail = newn;
//        }
//    }
//
//    public void addfirst(int val){
//        Node newn = new Node(val);
//        Node temp = head;
//        head=newn;
//        head.next=temp;
//    }
//
//    public void print() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.value + "  ");
//            temp = temp.next;
//        }
//    }
//
//    public void rev(){
//           Node temp = tail;
//        while (temp != null) {
//            System.out.print(temp.value + "  ");
//            temp = temp.next;
//        }
//    }
//
//    public void remove(int x) {
//        Node temp = head;
//        if(head.value==x){
//            if(head.next !=null)
//            head=head.next;
//            else head=null;
//            return;
//        }
//        else if(temp.next==null){
//            System.out.println("not found");
//            tail=temp;
//            return;
//        }
//        while (temp.next != null) {
//
//            if(x == temp.next.value){
//                if(temp.next.next!=null){
//                    temp.next=temp.next.next;
//                    return;
//                }else{
//                    temp.next=null;
//                    tail=temp;
//                    return;
//                }
//            }
//            temp=temp.next;
//        }
//    }
//}



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
