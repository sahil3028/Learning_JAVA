import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record Place(String name, int dist) {

    @Override
    public String toString() {
        return String.format("reached %s at  %d km", name, dist);
    }
}

public class LinkedListQ1 {

    public static void addPlace(LinkedList<Place> list, Place place) {
        ListIterator<Place> itr = list.listIterator();
        ListIterator<Place> dup = list.listIterator();
        while(dup.hasNext()){
            if(dup.next().name().equalsIgnoreCase(place.name())){
                System.out.println("Duplicate found: " + place.name());
                return;
            }
        }

        while (itr.hasNext()) {
            Place current = itr.next();

            if (current.dist() > place.dist()) {
                itr.previous();
                itr.add(place);
                System.out.println("Added in order: " + place);
                return;
            }
        }

        // If no earlier insertion happened, add at the end
        list.add(place);
        System.out.println("Added at the end: " + place);
    }
    public static void printmenu(){
        System.out.println("""
                (F)orward
                (B)ackwards
                (A)dd a station
                (Q)uit""");return;

    }

    public static void main(String[] args) { Scanner in=new Scanner(System.in);

        LinkedList<Place> station = new LinkedList<>();

        addPlace(station, new Place("Sydney", 0));
        addPlace(station, new Place("Sydney", 0)); // Duplicate case
        addPlace(station, new Place("Adelaide", 1374));
        addPlace(station, new Place("Brisbane", 917));
        addPlace(station, new Place("Perth", 3923));
        addPlace(station, new Place("Alice Springs", 2771));
        addPlace(station, new Place("Darwin", 3972));
        addPlace(station, new Place("Melbourne", 877));

        System.out.println("\nFinal Sorted List: " + station);
        ListIterator<Place> move= station.listIterator();
        while(true){
            printmenu();
            String c=in.next();
            switch(c){
                case "f":
                    if(move.hasNext())
                    System.out.println(move.next());
                    else System.out.println("end reached");
                    break;
                case "b":
                    if (move.hasPrevious())
                    System.out.println(move.previous());
                    else System.out.println("reached the start again");
                    break;
                case "a":
                    System.out.println("enter station");
                    String n= in.next();
                    System.out.println("enter dist frm the start");
                    int d= in.nextInt();
                    addPlace(station,new Place(n,d));
                    break;
                case"q":
                    System.out.println("leaving");
                    return;

                default:
                    System.out.println("try again");
            }
        }

    }
}
