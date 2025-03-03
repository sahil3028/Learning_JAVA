package doubleLkinedl;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedl dd =new DoubleLinkedl();
        dd.newNode(1);
        dd.newNode(2);
        dd.newNode(3);
        dd.newNode(2);
        dd.removel();
        dd.addFirst(99);
        //dd.removeFirst();
        dd.get(4);
        dd.set(4,10);dd.print();
        dd.insert(1,69);
        dd.print();
        dd.printr();
    }
}
