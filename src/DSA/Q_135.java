package DSA;

public class Q_135 {
        static int candy(int[] r) {
            int[] c = new int[r.length];
            // Giving all children 1 candy initially
            for (int i = 0; i < r.length; i++) {
                c[i] = 1;
            }

            // Traverse all elements from left to right
            for (int i = 1; i < r.length; i++) {
                if (r[i] > r[i - 1]) {
                    c[i] = c[i - 1] + 1;
                }
            }

            // Traverse all elements from right to left
            for (int i = r.length - 2; i >= 0; i--) {
                if (r[i] > r[i + 1]) {
                    c[i] = Math.max(c[i], c[i + 1] + 1);
                }
            }

            // Summing up the candies
            int sum = 0;
            for (int i = 0; i < c.length; i++) {
                sum += c[i];
            }

            return sum;
        }

    public static void main(String[] args) {
        int[] rating ={1,3,2,2,1};
        System.out.println(candy(rating));
    }
}
