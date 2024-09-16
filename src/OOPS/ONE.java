// Define a package named OOPS.
package OOPS;

// Import necessary classes.
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

// Define a public class named ONE.
public class ONE {
    // The main method where the program execution begins.
    public static void main(String[] args) {
        // Initialize an array to store 5 roll numbers.
        int[] numbers = new int[5];

        // Initialize an array to store 5 names.
        String[] names = new String[5];

        // Initialize arrays to store data of 5 students: roll number, name, and marks.
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // Create an array to hold 5 Student objects.
        Student[] students = new Student[5];
        // Using 'new' to create an object of the Student class.
        Student student = new Student();
        // 'new' allocates memory for a Student object and calls its constructor.


        // Create Student objects with specific details.
        Student kunal = new Student(15, "Kunal Kushwaha", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);

        // Print details of the student 'kunal'.
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        // Create a new Student object by copying details from 'kunal'.
        Student random = new Student(kunal);
        System.out.println(random.name);

        // Create a new Student object using the default constructor.
        Student random2 = new Student();
        System.out.println(random2.name);

        // Demonstrate that two references can point to the same object.
        Student one = new Student();
        Student two = one;
        one.name = "Something something";
        System.out.println(two.name); // This will print "Something something".
    }
}

// Define the Student class to represent individual students.
class Student {
    // Properties of the Student class.
    int rno;
    String name;
    float marks = 90; // Default value for marks.

    // Method to print a greeting message using the student's name.
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    // Method to change the student's name.
    void changeName(String name) {
        this.name = name;
    }

    // Constructor to create a new Student object by copying another Student object.

    /*
    The "this" keyword in Java is used for several important reasons:

            To Refer to the Current Object: this is a reference to the current object, the one that is being manipulated or whose constructor or method is being invoked.
            To Access Class Attributes: It’s used to access the class attributes (variables) when they are shadowed by method or constructor parameters.
            To Invoke Class Methods: Similar to accessing attributes, this can be used to call other methods of the class.
            To Use as a Constructor Call: You can use this to call one constructor from another within the same class.
     */

    // Constructor to create a new Student object by copying another Student object.
    // 'this' is used here to refer to the current object's attributes.
    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // Default constructor that sets default values.
    // Default constructor that sets default values.
    // 'this' is used to call another constructor within the same class.
    Student() {
        // Call another constructor with default values.
        this(13, "default person", 100.0f);
    }

    // Constructor that initializes a new Student object with specific values.
    // Constructor that initializes a new Student object with specific values.
    // 'this' is used to differentiate the class attributes from the parameters.
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
