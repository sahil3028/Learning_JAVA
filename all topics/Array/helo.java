import java.util.Arrays;
import java.util.Scanner;

class arr_op{

    public arr_op(int size){
        arr_op.size = size;
        arr = new int[size+10];
    }


    static int size;
    static int[] arr;

    public boolean checkpos(int pos){
        return pos <= size;
    }
    public void disp(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public void insert(int pos,int val){
        if (!checkpos(pos))
            return;
        for(int i=size-1 ; i>=pos-1 ;i--)
            arr[i+1]=arr[i];
        arr[pos-1]=val;
        size++;
        disp();
    }

    public void delete(int pos){
        if(!checkpos(pos)) return;
        for(int i=pos-1;i<size;i++){
            arr[i]=arr[i+1];
        }
        size--;
        disp();
    }
    public void replace(int pos, int val){
        if(!checkpos(pos)) return;
        arr[pos-1]=val;
        disp();
    }

    public void search(int val){

        if(Arrays.binarySearch(arr,val)<0) System.out.println("not found");
        else System.out.println("found");


        disp();
    }
}

class helo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the the size of array:-> ");
        arr_op op= new arr_op(in.nextInt());

        for(int i=0;i<arr_op.size;i++)
            arr_op.arr[i]=in.nextInt();

        while(true){
            System.out.println("\nM E N U :\n1. Insert an element\n2. Delete an element\n3. Replace an element\n4. Search an element\n5. Display\n0. Exit");
            int ch=in.nextInt();
            int pos;
            switch (ch){
                case 1:
                    System.out.print("enter pos-> ");
                    pos=in.nextInt();
                    System.out.print("enter val-> ");
                    int val=in.nextInt();
                    op.insert(pos,val);
                    break;
                case 2:
                    System.out.print("enter pos-> ");
                    op.delete(in.nextInt());
                    break;
                case 3:
                    System.out.print("enter pos and value -->  ");
                    op.replace(in.nextInt(),in.nextInt());
                    break;
                case 4:
                    System.out.print("enter the element--> ");
                    op.search(in.nextInt());
                    break;
                case 5:
                    op.disp();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}