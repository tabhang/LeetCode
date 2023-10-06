import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(numMap.containsKey(comp)) {
                return new int[]{numMap.get(comp), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }

    // public int[] twoSum(int[] nums, int target) {
    //     int i=0;
    //     int j=0;
    //     for(i = 0; i < nums.length; i++) {
    //         for (j = i + 1; j < nums.length; j++) {
    //             System.out.println((nums[i] + nums[j]));
    //             if ((nums[i] + nums[j]) == target) {
    //                 int[] ans = {i,j};
    //                 return ans;
    //             }
    //         }
    //     }
    //     return {};
    // }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}