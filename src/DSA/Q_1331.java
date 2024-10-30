package DSA;

import java.util.Arrays;

public class Q_1331 {
    static int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return new int[0];

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        int[] ranks = new int[arr.length];
        int rank = 1;

        // Create an array to store ranks
        int[] rankArr = new int[sortedArr.length];
        rankArr[0] = rank;

        // Assign ranks to the sorted array
        for (int i = 1; i < sortedArr.length; i++) {
            if (sortedArr[i] != sortedArr[i - 1]) {
                rank++;
            }
            rankArr[i] = rank;
        }

        // Map the ranks back to the original array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < sortedArr.length; j++) {
                if (arr[i] == sortedArr[j]) {
                    ranks[i] = rankArr[j];
                    break;
                }
            }
        }

        return ranks;
    }
    public static void main(String[] args) {
        int[] arr= {100,100,100};
        int [] a= arrayRankTransform(arr);
        System.out.println(Arrays.toString(a));
    }
}
