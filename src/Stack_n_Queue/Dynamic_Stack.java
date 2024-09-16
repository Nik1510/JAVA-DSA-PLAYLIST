package Stack_n_Queue;

public class Dynamic_Stack extends Custom_Stack{
    public Dynamic_Stack() {
        super(); // it will call Custom_Stack()
    }

    public Dynamic_Stack(int size) {
        super(size);// it will call Custom_Stack(int size)
    }

    @Override
    public boolean push(int item) {

        // this takes care of it being full
        if(this.isFull()){
            // double the array size
            int[] temp =new int[data.length*2];

            // copy all the pervious items in new Data
            for (int i = 0; i < data.length; i++) {
                temp[i] =data[i];
            }
            data =temp;
        }
        // at this point we know that array is not full
        // insert item
        return super.push(item);

    }
}
