package DSA;

import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        String name = "Nikhil kumar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(" Nikhil               ".strip());
        System.out.println(Arrays.toString(name.split("  ")));
    }
}
