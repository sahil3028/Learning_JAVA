package linkedl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        System.out.println("LL before reverse():");
        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLL after reverse():");
        myLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            LL before reverse():
            1
            2
            3
            4

            LL after reverse():
            4
            3
            2
            1

        */

    }

}



//public class Main {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        LinkedList link=new LinkedList();
//
//        for(int i=0;i<=4;i++) {
//            System.out.println("enter the element");
//          //  int t= in.nextInt();
//            link.newNode(i);
//        }
//        link.print();
//        System.out.println("enter the target");
//        int t= in.nextInt();
//        link.remove(t);
//
//        link.print();
//    }
//
//    }