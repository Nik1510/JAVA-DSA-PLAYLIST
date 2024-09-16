package OOPS.inhertiance;

public class BoxWeight extends Box {
    double weight; // Additional property specific to BoxWeight

    public BoxWeight() {
        this.w = -2; // Initialize width (from parent class)
    }

    // Copy constructor for BoxWeight
    BoxWeight(BoxWeight other) {
        super(other); // Call parent class's copy constructor
        weight = other.weight; // Initialize weight
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // Call parent class's custom dimensions constructor
        this.weight = weight; // Initialize weight
    }
    public BoxWeight(double side ,double weight) {
        super(side); // Call parent class's custom dimensions constructor
        this.weight = weight; // Initialize weight
    }
}

