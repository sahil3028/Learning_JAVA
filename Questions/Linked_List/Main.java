package Linked_List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        SwapNodeInPair dd = new SwapNodeInPair();
        dd.newNode(1);
        dd.newNode(2);
        dd.newNode(3);
        dd.newNode(4);
        dd.newNode(5);
        dd.print();
        System.out.println();
        dd.swapPairs();
        System.out.println();
        dd.print();
        System.out.println();
        dd.printr();
    }
}
