//package Leetcode_Problems;
//// Flipping and image
////[1,1,0] horizontally results in [0,1,1].
////, inverting [0,1,1] results in [1,0,0].
//
///*
//Example 1:
//
//        Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//        Output: [[1,0,0],[0,1,0],[1,1,1]]
//        Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//        Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
//
//
//        Constraints:
//
//                    n == image.length
//                    n == image[i].length
//                    1 <= n <= 20
//                    images[i][j] is either 0 or 1.
// */
//public class Q_832 {
//    public static void main(String[] args) {
//        int[][] array = {
//                {1, 1, 0},
//                {1, 0, 1},
//                {0, 0, 0}
//        };
////        int[][] result = flipAndInvertImage(array);
////        for (int[] row : result) {
////            System.out.println(Arrays.toString(row));
////    }
//
////  Mistake I made
//
//
////    static int[][] flipAndInvertImage(int[][] image) {
////        int [][] image1 ;
////        for (int i = 0; i< image.length; i++) {
////            for (int j = 0; j <image.length ; j++) {
////                image1[image.length-i][image.length-j] = image[i][j];
////            }
////        }
////        for (int i = 0; i < image1.length ; i++) {
////            for (int j = 0; j < image1.length ; j++) {
////                if(image1[i][j]==0){
////                    image1[i][j] =1;
////                }
////                else {
////                    image1[i][j]=0
////                }
////            }
////            return new int[][] image1;
////        }
////    }
//
//
///*
//Problem Description:
//            You’re given a 2D array called image, where each element is either 0 or 1.
//            The goal is to perform two operations on each row of the image:
//            Reverse the row (i.e., flip it horizontally).
//            Invert the values (i.e., replace 0 with 1 and vice versa).
//
//
//
//            Explanation:
//                We create a new 2D array image1 to store the result.
//                We iterate through each element of the original image, reverse the row, and invert the values.
//                The expression 1 - image[i][n - j - 1] flips the value (0 to 1 and 1 to 0).

//}
