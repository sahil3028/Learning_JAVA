//write a program to to take coma seperated inputs and add it to a list and make sure that thers no dublicate items
//menu- add item delete item, 0 shutdown
//array listttttt


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class arrayListQ1 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> gro = new ArrayList<>();
        String printblock = """
                MENU
                1. add items
                2. remove items
                0. shutdown
                """;
        while (true) {
            System.out.println(printblock);
            switch (Integer.parseInt(in.nextLine())) {
                case 1 -> addItem(gro);
                case 2 -> removeItem(gro);
                case 0 -> System.exit(0);
            }
        }
    }

    public static void addItem(ArrayList<String> gro) {
        System.out.println("Enter stuffs to add");
        String[] add = in.nextLine().split(",");
        for (String i : add) {
            String trim = i.trim();
            if (!gro.contains(trim))
                gro.add(trim);
        }
        gro.sort(Comparator.naturalOrder());
        System.out.println(gro);
    }

    public static void removeItem(ArrayList<String> gro) {
        System.out.println("Enter stuffs to remove");
        String[] add = in.nextLine().split(",");
        for (String i : add) {
            String trim = i.trim();
            if (gro.contains(trim))
                gro.remove(trim);
        }
        gro.sort(Comparator.naturalOrder());
        System.out.println(gro);
    }
}