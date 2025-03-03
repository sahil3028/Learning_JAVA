import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class arrayBasic {

//making a method for generation of random array
public static int[] random(int len){

    Random rand =new Random();
    int[] arr=new int[len];
    for(int i=0;i<len;i++){
        arr[i]= rand.nextInt(10);
    }
    return arr;
}


    public static void main(String[] args){

//array creation
        int[] num= new int[3];
//making a scanner obj
        Scanner sc= new Scanner(System.in);

        for(int len = 0; len < num.length; len++){
            num[len]=sc.nextInt();
        }
    sc.close();
 //for each for loop for printing of array
        for (int i : num) {
        System.out.println(i);
        }

//using printing whole array
        System.out.println(Arrays.toString(num));
//making a variable of an object
        Object var =num;
        if(var instanceof int[]){
            System.out.println("the array is a int array");
            System.out.println(var);
        }
//making array of the objects
        Object [] objArray= new Object[3];
        objArray[0]="sahil";
        objArray[1]= new StringBuilder("Sahil Sah");
        objArray[2]= num;
        System.out.println(objArray[2]);
//random array

        System.out.println("now using random arrays ");
        int[] rndArray= random(10);


        System.out.println(Arrays.toString(rndArray));
        Arrays.sort(rndArray);
        System.out.println(Arrays.toString(rndArray));

//making copy of the array
        System.out.println("making copy and using filler array");
        int[] copyarr=Arrays.copyOf(rndArray,rndArray.length);
        System.out.println(Arrays.toString(copyarr));

        int[] fillarr=new int[10];
        Arrays.fill(fillarr,5);
        System.out.println("fills with 5\n"+Arrays.toString(fillarr));

//binary search using array class
        //the array must be sorted, and it returns the position of the found element and -1(if not found)
        //doesn't work for duplicate elements

        System.out.println("Binary Search and equal arrays");
        String[] a={"abhi","babhi","sahil","snake","zebra"};
        if(Arrays.binarySearch(a,"sahil")>0){
            System.out.println("Found");
        }
        else {
            System.out.println("not found");
        }
//comparing 2 arrays
        //it returns false and true
        String[] b={"abhi","babhi","sahil","snake","zebra"};
        if(Arrays.equals(a,b)){
            System.out.println("they are equal");
        }
        else {
            System.out.println("not equal");
        }

        // LET'S TALK ABOUT VARARGS (variable arguments)
        //in we use ... instead of [] in the argument of a method so that we can directly
        // send values to and separate  it by using comas and it automatically creates that array

        System.out.println(Arrays.toString(varargs("zebra","Sahil")));

    }


    public static String[] varargs(String... a ){
        System.out.println(a[0]);
        System.out.println(a[1]);
    return a;
    }
}
