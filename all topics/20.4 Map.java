/*
Topic: Map
Definition: The Collections Framework stores and processes groups of objects using standard data structures.
Why / usage: It provides ready-made lists, sets, maps, sorting, and iteration tools.
Where to use it: Use List for ordered items, Set for unique items, Map for key-value lookup, and Comparator for custom sorting.
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class Demo {
    public static void main(String[] args){   
    	
//    	Map<String, Integer> students=new HashMap<>();
    	Map<String, Integer> students=new Hashtable<>();
    	
    	students.put("Navin",56);
    	students.put("Harsh",23);
    	students.put("Sushil",67);
    	students.put("Kiran",92);
    	students.put("Harsh",45);
    	
    	System.out.println(students.keySet());
    	
    	for(String key : students.keySet())
    	{
    		System.out.println(key + ":" + students.get(key));
    	}
    	
    }
}