package DSA_Question;

import java.util.ArrayList;
import java.util.List;

public class Q_442 {
    public static void main(String[] args) {

        int[] arr= {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1; // correct index should be value - 1
            if (nums[i] != nums[correct]) {
                // swap nums[i] and nums[correct]
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) { // if value is not equal to index + 1
                result.add(nums[index]);
            }
        }
        return result;
    }
}
