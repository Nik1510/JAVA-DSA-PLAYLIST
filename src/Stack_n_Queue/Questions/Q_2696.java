package Stack_n_Queue.Questions;

import java.util.Stack;

public class Q_2696 {
    static  int minLength(String s) {
        Stack<Character> stack = new Stack<>();
//        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()){
                if(stack.peek()=='A' && s.charAt(i)=='B' || stack.peek()=='C' && s.charAt(i)=='D'){
                    stack.pop();
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
        int c=0;
        while (!stack.isEmpty()){
            c++;
            stack.pop();
        }
        return c+1;
    }
    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
    }
}
