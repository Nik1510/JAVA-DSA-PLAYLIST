package DSA;

public class Smallest_Letter_Greater_than_Target {
    public static void main(String[] args) {

    }
    // return the index of smallest no>= target
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int start =0;
            int end = letters.length-1;

            while(start<=end){
                // find the middle element
                int mid = start+(end -start)/2;

                if (target <letters[mid]){
                    end = mid-1;
                } else  {
                    start = mid +1;
                }
            }
            return letters[start% letters.length];
        }

    }

}
