package Stack_n_Queue;

public class DynamicQueue  extends Circular_Queue{
    public DynamicQueue (){
        super();
    }
    public Dynamic_Stack(int size){
        super(size);
    }
    @Override
    public boolean insert(int item){
        if (this.isFull()){
            // double the array size
            int[] temp = new int[data.length*2];
            // copy the previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] =data[(front+i) % data.length];
            }
            front =0;
            end = data.length;
            data=temp;
        }

    }
}
