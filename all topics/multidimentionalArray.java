import java.util.Arrays;
import java.util.Objects;

public class multidimentionalArray {
    public static void main( String[] args){

// it can still be created if we don't give the size of next column like -- int array[][]= new int[4][]
    int array[][]= new int[4][4];

        System.out.println(Arrays.toString(array));
        System.out.println("size is "+ array.length);

        //it cant be printed like this
        for (int[] outer : array){
            System.out.println(outer);
        }

        System.out.println("it can se printed by ");
        //traditional for loop (currently used to put some values)
        for (int i=0;i<array.length;i++){
            var innerArray = array[i];
        for (int j=0;j<innerArray.length;j++){
            //System.out.print(array[i][j]+" ");
            array[i][j]= (i*10) +(j+1);
        }
            //System.out.println();
        }

        System.out.println("another wayyyy!!!");
        //for each loop
        for (var outer : array){
            for(int inner : outer ){
                System.out.print(inner+" ");
            }
            System.out.println();
        }


        //we have to use deeptostrig instead of tostring
        System.out.println("another wayy\n");
        System.out.println(Arrays.deepToString(array));
        System.out.println("here making a array shorter ");
        //making the second row shorter in the array
        array[1]=new int[]{10,20,30};
        System.out.println(Arrays.deepToString(array));

//making multidimensional array of objects

        System.out.println("\n\n\nMaking Array of objects");
        Object[] objArray = new Object[3];
        objArray[0] =new String[] {"a","b","c"};

        objArray[1]=new String[] []{
                {"1","2"},
                {"3","4","5"}
        };

        objArray[2]=new String[2] [2] [2];

        System.out.println("printing the whole obj array\n"+Arrays.deepToString(objArray)+"\n\n");

        for (Object element: objArray){
            System.out.println("Element Type= "+ element.getClass().getSimpleName());
            System.out.println("Element tostring= "+ element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}
