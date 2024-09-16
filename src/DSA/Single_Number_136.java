package DSA;

import java.util.Arrays;

public class Single_Number_136 {
    public static void main(String[] args) {
        int [] arr ={2,2,1};
        int [] arr2 ={4,1,2,1,2};
        System.out.println(singleNumber(arr));


    }
    static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return -1; // If no single number found
    }
        static int singleNumber2(int[] nums) {
            int res =0;
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    continue;
                }
                else{
                    res = nums[i];
                }
            }
            if(nums.length==1){
                return nums[0];
            }
            return res;
        }

}
