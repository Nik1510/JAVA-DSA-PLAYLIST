package Stack_n_Queue.Questions;

import java.util.Stack;

// queue Using Stack

// insert effecient

public class Q_232_IMP {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public Q_232_IMP() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item ){
        first.push(item);
    }


    public int remove () throws Exception {
        while (!first.isEmpty()){ // loops runs if first is not empty
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public boolean  isEmpty(){
        return first.isEmpty();
    }

    public int peek () throws  Exception{
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

    public static void main(String[] args) {


    }
}
