import java.util.Arrays;
import java.util.Scanner;

public class helo {
    static Scanner in=new Scanner(System.in);

    public static boolean checkpos(int size, int pos){
        if(pos>size){
            System.out.println("The pos is more than the size try again");
            return false;
        }return true;
    }

    public static boolean insert(int [] arr, int size){
        System.out.println("Enter the pos you  wanna insert ");
        int pos = in.nextInt();

        if(!checkpos(size,pos)) return false;
        else pos--;


        System.out.println("Enter the value ");
        int val=in.nextInt();

        for(int x=size;x>=pos;x--){
            arr[x+1]=arr[x];
           // if(x==pos) arr[pos]=val;
        }
        arr[pos]=val;
       return true;
    }
    public static boolean delete(int [] arr, int size){
        System.out.println("enter the pos you want to delete ");
        int pos=in.nextInt();
        if(!checkpos(size,pos)) return false;
        else pos--;

        for(int i=pos;i<size;i++){
            arr[i]=arr[i+1];
        }
        return true;
    }

    public static void replace(int [] arr, int size){
        System.out.println("Enter the pos you wanna delete");
        int pos=in.nextInt();

        if(!checkpos(size,pos)) return;
        else pos--;

        System.out.println("Enter the value");
        int val=in.nextInt();
        arr[pos]=val;
    }
    public static void search(int[] arr,int size ){
        System.out.println("Enter the val to search ");
        int val=in.nextInt();
        if(Arrays.binarySearch(arr,val)<0){
            System.out.println("not found");
            return;
        }else System.out.println("found");
    }

    public static void main(String[] args) {

        int[] arr= new int[67];
        System.out.println("Enter the size of your array- ");
        int size=in.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }

        while(true){
            System.out.println("M E N U :\n1. Insert an element\n2. Delete an element\n3. Replace an element\n4. Search an element\n5. Display\n0. Exit");
            int ch=in.nextInt();
            switch (ch){
                case 1:
                    if (insert(arr,size))
                    size++;
                    break;
                case 2:
                    if(delete(arr,size))
                    size--;
                    break;
                case 3:
                    replace(arr,size);
                    break;
                case 4:
                    search(arr,size);
                    break;
                case 5:
                    System.out.println(Arrays.toString(arr));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong input try again");
                    break;
            }
        }
    }
}
