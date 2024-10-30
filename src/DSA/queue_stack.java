package DSA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
public class queue_stack {
    static Queue<Integer> modifyQueue(Queue<Integer> q, int k){
        if(q.isEmpty() ||k<0){
            return q;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()){
            q.add(stack.pop());
        }
        int size= q.size()-k; // 5-3 =2
        for(int i=0; i<size ;i++){
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(modifyQueue(q, 3));
    }
}
