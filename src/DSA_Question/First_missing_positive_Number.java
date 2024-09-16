package DSA_Question;
// Q. 41
public class First_missing_positive_Number {
    public static void main(String[] args) {
            int[] arr ={-1, 1 , 3, 4};
        System.out.println(cycle_sort(arr));
    }
    static int cycle_sort(int[] arr){
        int i=0;
        while(i<arr.length) {
                int correct = arr[i]-1;
                if(arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correct])
                {
                    swap(arr,i,correct);
                }
                else {
                    i++;
                }
        }
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]!= index+1){
                return index+1;
            }
        }
        // case 2
        return arr.length+1;
    }

    static void swap(int[] arr, int first , int last ){
        int extra = arr[first];
        arr[first] = arr[last];
        arr[last] = extra;
    }
}
