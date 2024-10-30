package DSA;

import java.util.Arrays;

public class triplet_family {
    static  boolean findTriplet(int[] arr) {
//        Arrays.sort(arr);
        boolean s = false;
        for (int i = 0; i < arr.length - 1; i++) {
            int c = 0;
            int diff = 0;
            for (int j = i + 1; j < arr.length && c < 2; j++) {
                diff = arr[j] - diff;
                c++;
            }
            if (diff == arr[i]) {
                s = true;
                break;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,4};
        System.out.println(findTriplet(arr));
    }
}
