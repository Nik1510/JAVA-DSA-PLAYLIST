import java.util.Scanner;

class BinarySearch {
    private int[] arr;
    private int size;
    private int valueToSearch;

    public BinarySearch(int size, int valueToSearch) {
        this.size = size;
        this.valueToSearch = valueToSearch;
        arr = new int[size];
    }

    public void fillArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void sortArray() {
        // Implement your sorting logic here (e.g., using Arrays.sort or any other sorting algorithm)
        // For simplicity, let's assume the array is already sorted.
    }

    public int binarySearch() {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == valueToSearch) {
                return mid; // Value found at index 'mid'
            } else if (arr[mid] < valueToSearch) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Value not found
    }

    public void displayResult() {
        int position = binarySearch();
        if (position != -1) {
            System.out.println("Value found at index " + position);
        } else {
            System.out.println("Value not found in the array.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.print("Enter the value to be searched: ");
        int value = sc.nextInt();

        BinarySearch obj = new BinarySearch(size, value);
        obj.fillArray();
        obj.sortArray(); // Assuming the array is already sorted
        obj.displayResult();
    }
}
