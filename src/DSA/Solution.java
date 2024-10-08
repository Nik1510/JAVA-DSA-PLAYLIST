package DSA;

class Solution {
    static int removeDuplicates(int[] nums) {
        if (nums.length<=2){
            return nums.length;
        }
        int count =2;
        for (int i = 2; i < nums.length ; i++) {
            if (nums[i]!= nums[count-2]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr= {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}