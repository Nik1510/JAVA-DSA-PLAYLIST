package OOPS.inhertiance;

class Box {
    private double l; // Length (private to restrict direct access)
    double h; // Height
    double w; // Width

    static void greeting(){
        System.out.println("Hey, I am in Box. Greeting ");
    }
    // Default constructor
    Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    // Cube constructor
    Box(double side) {
        this.h = side;
        this.w = side;
        this.l = side;
    }

    // Custom dimensions constructor
    Box(double length, double height, double width) {
        this.h = height;
        this.w = width;
        this.l = length;
    }

    // Copy constructor
    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
    }

    public void displayInfo() {
        System.out.println("Running the box");
    }
}
