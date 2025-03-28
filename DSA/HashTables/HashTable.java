package HashTables;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable {
    private int size=7;
    private Node[] dataMap;

    public class Node{
        String key;
        int val;
        Node next;

        public Node(String key, int val){
            this.key=key;
            this.val=val;
        }
    }

    public HashTable(){
        dataMap= new Node[size];
    }

    public void printTable(){
        for(int i=0;i<dataMap.length; i++){
            System.out.println(i+":");
            Node temp=dataMap[i];
            while(temp!=null){
                System.out.println("   {" + temp.key + "= " + temp.val + "}");
                temp=temp.next;
            }
        }
    }
    private int hash(String key){
        int hash=0;
        char[] keyChar=key.toCharArray();
        for(int i=0;i< keyChar.length;i++){
            int asciiValue=keyChar[i];
            hash=(hash+asciiValue*23)%dataMap.length;
        }
        return hash;
    }
    public void set(String key, int val){
        int index=hash(key);
        Node newn=new Node(key, val);
        if(dataMap[index]==null) dataMap[index]=newn;
        else{
            Node temp=dataMap[index];
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newn;
        }
    }
    public int get(String key){
        int index=hash(key);
        Node temp=dataMap[index];
            while( temp!=null){
                if(temp.key.equals(key)) return temp.val;
                temp=temp.next;
            }
            return 0;

        }
        public ArrayList keys(){
        ArrayList<String> allKeys=new ArrayList<>();
            for (Node node : dataMap) {
                Node temp = node;
                while (temp != null) {
                    allKeys.add(temp.key);
                    temp = temp.next;
                }
            }
            return allKeys;
        }
    }

