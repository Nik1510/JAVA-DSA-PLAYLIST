package DSA;

public class Q_3151 {
    static boolean isArraySpecial(int[] nums) {
        if(nums.length <=1){
            return true;
        }

        for(int i =1 ;i<nums.length;i++) {
            if ((nums[i] % 2  == nums[i - 1] % 2)) {
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        int [] arr = {4,3,1,6};
        int [] arr2 = {4,3,2};
        int [] arr3 = {4,4,4};
        System.out.println(isArraySpecial(arr2));
    }
}
