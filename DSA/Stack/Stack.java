package Stack;

public class Stack {
    Node top=null;
    int len;
class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
}

public void add(int val){
    Node newn=new Node(val);
    newn.next=top;
    top=newn;
}
public void printStack(){
    if (top==null) System.out.println("empty Stack");
    Node temp=top;
    while(temp!=null){
        System.out.print(temp.val+" ->  ");
        temp=temp.next;
    }
}
public void pop(){
    top=top.next;
}
public int getTop(){
    return top.val;
    }
    public int getLen(){
    return len;
    }
}
