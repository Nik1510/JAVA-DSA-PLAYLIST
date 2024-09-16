package Maths;

public class Sqaure_root_By_BINARY_SEARCH {
    public static void main(String[] args) {
        // we are given exact square
        System.out.println(Squre(64));
    }
    static int Squre(int n){
        int end =n;
        int start=0;
        while(n>0){
            int mid = start+(end-start)/2;
            if(mid*mid>n){
                end = mid-1;
            } else if (mid*mid<n) {
                start = mid+1;
            }else {
                return mid;
            }
        }
            return n;
    }
}
