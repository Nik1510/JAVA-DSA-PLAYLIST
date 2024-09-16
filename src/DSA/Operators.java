package DSA;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+ 'b');
        System.out.println("a"+"b");
        System.out.println((char) 'a'+3);


        System.out.println("a"+1);
        // Reason for this as follow :-
        // this is same as after a few steps : "a" +"1"
        // integer will be converted to Integer that will call "toString()"
        System.out.println("Nikhil"+new ArrayList<>());
        System.out.println("Nikhil"+ new Integer(25));
//        System.out.println(new Integer(56)+ new ArrayList<>());
        String ans = new Integer(56)+""+ new ArrayList<>();
        System.out.println(ans);

    }
}
