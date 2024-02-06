import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution17 {

    private static final Map<Character, String> mapping = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz");

    public static List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        backtrack( res,0, "", digits);
        return res;
    }

    private static void backtrack(List<String> res, int i, String currStr, String digits) {
        if (currStr.length() == digits.length()) {
            res.add(currStr);
        } else {
            String charMap = mapping.get(digits.charAt(i));
            for (char c : charMap.toCharArray()){
                backtrack(res, i + 1, currStr + c, digits);
            }
        }
    }

    public static void main(String[] args) {
        String digits = "";
        System.out.println(letterCombinations(digits));
    }
}
