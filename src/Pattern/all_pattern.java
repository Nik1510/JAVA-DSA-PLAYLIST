//package Pattern;
//
//public class all_pattern {
//    public static void main(String[] args) {
//        /*
//        How to approach a Pattern Printing:-
//        1.) no. of lines = no. of rows
//         = no. of times outer loop will run
//
//         2.) identify for every row number :-
//         a.)  how many col. are there
//         or
//         types of element there
//
//         3.) what do you want to print
//         */
////        pattern1(5);
////            pattern2(6)
////              pattern3(5);
//    pattern4(5);
//    }
//    static void pattern1(int n){
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <=n ; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern2(int n){
//        /*
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//         */
//        for (int row = 1; row <=n ; row++) {
//            // for every row, run the col
//            for (int col = 1; col <=row; col++) {
//                System.out.print("*");
//            }
//            // when one row is printed , we need to add a newline
//            System.out.println();
//        }
//    }
//    static void pattern3(int n ){
//        /*
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//         */
//        for (int row = 1; row <=n ; row++) {
//            for (int col = n; col >=row ; col--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern4(int n){
//        /*
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//         */
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern5(int n){
//        /*
//
//
//
//        *
//        *  *
//        *  * *
//        *  * * *
//        *  * * * *
//        *  * * *
//        *  * *
//        *  *
//        *
//
//
//         */
//
//        for (int row = 1; row <2*n ; row++) {
//            if (row < n / 2 + 1) {
//                for (int col = 1; col <=row ; col++) {
//                    System.out.print("*");
//                }
//            }
////            else {
////                for (int col = ; col < ; col++) {
////
////                }
//            }
//
//        }
//
//    }
//}
