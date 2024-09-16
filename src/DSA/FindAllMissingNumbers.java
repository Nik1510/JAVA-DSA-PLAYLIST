import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumbers {

    public static void main(String[] args) {
        // Example usage: Test cases
        int[] nums1 = {4, 3, 2, 7, 8, 2, 1};
        List<Integer> result1 = findDisappearedNumbers(nums1);
        System.out.println("Missing numbers in nums1: " + result1);

        int[] nums2 = {};
        List<Integer> result2 = findDisappearedNumbers(nums2);
        System.out.println("Missing numbers in nums2: " + result2);

        int[] nums3 = {1, 2, 3, 4, 5};
        List<Integer> result3 = findDisappearedNumbers(nums3);
        System.out.println("Missing numbers in nums3: " + result3);
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        // Step 1: Rearrange elements to their correct positions
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (correctIndex >= 0 && correctIndex < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }


        // Step 2: Identify missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                missingNumbers.add(index + 1);
            }
        }
        return missingNumbers;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
