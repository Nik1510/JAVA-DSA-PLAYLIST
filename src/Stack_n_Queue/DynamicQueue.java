package Stack_n_Queue;

public class DynamicQueue extends Circular_Queue {
    public DynamicQueue() {
        super(); // Initialize the circular queue
    }

    public DynamicQueue(int size) {
        super(size); // Initialize the queue with the specified size
    }

    @Override
    public boolean insert(int item) {
        if (isFull()) {
            // Double the array size (or choose another growth factor)
            int newSize = Math.max(data.length * 2, 1); // Ensure newSize is at least 1
            int[] temp = new int[newSize];

            // Copy existing elements to the new array
            for (int i = 0; i < end; i++) {
                temp[i] = data[(front + i) % data.length];
            }

            // Update front and end indices
            front = 0;
            end = data.length;

            // Assign the new array to data
            data = temp;
        }

        // Insert the new item
        data[end] = item;
        end = (end + 1) % data.length; // Circular increment

        return true;
    }
}
