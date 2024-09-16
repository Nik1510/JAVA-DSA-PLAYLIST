package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class mulltiAlL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        /*
        The line of code you’re asking about is in Java.
         It’s creating a data structure known as a “2D ArrayList”.
        Here’s a breakdown:

        ArrayList<Integer>: This is an ArrayList that can hold elements of type Integer.
         An ArrayList is a resizable array, which can be found in the java.util package.

         ArrayList<ArrayList<Integer>>: This is an ArrayList whose elements are themselves ArrayLists that hold Integers.
          This is essentially a 2D ArrayList.

                new ArrayList<>(): This is creating a new instance of an ArrayList.
         */
        /*
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        is declaring and initializing a 2D ArrayList named list
        */
        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                list.get(i).add(in.nextInt());
            }
            System.out.println(list);
        }
    }
}
