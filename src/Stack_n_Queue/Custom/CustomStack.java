package Stack_n_Queue.Custom;

public class CustomStack {
    protected int[] data;
    private static  final int DEFAULT_SIZE =10;

    int ptr = -1;

    // if there is no size passed
    public CustomStack(){
        this(DEFAULT_SIZE);
    }


    // if there is size passed call this constructor
    public CustomStack(int size) {
        this.data = new int[size];
    }

    // in this you need to maintain pointer to insert
    public boolean push (int item ){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] =item;
        return true;
    }

    int pop() throws StackExpetion{
        if (isEmpty()){
            throw new StackExpetion("Cannot pop from an empty stack ");
        }
        return data[ptr--];
    }
    public int peek() throws StackExpetion{
        if(isEmpty()){
            throw new StackExpetion("Cannot peek from from empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length-1; // ptr is at last index
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
}
