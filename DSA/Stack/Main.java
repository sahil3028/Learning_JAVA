package Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Stack stack =new Stack();
        while(true){
            stack.printStack();
            System.out.println("\nenter stack");
            String inp=in.next();

            if (inp.equals("exit")) break;
            else if(inp.equals("pop")) stack.pop();
            else stack.add(Integer.parseInt(inp));
        }
    }
}
