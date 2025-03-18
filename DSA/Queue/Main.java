package Queue;

import Stack.Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Queue queue =new Queue();
        while(true){
            queue.printQueue();
            System.out.println("\nenter Queue");
            String inp=in.next();
            if(inp.equals("exit")) break;
            else if(inp.equals("pop")) queue.remove();
            else queue.add(Integer.parseInt(inp));
        }
    }
}
