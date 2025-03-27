package Tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();

        bst.Insert(45);
        bst.Insert(88);
        bst.Insert(56);
        bst.Insert(34);
        bst.Insert(23);
        bst.Insert(9);

        System.out.println(bst.Contains(49));

    }
}
