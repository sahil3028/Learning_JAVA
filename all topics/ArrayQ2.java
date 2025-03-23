import java.util.Arrays;
import java.util.Scanner;

public class ArrayQ2 {

public static int[] readIntegers(){

    Scanner in= new Scanner(System.in);
    System.out.println("enter the int separated by comas");
    String input= in.nextLine();
    //it splits the string into parts by searching for a particular string
    String[] sep= input.split(",");

    int[] userArray= new int[sep.length];
    for (int i=0;i<sep.length;i++){

        //trim is only used for precaution without it its fine
        userArray[i]=Integer.parseInt(sep[i].trim());
    }
    return userArray;
    }
    public static int findMin(int[] a){

    int min=a[0];
    for (int i: a){
        if (i<min) min=i;
    }
    return min;
    }

    public static int[] reverse(int[] array){

    int halfLen=(array.length-1)/2;

    for (int i=0;i<halfLen;i++){
        int temp=array[i];

        array[i]=array[(array.length-1)-i];
        array[(array.length-1)-i]=temp;
    }
        return array;
    }

    public static void main(String[] args) {
    int[] array= readIntegers();
        System.out.println("here is the array\n"+Arrays.toString(array));
        System.out.println("the minimum element is "+ findMin(array));
        System.out.println("the reverse is "+ Arrays.toString(reverse(array)));
        System.out.println("Sahil is here");
    }
}
