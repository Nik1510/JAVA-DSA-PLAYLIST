package DSA_Question;

public class Q_744 {
    public static void main(String[] args) {
        // Input: letters = ["c","f","j"], target = "a"
        // Output: "c"
        char[] letters = {'a', 'f', 'j'};
        char target = 'f';
        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;
            // Move the end pointer if target is less than the middle element
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                // Move the start pointer if target is greater than or equal to the middle element
                start = mid + 1;
            }
        }
        // Return the smallest element greater than the target
        return letters[start % letters.length];
    }

}
