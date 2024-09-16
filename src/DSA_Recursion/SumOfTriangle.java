package DSA_Recursion;

import java.util.Arrays;

public class SumOfTriangle {
    /*
Given an array of integers, print a sum triangle from it such that the first level has all array elements.
 From then, at each level number of elements is one less than the previous level and elements at the level is be
  the Sum of consecutive two elements in the previous level.
Example :
Input : A = {1, 2, 3, 4, 5}
Output : [48]
 [20, 28]
 [8, 12, 16]
 [3, 5, 7, 9]
 [1, 2, 3, 4, 5]
 link : - https://www.geeksforgeeks.org/sum-triangle-from-array/
 */
    public static void main(String[] args)
    {
        //input Array
        int[] x = { 1, 2, 3, 4, 5 };
        //Recursive function that will print answer
        printTriangle(x);
        System.out.println(Arrays.toString(x));
    }
    static void printTriangle(int[] x)
    {
        //base condition
        if (x.length == 1) {
            return;
        }
    /*temprory Array of input array in print(int[] arr) function
    for example arr = {1,2,3,4,5}
    then temp[] = {3,5,7,9} of size(arr.length-1)=4*/
        int[] temp = new int[x.length - 1];
        //Recursive function to fill elements in temp Array according to Que.
        helper(temp, x, 0);
        //Recursive call for print(int[] arr) function
        printTriangle(temp);
        //prints String format of temp Array//
        System.out.println(Arrays.toString(temp));
    }
    //Recursive function to fill elements in temp Array//
    static int[] helper(int[] temp, int[] x, int index)
    {
        //base condition//
        if (index == x.length - 1) {
            return temp;
        }
        temp[index] = x[index] + x[index + 1];
        //Recursive Call for helper() function//
        return helper(temp, x, index + 1);
    }

}
