package Stack_n_Queue.Custom;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(5);
        queue.insert(10);
        queue.insert(15);
        queue.insert(20);
        queue.insert(25);
        queue.display();
        System.out.println();
        queue.remove();
        System.out.println();
        queue.display();
    }
}
