package StackAndQueue;
import java.util.ArrayList;

public class popArrayList {
    public popArrayList() {
    }

    public class Stack<T> {
        private ArrayList<T> stackList = new ArrayList();

        public Stack() {
        }

        public ArrayList<T> getStackList() {
            return this.stackList;
        }

        public void printStack() {
            for(int i = this.stackList.size() - 1; i >= 0; --i) {
                System.out.println(this.stackList.get(i));
            }

        }

        public boolean isEmpty() {
            return this.stackList.size() == 0;
        }

        public T peek() {
            return (T)(this.isEmpty() ? null : this.stackList.get(this.stackList.size() - 1));
        }

        public int size() {
            return this.stackList.size();
        }

        public void push(T value) {
            this.stackList.add(value);
        }

        public T pop() {
            return (T)(this.stackList.isEmpty() ? null : this.stackList.remove(this.stackList.size() - 1));
        }
    }
}
