package DSA;

public class Q_88_array {
    static  void merge(int[] nums1, int m, int[] nums2, int n) {
        // we have to return the elements in num1
        if(n==0){
            return ;
        }
        int i =0;
        int j=0;
        while(i<m && j<n){
            if(nums2[j]<nums1[i] || nums1[i]==0){
                nums1[i]=nums2[j];
                j++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0}; int m = 3; int [] nums2 = {2,5,6}; int n = 3;
        merge(nums1, 3, nums2, 3);
    }
}
