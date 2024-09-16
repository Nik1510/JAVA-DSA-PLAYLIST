package Revision_Recursion;

public class _6_facorial {
    public static void main(String[] args) {
//        int ans = fac(5);
//        System.out.println(ans);
//        int sum_ans = sum(50);
//        System.out.println(sum_ans);

//        int d =  SOD(1342);
//        System.out.println(d);

        int e = digitProduct(55);
        System.out.println(e);

    }
//    static int fac(int n ){
//        if(n==1){
////            System.out.println("the value going in the stack right now is "+n);
//            return 1;
//        }
////        System.out.println("the value going in the stack right now is "+n);
//        return n*fac(n-1);
//    }

    static int fac(int n ){
        if(n<=1){
//            System.out.println("the value going in the stack right now is "+n);
            return 1;
        }
//        System.out.println("the value going in the stack right now is "+n);
        return n*fac(n-1);
    }

    static int sum(int n ){
        if(n<=1){
//            System.out.println("the value going in the stack right now is "+n);
            return 1;
        }
//        System.out.println("the value going in the stack right now is "+n);
        return n+sum(n-1);
    }
   static int SOD(int n){
//        SOD = sum of digits ;
//       e,g. = n= 1342 ;  ans = 1+3+4+2 =10
       // this can be broken down to 1 + F(342)
//                                      3+F(42)
//                                 ...........

       if(n==0){
           System.out.println("the current number in the Base Condition is "+"F("+n+")");

           return 0;
       }
//       lets understand the working of recursive calls
       System.out.println("the current number in the recursive call is "+"F("+n+")");
       return n%10+SOD(n/10);
       /*
       SOD(1342)
        ├── 2 + SOD(134)
        │   ├── 4 + SOD(13)
        │   │   ├── 3 + SOD(1)
        │   │   │   ├── 1 + SOD(0)
        │   │   │   │   └── 0 (base case)

        */
   }

   static int digitProduct(int n){
        if(n<=0){
            return 1;
        }
        return n%10*digitProduct(n/10);
   }
}
