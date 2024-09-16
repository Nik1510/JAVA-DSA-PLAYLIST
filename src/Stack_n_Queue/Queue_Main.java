package Stack_n_Queue;

public class Queue_Main {
    public static void main(String[] args) throws Exception {
//        Custom_Queue queue = new Custom_Queue(5);
//        queue.insert(5);
//        queue.insert(3);
//        queue.insert(6);
//        queue.insert(5);
//        queue.insert(10);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.display();

        Circular_Queue queue = new Circular_Queue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(11);

        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}
