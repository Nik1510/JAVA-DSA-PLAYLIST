package DSA_Question;

public class Q_169 {
    public static void main(String[] args) {
        int[] nums ={1,1,1,1,1,1,2};
        System.out.println(majorityElement(nums));
    }
    static int majorityElement(int[] nums) {
        int check = (nums.length)/2;
        int cMax =0;
        for (int i = 0; i < nums.length; i++) {
            int c=0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] ==nums[j]){
                    c++;
                }
            }
            if (c>cMax && c>check ){
                cMax= nums[i];
                break;
            }
        }

        return cMax;
    }
}
