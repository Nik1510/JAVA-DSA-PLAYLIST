package DSA;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series= series+ch;
        }
        System.out.println(series);
        // the problem in string is that it is immutable
        // so once the string is created it is stored but
        // the line which is pointing to the string changes
        // but the pervious string which is created is not in any use
        // so there is a lot of memory wastage
        // time complex city :- O(n^2)
    }
}
