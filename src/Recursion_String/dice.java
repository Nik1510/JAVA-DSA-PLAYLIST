package Recursion_String;

import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceRet("",4));
//      diceFaces("",4,7);
    }



    static void diceFaces(String p, int target, int faces) {
        // Base case: If the target sum is zero, print the current sequence
        if (target == 0) {
            System.out.println(p);
            return;
        }
        // Recursive case: Iterate through all possible outcomes of rolling a die
        for (int i = 1; i <= faces && i <= target; i++) {
            diceFaces(p + i, target - i, faces);
        }
    }



    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> diceRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
           list.addAll (diceRet(p + i, target - i));
        }
        return list;
    }
}
