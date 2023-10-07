import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution217 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numMap = new HashSet<>();
        for (Integer num : nums) {
            if (numMap.contains(num)) {
                return true;
            }
            numMap.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
