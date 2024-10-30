package Stack_n_Queue.Custom;

public class dequeMain {
    public static void main(String[] args) throws Exception {
        CustomDeque queue = new CustomDeque(5);
        queue.insert(5);
        queue.insert(10);
        queue.insert(15);
        queue.insert(20);
        queue.insert(25);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();
    }
}
