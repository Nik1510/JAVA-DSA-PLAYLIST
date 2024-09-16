package OOPS.Cloning;

import java.util.Arrays;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(34, "Kunal kushwaha");
//        Human twin = new Human(kunal);

        Human twin = (Human)kunal.clone();
        System.out.println(twin.age+" "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] =100;
        // this is swallow copy
//        System.out.println(Arrays.toString(kunal.arr));
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));

    }
}
