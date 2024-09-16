/*
package DSA_Question_Bit_Wise;

public class GoggleQuestion_Leetcode_832 {
    public static void main(String[] args) {
        int[][] image = {[1, 1, 0],
                         [1,0,1],
                        [0,0,0]};
        System.out.println(flipAndInvertImage(image));
    }
    static int[][] flipAndInvertImage(int[][] image){
        fot(int[] row : image){
            // reverse this array

            for (int i = 0; i <(image[0].length +1)/2; i++) {
                // swap
                int temp = row[i] ^1;
                row[i] = row[image[0].length-i-1];
                row[image[0].length-i-1] = temp];

            }
        }
        return image;
    }
}

 */

package DSA_Question_Bit_Wise;

public class GoggleQuestion_Leetcode_832 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0},
                {1,0,1},
                {0,0,0}};
        flipAndInvertImage(image);
        for(int[] row : image){
            for(int pixel : row){
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
    static int[][] flipAndInvertImage(int[][] image){
        for(int[] row : image){
            // reverse this array
            for (int i = 0; i <(row.length +1)/2; i++) {
                // swap
                int temp = row[i] ^1;
                row[i] = row[row.length-i-1] ^1;
                row[row.length-i-1] = temp;
            }
        }
        return image;
    }
}
