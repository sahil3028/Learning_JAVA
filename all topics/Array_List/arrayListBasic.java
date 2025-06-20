import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
        }

        //manuplatig how this method returns
        @Override
        public  String toString(){
            return String.format("%d %s in %s",count,name.toUpperCase(),type);
    }
}
public class arrayListBasic {
    public static void main(String[] args) {

        //array of object
        System.out.println("making array of objects");
        Object []grocery= new Object[3];
        grocery[0]=new GroceryItem("apple","fruits",5);
        grocery[1]="orange";
        System.out.println(Arrays.toString(grocery));

        System.out.println("now makin array of groceryItem");

        //making an array of groceryItems
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));


        System.out.println("now array list");

        //initialization of array list
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        System.out.println(objectList);
        //initialization of array list with a data type
        //but here the data type is a record -> grocery item which also has a

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("bottle"));

        //adding in  any position of the lists here I added in the first
        groceryList.add(0,new GroceryItem(" first"));

        System.out.println(groceryList);


        // creating lists
        String [] item={"a","b","c"};
        List<String> l1 = List.of(item);
        System.out.println(l1);

//        l1.add("d"); --> we cant us this beacuse array is immutable but we cn use this in array list

        ArrayList<String> gro   = new ArrayList<>(l1);
        gro.add("d");
        System.out.println(gro);

        //now populating the array list with list

        ArrayList<String> newList= new ArrayList<>(
                List.of("1","2","3"));
        System.out.println(newList);

        gro.addAll(newList);
        System.out.println(gro);

        //performing operations on the arraylist
        System.out.println("sencond item= "+ gro.get(1));
        if (gro.contains("c"))
        System.out.println("it contain c");
        gro.add("c");
        System.out.println("first "+gro.indexOf("c"));
        System.out.println("last one "+gro.lastIndexOf("c"));
        System.out.println(gro);
        gro.remove(1);
        System.out.println(gro);
        gro.remove("c"); //only removes the first c
        System.out.println(gro);
        gro.removeAll(List.of("a","b"));
        System.out.println(gro);
        gro.retainAll(List.of("1","3"));
        System.out.println(gro);

        gro.clear();
        System.out.println(gro);
        System.out.println("is empty "+ gro.isEmpty());

        gro.addAll(List.of("z","x","y"));
        gro.addAll((Arrays.asList("9","8","7")));

        System.out.println(gro);
        gro.sort(Comparator.naturalOrder());
        System.out.println(gro);
        gro.sort(Comparator.reverseOrder());
        System.out.println(gro);

        //converting a array list to an array
        var groArray= gro.toArray(new String[9]);// here if the length of array we pass has more element than the list then **anyway the whole list will be passed**, but if the length is more than the list than the rest of the array will be filled with default values
        System.out.println("yo  "+Arrays.toString(groArray));

        // lets see some differences between array and arraylist
        //if we pass a array in a array list by converting the array as array list
        //every change we make in list will reflict in the original array as well like change and sort elements
        //but we cant add or remove elements


        String[] orignalArray= new String[]{"first","second","third"};
        var originalList= Arrays.asList(orignalArray);

        originalList.set(0,"one");
        System.out.println("list "+originalList);
        System.out.println("array "+ Arrays.toString(orignalArray));

        originalList.sort(Comparator.naturalOrder());// sorting the list but it reflecting in both array and list
        System.out.println("array "+Arrays.toString(orignalArray));

//        originalList.add("aaa"); this will give an error

        // the major diff is
        // var newList = Arrays.asList("a","b","c");  the new list is mutable but not resizeable
        // var newList2 =  List.of("a","b","c");  the new list is not mutable
    }
}
