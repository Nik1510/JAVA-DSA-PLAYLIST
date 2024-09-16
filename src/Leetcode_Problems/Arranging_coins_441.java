package Leetcode_Problems;

public class Arranging_coins_441 {
    public static void main(String[] args) {
        // we are using binary search to find the number of coins required
        // this question is asking to make stairs with the help of coins
        //  link to this problem --> https://leetcode.com/problems/arranging-coins/description/
        // when in this problem i used binary search
        System.out.println(Arranging_coins(5));
//        double a = 5.8;
//        int c = (int) a;
//        double b = 5.2;
//        int d = (int) b;
//        System.out.println( c);
//        System.out.println(d);
    }
    static int Arranging_coins(int n){
        int start =0 ;
        int end =n;
        while (start<= end){
            int  mid = start +(end -start)/2;
            if(mid*(mid+1)/2 >n){
                end= mid -1;
            }
            else if(mid*(mid+1)/2 <n){
                start = mid +1;
            }
            else
                return mid;
        }
        return end;
        /*
        The condition `mid*(mid+1)/2 > n` is used to check if the total number of coins used in a complete pyramid with `mid` rows exceeds the total number of coins `n` available.

Here's why:

- The problem is about arranging coins in a staircase (or a pyramid) where the k-th row has k coins.
- The total number of coins used in a complete pyramid with `mid` rows can be calculated using the formula for the sum of an arithmetic series: `mid*(mid+1)/2`.
- If this total exceeds `n`, it means we've used too many coins, so we need to reduce the number of rows in our pyramid. We do this by setting `end` to `mid - 1`, effectively eliminating the upper half of our current search space.
- This is a binary search algorithm, which is why the code is adjusting `start` and `end` to narrow down the search space based on whether the total number of coins used is too much or too little. The goal is to find the largest `mid` that doesn't use more coins than available.

I hope this helps! Let me know if you have any other questions. 😊
         */


        /* ------------------------------------------------------------Read This-----------------------------------------------------------------------------------------------------
        The condition `mid * (mid + 1) / 2` in the `Arranging_coins` function is used to calculate the total number of coins that would form a complete staircase with `mid` steps.
        This formula is derived from the sum of an arithmetic series, which in this case, represents the sum of the first `mid` positive integers.

Here's why this formula is used:

- **Arithmetic Series**: The problem of arranging coins in a staircase pattern is essentially finding the sum of an arithmetic series.
 Each step of the staircase has one more coin than the previous step, starting from 1 coin at the first step.
- **Sum Formula**: The sum of the first `mid` positive integers is given by the formula $$\frac{mid \times (mid + 1)}{2}$$.
- **Binary Search Condition**: The binary search algorithm is used to find the maximum number of complete steps that can be formed with `n` coins. The condition checks if the sum of coins up to `mid` steps is greater than, less than, or equal to `n`.

Here's how the condition works within the binary search:

- If `mid * (mid + 1) / 2 > n`, there are too many coins to form `mid` complete steps, so the algorithm searches the lower half by setting `end` to `mid - 1`.
- If `mid * (mid + 1) / 2 < n`, there are not enough coins to form `mid` complete steps, so the algorithm searches the upper half by setting `start` to `mid + 1`.
- If `mid * (mid + 1) / 2 == n`, then `mid` is the exact number of complete steps that can be formed, and `mid` is returned.

When the loop exits, if an exact match isn't found, `end` will be the largest number of complete steps that can be formed with `n` coins, which is why `end` is returned.

Here's a visual representation of the staircase with 3 steps, which requires a total of 6 coins:

```
Step 3: ***
Step 2: **
Step 1: *
```

The sum of coins needed for 3 steps is $$1 + 2 + 3 = \frac{3 \times (3 + 1)}{2} = 6$$ coins.
1+2+3 =3(3+1)/2 =6
This formula is central to solving the problem and is the reason why it's used in the condition within the binary search loop.


         */
    }
}
