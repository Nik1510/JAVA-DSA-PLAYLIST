package Revision_Recursion;

public class _5 {
    public static void main(String[] args) {
//        prints n to 1
//        n1(5);
//        from_1_to_n(5);
//        here the return type is integer
//        System.out.println(nto1(5));

    }

    static void n1(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        n1(n-1);

    }
    static void from_1_to_n(int n){
        if(n==0){
            return ;
        }
       from_1_to_n(n-1);
        System.out.println(n);


    }

    static int nto1(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return nto1(n-1);
    }


}
