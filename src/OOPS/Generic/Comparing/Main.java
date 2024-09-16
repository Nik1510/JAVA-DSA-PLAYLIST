package OOPS.Generic.Comparing;

import DSA.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12,93.5f);
        Student rahul = new Student(5,99.5f);
        Student arpit = new Student(2,95.5f);
        Student karan = new Student(13,77.5f);
        Student sachin = new Student(9,96.5f);

        Student[] list = {kunal, rahul , arpit, karan , sachin};


        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if (kunal.compareTo(rahul)<0){
            System.out.println(kunal.compareTo(rahul));
            System.out.println("Rahul has more marks ");
        }

    }
}
