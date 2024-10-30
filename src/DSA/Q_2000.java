package DSA;

public class Q_2000 {
    static String reversePrefix(String word, char ch) {
        int l = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                break;
            }
            l++;
        }
        char [] charArray = word.toCharArray();
        int left = 0;
        int right = l ;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("Nikhil", 'k'));
    }
}
