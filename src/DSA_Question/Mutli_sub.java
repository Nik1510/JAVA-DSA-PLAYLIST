package DSA_Question;

class Solution {
    static int subtractProductAndSum(int n) {
        int x =n;
        int mult=1;
        int sum=0;
        while(x!=0){
            int z = x%10;
            mult*=z;
            sum+=z;
            x =x/10;
        }
        int res = mult-sum;
        return res;
    }

    public static void main(String[] args) {
       int a= subtractProductAndSum(254);
        System.out.println(a);

    }
}
