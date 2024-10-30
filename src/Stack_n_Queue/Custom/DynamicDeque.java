package Stack_n_Queue.Custom;

public class DynamicDeque extends CustomDeque{
    public DynamicDeque(){
        super();
    }
    public DynamicDeque(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if (this.isFull()){
            int[] temp = new int[2*size];
            for (int i = 0; i < size; i++) {
                temp[i] =data[(front+i)%data.length];
            }
            front=0;
            end = data.length;
            data= temp;
        }

        return super.insert(item);
    }
}
