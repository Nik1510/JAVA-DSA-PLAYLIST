package DSA;

public class Q_11 {
    public static void main(String[] args) {
        int[] arr ={1,2,1};
        System.out.println(maxArea(arr));
    }
        static public int maxArea(int[] h) {
            int i = 0 ;
            int j = h.length-1 ;
            int water = 0 ;

            while(j > i)
            {
                if(h[i] > h[j])
                {
                    water = Math.max((j-i)*h[j] , water) ;
                    j-- ;
                }
                else
                {
                    water = Math.max((j-i)*h[i] , water) ;
                    i++ ;
                }
            }
            return water ;
        }

}
