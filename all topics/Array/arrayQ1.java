
import java.util.Arrays;
import java.util.Random;
public class arrayQ1 {
    public static int[] rnd(int len){
        Random r=new Random();
        int[] a= new int[len];
        for (int i=0;i<len;i++){
            a[i]= r.nextInt(100);
        }
        return a;
    }
    public static void main(String[] args){
        int[] b=rnd(10);

        System.out.println("unsorted array\n" + Arrays.toString(b));

        Arrays.sort(b);
        int[] c= new int[10];
        for (int i=0;i<b.length;i++){
            c[i]=b[9-i];
        }
        System.out.println("Sorted array");
        for(int k: c){
            System.out.print(k+" ");
        }

    }
}
