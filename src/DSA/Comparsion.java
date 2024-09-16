package DSA;

import java.lang.ref.SoftReference;

public class Comparsion {
    public static void main(String[] args) {
        String a = " Nikhil";
        String b = " Nikhil";
        String c = a;
        // = =
        System.out.println(a== b);

        String name1 = new String("Nikhil");
        String name2 = new String("Nikhil  ");
//        Creating two different objects
//        System.out.println(name1==name2);
//          only checking the values of two objects
        System.out.println(name1.equals(name2));


        System.out.println(name1.charAt(0));
        }

}
