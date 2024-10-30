package DSA;

public class Q_881 {
    static int numRescueBoats(int[] people, int limit) {
        // each boat carrys 2 people
        // sum of weight of two people is <=limit
        // no. of boats required
        int count = 0;
        int boat = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i] >= limit) {
                boat++;
            } else {
                count++;
                if (i < people.length - 1 && people[i] + people[i + 1] <= limit) {
                    count++;
                    i++;
                }
                boat++;
                count = 0;
            }
        }

        return boat;

    }
    public static void main(String[] args) {
        int[] nums ={3,5,3,4};
        System.out.println(numRescueBoats(nums,5));
    }
}
