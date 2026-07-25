/*
Topic: ArrayList
Definition: The Collections Framework stores and processes groups of objects using standard data structures.
Why / usage: It provides ready-made lists, sets, maps, sorting, and iteration tools.
Where to use it: Use List for ordered items, Set for unique items, Map for key-value lookup, and Comparator for custom sorting.
*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args){   
    	
//    	Collection<Integer> nums= new ArrayList<Integer>();
//  	Collection nums=new ArrayList();
    	List<Integer> nums=new ArrayList<Integer>();
    	nums.add(6);
    	nums.add(5);
    	nums.add(8);
    	nums.add(2);
    	//nums.add("5");
    	
    	System.out.println(nums.get(2));
    	
    	System.out.println(nums.indexOf(2));
    	
//    	for(int n:nums)
//    	{
//    		System.out.println(nums);	
//    	}
    	for(Object n:nums)
    	{
    		int num=(Integer)n;
    		System.out.println(nums);	
    	}
    }
}

