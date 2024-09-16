package OOPS.inhertiance;


public class Main {
    public static void main(String[] args) {
        // Create a Box object with custom dimensions
        Box box1 = new Box(4, 5.1, 540.58);

        // Create a BoxWeight object (inherits from Box)
        BoxWeight box3 = new BoxWeight();
        System.out.println("Box3 dimensions: " + box3.h + " " + box3.w);

        // Note: Uncomment the relevant lines to test other scenarios
    }
}

