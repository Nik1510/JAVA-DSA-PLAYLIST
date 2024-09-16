package DSA_Question;

public class Q_2843 {
    public static void main(String[] args) {
        System.out.println(countSymmetricIntegers(1200,1230));

    }
    static  int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i =low; i<=high ;i++){
            int sumL =0;
            int sumR =0;
            int n = (int)Math.log10(i)+1;// number of digit
            if (n%2==0){
                int half = n/2;
                int  digitL = (int) (i % (Math.pow(10, half)));
                int digitR =  (int)(i / (Math.pow(10, half)));
                while (digitL != 0 || digitR != 0) {
                    if (digitL != 0) {
                        sumL += digitL % 10;
                        digitL /= 10;
                    }
                    if (digitR != 0) {
                        sumR += digitR % 10;
                        digitR /= 10;
                    }
                }
                if (sumL == sumR) {
                    c++;
                }
            }
        }
        return c;
    }
    static int countSymmetricIntegers2(int low, int high) {
        int c = 0;
        for (int i = low; i <= high; i++) {
            int sumL = 0;
            int sumR = 0;
            int n = (int) Math.log10(i) + 1; // number of digits
            if (n % 2 == 0) { // Check if the number of digits is even
                int half = n / 2;
                int digitL = (int) (i % Math.pow(10, half));
                int digitR = (int) (i / Math.pow(10, half));
                while (digitL != 0 || digitR != 0) {
                    if (digitL != 0) {
                        sumL += digitL % 10;
                        digitL /= 10;
                    }
                    if (digitR != 0) {
                        sumR += digitR % 10;
                        digitR /= 10;
                    }
                }
                if (sumL == sumR) {
                    c++;
                }
            }
        }
        return c;
    }
}
