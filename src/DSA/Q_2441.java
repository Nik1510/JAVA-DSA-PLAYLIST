package DSA;

public class Q_2441 {
    static int findMaxK(int[] nums) {
        // can if alternative postive numbers are present
        int i =0;
        int j=i+1;
        int tl =-1;
        while(i<nums.length-1){
            if(nums[j]==nums[i]*-1){
                int x=0;
                if(nums[j]<0){
                    x=nums[j]*-1;
                }else{
                    x=nums[j];
                }
                if(x>tl){
                    tl=x;
                }

            }
            j++;
            if(j==nums.length){
                i++;
                j= i+1;
            }
        }
        if(tl<0 && tl!=-1){
            return -1*tl;
        }
        return tl;
    }

    public static void main(String[] args) {
        int[] arr= {37,-37,-9,2,47,18,13,-11,9,-28};
        System.out.println(findMaxK(arr));
    }
}
