package Tree;

public class BinarySearchTree {
    class Node{
        int val;
        Node left;
        Node right;

        private Node(int val) {
            this.val = val;
        }
    }

    Node root;

    public boolean Insert(int val){
        Node newn =new Node(val);
        if(root==null){
            root=newn;
            return true;
        }
        Node temp=root;
        while(true){
            if(temp.val== newn.val){
                return false;
            }
            if(newn.val<temp.val){
                if(temp.left==null){
                    temp.left=newn;
                    return true;
                }
                temp=temp.left;
            }else{
                if(temp.right==null){
                    temp.right=newn;
                    return true;
                }
                temp=temp.right;
            }
        }
    }

    public boolean Contains(int x){
        if(root==null)return false;
        if(root.val==x) return true;

        Node temp= root;

        while(temp!=null){
            if(temp.val==x) return true;

            if(x>temp.val)
                temp=temp.right;
            else
                temp=temp.left;

        }
        return false;
    }
}
