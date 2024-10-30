package DSA_Question;

public class Q_28 {
    static int strStr(String h, String n) {
        int i=0;
        int j =0;
        int c=0; // counter
        int f=-1; // to store first index
        while(i<n.length() && j<h.length()){
            if(n.charAt(i)==h.charAt(j)){
                if(f==-1){
                    f=i;
                }
                i++;
                j++;
                c++;
                if(c==n.length()){
                    break;
                }
            }else{
                f=-1; // reintaoze the first index to -1
                c=0;// making counter to 0
                i=0; // reinitize to i=0;
                j++;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        String h ="hello", needle = "ll";
        System.out.println(strStr(h, needle));
    }
}
