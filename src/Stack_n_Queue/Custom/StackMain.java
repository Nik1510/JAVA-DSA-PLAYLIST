package Stack_n_Queue.Custom;

public class StackMain {
    public static void main(String[] args) throws StackExpetion {
//        CustomStack stack = new CustomStack(5);
//        stack.push(5);
//        stack.push(15);
//        stack.push(20);
//        stack.push(25);
//        stack.push(30);
////        stack.push(35);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
////        System.out.println(stack.pop());


        DynamicStack stack = new DynamicStack();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(12);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
