package Stack_n_Queue;

public class Custom_Stack {
    protected  int[] data;
    private static final int DEFAULT_SIZE =10   ;
    int ptr =-1;
    public Custom_Stack(){
        this(DEFAULT_SIZE);
    }
    public Custom_Stack(int size){
        this.data = new int[size];
    }
    public boolean push(int item){


        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] =item;
        return true;
    }

    public int pop() throws Stack_Expection {
        if (isEmpty()){
            throw new Stack_Expection("Cannot pop from an empty stack");
        }
//        int removed =data[ptr];
//        ptr--;
//        return removed;

        return data[ptr--];
    }
    public int peek() throws Stack_Expection {
        if (isEmpty()){
            throw new Stack_Expection("Cannot peep from an empty stack");
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr == data.length-1; // ptr is at last index
    }
    private boolean isEmpty(){
        return ptr==-1;
    }
}
