package Know_about_ArrayList;

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
                // Create an ArrayList
                ArrayList<String> cars = new ArrayList<>();

                // Add elements to the ArrayList
                cars.add("Volvo");
                cars.add("BMW");
                cars.add("Ford");
                cars.add("Mazda");

                // Get the element at index 0
                String car = cars.get(0);

                // Set the element at index 0
                cars.set(0, "Toyota");

                // Remove the element at index 2
                cars.remove(2);

                // Get the size of the ArrayList
                int size = cars.size();

                // Check if the ArrayList is empty
                boolean isEmpty = cars.isEmpty();

                // Check if the ArrayList contains the element "BMW"
                boolean contains = cars.contains("BMW");

                // Get the index of the first occurrence of the element "Mazda"
                int indexOfMazda = cars.indexOf("Mazda");

                // Get the index of the last occurrence of the element "Ford"
                int lastIndexOfFord = cars.lastIndexOf("Ford");

                // Print the ArrayList
                for (String c : cars) {
                    System.out.println(c);
                }
    }
}
