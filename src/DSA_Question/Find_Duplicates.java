package DSA_Question;
// question 287
public class Find_Duplicates {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4 , 2, 2};
        System.out.println(cycle_sort(nums));
    }
    static int cycle_sort(int[] arr){
        int i=0;
        while(i<arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i];
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else i++;
        }
        return -1;
    }

    static void swap(int[] arr, int first , int last ){
        int extra = arr[first];
        arr[first] = arr[last];
        arr[last] = extra;
    }
}
