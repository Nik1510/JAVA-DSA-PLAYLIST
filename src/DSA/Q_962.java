package DSA;

import java.util.Arrays;

public class Q_962 {

    static int maxWidthRamp(int[] nums) {
        // return maximum widrh of a ramp
                int n = nums.length;
                int maxWidth = 0;

                // Create an array of indices sorted by their corresponding values in nums
                Integer[] indices = new Integer[n];
                for (int i = 0; i < n; ++i) {
                    indices[i] = i;
                }
                Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));

                int minIndex = n;
                for (int i : indices) {
                    maxWidth = Math.max(maxWidth, i - minIndex);
                    minIndex = Math.min(minIndex, i);
                }

                return maxWidth;
            }


    public static void main(String[] args) {
        int[] nums ={9,8,1,0,1,9,4,0,4,1};
        System.out.println(maxWidthRamp(nums));
    }
}
