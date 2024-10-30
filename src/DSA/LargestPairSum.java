package DSA;

public class LargestPairSum {
     static int pairsum(int[] arr) {
        // code here
        int i=0;
        int j=i+1;
        int m=0;
        while(i<arr.length-1 ){
            int sum = arr[i]+arr[j];
            j++;
            m= Math.max(m,sum);
            if(j==arr.length){
                i++;
                j=i+1;

            }
        }
        return m;
    }


    public static void main(String[] args) {
        int[] arr={12,34,10,6,40};
        System.out.println(pairsum(arr));
    }
}
