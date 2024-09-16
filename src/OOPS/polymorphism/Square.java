package OOPS.polymorphism;

public class Square extends Shapes {
    //  this will run when the obj of Circle is created
    // hence it will be overridden
    @Override
    void area() {
        System.out.println("Area l* b");
    }
}
