package DSA_Recursion_Arrays;
import java.util.ArrayList;


public class Find {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
//        System.out.println(find(arr, 4, 0));

        int[] arr1 = {2, 3, 1, 8, 4, 5};
//        System.out.println(find(arr1, 4, 0));

//        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndex(arr1, 4, 0));


//        System.out.println(findIndexLast(arr, 4, arr.length-1));
//        findAllIndex(arr, 4, 0);
//        System.out.println(list);

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
//        System.out.println(ans);
//        System.out.println(list);
//
//     System.out.println(findAllIndex2(arr, 4, 0));


    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    // this function call is very important --> try to understand <---
    //  this is better approach hence use it
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
 // this function call is very important --> try to understand <---
//    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        if (index == arr.length) {
//            return list;
//        }
//
//        // this will contain answer for that function call only (IMPORTANT)
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
//
//        list.addAll(ansFromBelowCalls);
//
//        return list;
//    }


}