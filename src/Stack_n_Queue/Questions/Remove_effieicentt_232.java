package Stack_n_Queue.Questions;

import java.util.Stack;

public class Remove_effieicentt_232 {
    public static void main(String[] args) {

    }
}
class QueusUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;
    // making remove efficient

    public QueusUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void insert(int item){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int peek(){
        int peeked = first.peek();
        return peeked;
    }
    public int removed(){
        return first.pop();
    }
}
