import java.util.*;


class Q_1389 {
    static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int[] target = new int[nums.length];
        for(int i = 0; i < n; i++) {
            list.add(index[i], nums[i]);
        }

        for(int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        int [] nums ={0,1,2,3,4};
        int [] index = {0,1,2,2,1};
//        nums = [0,1,2,3,4];
      //  index = [0,1,2,2,1];
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
}
