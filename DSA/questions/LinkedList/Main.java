package questions.LinkedList;

public class Main {
    public static void main(String[] args) {
        SwapNodeInPair dd= new SwapNodeInPair();
        dd.newNode(1);
        dd.newNode(2);
        dd.newNode(3);
        dd.newNode(4);
        dd.newNode(5);
        dd.print();
        System.out.println();
        //dd.printr();
        dd.swapPairs();
        System.out.println();
        dd.print();
        System.out.println();
        dd.printr();

    }
}
