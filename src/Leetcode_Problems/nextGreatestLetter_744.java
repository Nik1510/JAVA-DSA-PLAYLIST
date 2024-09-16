package Leetcode_Problems;

public class nextGreatestLetter_744 {
    public static void main(String[] args) {
        char target = 'c';
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
        /*
            The `while` loop in your `nextGreatestLetter` function doesn't have a return statement because the return statement is placed outside of the loop to ensure that a character is returned regardless of where the loop ends.

Here's the breakdown of the logic:

- The `while` loop is used to find the smallest letter in the array that is greater than the `target`.
- If the `target` is found to be less than the `mid` element, the `end` is moved to `mid - 1` to narrow the search to the lower half of the array.
- If the `target` is not less than the `mid` element, the `start` is moved to `mid + 1` to narrow the search to the upper half of the array.
- Once the `while` loop exits, it means that the `start` has moved past the `end`, and the smallest letter greater than the `target` is at the `start` index,
or it wraps around to the beginning of the array if `start` is equal to the array length.

The line `return letters[start % letters.length];` ensures that if `start` is equal to `letters.length` (meaning the `target` is greater than all elements in the array),
 it will wrap around and return the first element of the array, which is the correct behavior for this problem.

This implementation guarantees that a valid character from the array is always returned, even if the `target` character isn't found within the array.
 It's a clever way to handle the wrap-around without needing additional conditional checks or a separate return statement inside the loop.
  The modulus operator `%` is key here, as it handles the case where we need to loop back to the start of the array seamlessly.

         */

        /*
            ------------------------------------------------ The line `return letters[start % letters.length];----------------------------------------------

                 is a clever piece of code that ensures the correct character is returned from the `letters` array, even when the search goes beyond the last index.
                  Here's a detailed explanation:

The `letters` array is sorted, and the goal is to find the smallest letter that is greater than the `target`.
 If such a letter exists in the array, the `start` index will point to it by the end of the binary search loop.
  However, if the `target` letter is greater than or equal to all characters in the array,
   the `start` index will be equal to `letters.length` (since `start` will increment past the last index).

Now, let's break down the expression:

- `start % letters.length`: This modulus operation calculates the remainder when `start` is divided by the length of the `letters` array.
- If `start` is less than `letters.length`, the remainder is just `start`, and the expression returns the character at the `start` index.
- If `start` is equal to `letters.length`, the remainder is `0`, and the expression returns the first character in the array, effectively wrapping around.

This behavior is exactly what's needed for this problem. If all characters in the array are less than or equal to the `target`, the function should return the first character in the array, as per the problem's requirement to wrap around to the beginning.

Here's an example to illustrate:

Suppose `letters = ['c', 'f', 'j']` and `target = 'k'`. After the binary search, `start` will be `3` because 'k' is greater than all characters in the array.
 Since there's no character greater than 'k' in the array, we wrap around:

- `start % letters.length` is `3 % 3`, which equals `0`.
- `letters[0]` is `'c'`, which is the correct answer.

This line ensures that the function always returns a valid character from the array, making the code robust and efficient.
 It's a great example of using the modulus operator to handle edge cases in a binary search algorithm.
         */

        /*
         ----------------------------- the use of start in while loop-------------------------------------------------------------------------------


        The value is stored in the `start` pointer because of how the binary search algorithm is designed to work in the context of this problem.
         The goal is to find the smallest element in the sorted array that is greater than the `target`. Here's why `start` is used:

- **Binary Search Modification**: In a standard binary search, you would return the element once it's found.
However, in this problem, you're looking for the **next greatest letter** after the `target`, which may not be in the array.
- **End Condition**: When the `while` loop ends, `start` will be at the smallest index whose element is greater than the `target`,
or it will be just past the end of the array if the `target` is greater than or equal to all elements.
- **Wrapping Around**: If the `target` is greater than or equal to all elements in the array, `start` will be equal to `letters.length`.
 Since the problem specifies that the array is circular, you need to wrap around to the first element, and `start % letters.length` handles this by resetting `start` to `0`.
- **Ensuring a Result**: By using `start`, you ensure that a result is always returned, even if the `target` is not found or is larger than all the characters in the array.

In essence, `start` is the pointer that moves through the array to find the position where the next greatest letter should be.
 Once the loop exits, `start` is at the correct position to return the answer, whether it's an element directly greater than the `target` or the first element in the case of wrap-around.
  This makes the `start` pointer a key part of the algorithm's logic and the reason why the value is stored there.
   It's a smart way to handle the search and the circular nature of the problem with a single variable.
         */
    }
}

