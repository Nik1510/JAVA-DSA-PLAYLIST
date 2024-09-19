package Stack_n_Queue.Questions;

import java.rmi.server.ExportException;
import java.util.Stack;

public class Q_232_Second_Method {
    Stack<Integer> first = new Stack<>();
    Stack <Integer> second  = new Stack<>();

    public Q_232_Second_Method() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int x) throws Exception{
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(x);
        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int remove() throws Exception{
        return first.pop();
    }
    public int peek() throws Exception{
        return first.peek();
    }



    public static void main(String[] args) {

    }
}
