package Leetcode_Problems;

public class reverse_a_2D_array {
    public static void main(String[] args) {

        int [][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for(int i=0 ; i<a.length;i++)
        {
            for(int j=0 ; j<a.length;j++)
            {
                System.out.print(a[i][j]+",");
            }
            System.out.println();

        }
        System.out.println("***************************");
        for (int i=0 ; i<a.length;i++)
        {
            for(int j=a.length-1 ; j>=0;j--)
            {
                System.out.print(a[i][j]+",");
            }
            System.out.println();
        }
    }
}
