package Queue;

public class Queue {
    int len;
    Node top=null,last;

    class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
        }
    }
    public void add(int val){
        Node newn= new Node(val);

        if(top==null) {
            top = newn;
            last=newn;
        }else {
            newn.prev=last;
            last.next = newn;
            last=newn;
        }
        len++;
    }
    public void remove(){
        top=top.next;
        len--;
    }

    public void printQueue(){
        if(top==null) {
            System.out.println("empty Queue");
            return;
        }
        Node temp= top;
        while (temp!=null) {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
    }

}
