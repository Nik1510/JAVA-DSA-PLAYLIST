package DSA_Question;

public class gfg_potd_day5 {
    static int countPairsWithDiffK(int[] arr, int k) {
        // code here
        int i=0;
        int j = i+1;
        int c=0;
        while(i<arr.length-1){
            if(arr[j]-arr[i]==k){
                c+=1;
            }
            j++;
            if(j== arr.length){
                i++;
                j= i+1;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr= {1, 5, 3, 4, 2};
        int k =3;
        System.out.println(countPairsWithDiffK(arr, k));
    }
}
