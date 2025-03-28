package HashTables;

public class Main {
    public static void main(String[] args) {
        HashTable hs=new HashTable();

        hs.set("nails",100);
        hs.set("lumber",50);
        hs.printTable();
        System.out.println(hs.get("lumber"));
        System.out.println(hs.keys());
    }

}
