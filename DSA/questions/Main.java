package questions;

public class Main {
    public static void main(String[] args) {
        Palindrome dd= new Palindrome();
        dd.newNode(1);
        dd.newNode(2);
        dd.newNode(3);
        dd.newNode(2);
        dd.newNode(1);
        dd.print();
        System.out.println();
        //dd.printr();
        System.out.println(dd.isPalindrome());
        System.out.println();
        dd.print();
        System.out.println();
        dd.printr();

    }
}
