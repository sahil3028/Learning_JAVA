/*
Topic: forEach Method
Definition: The Stream API processes collections through a pipeline of operations.
Why / usage: It expresses filtering, mapping, sorting, and aggregation clearly.
Where to use it: Use streams when transforming or summarising lists of data without manually managing loops.
*/
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args){   
    	
    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
    	
//    	Consumer<Integer> con=new Consumer<Integer>() {
//    		
//    		public void accept(Integer n)
//    		{
//    			System.out.println(n);
//    		}
//    	};
    	
    	Consumer<Integer> con= n -> System.out.println(n);
 
    	nums.forEach(n -> System.out.println(n));
   
 //  	nums.forEach(null);
 //   	nums.forEach(con);
    	
    	
    	//nums.forEach(n -> System.out.println(n));
    	
    }
}
