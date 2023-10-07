import java.util.HashMap;

public class Solution242 {

    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        for(char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        for(char ch : t.toCharArray()) {
            count[ch - 'a']--;
        }

        for (int i: count) {
            if(i!=0) {
                return false;
            }
        }
        return true;
    }



//    public boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> sMap = new HashMap<>();
//
//        if(!(s.length() == t.length())) {
//            return false;
//        }
//
//        for(int i = 0; i < s.length(); i++) {
//            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
//        }
//        for(int i = 0; i < t.length(); i++) {
//            if(sMap.containsKey(t.charAt(i)) && (sMap.get(t.charAt(i)) > 0)) {
//                sMap.put(t.charAt(i), sMap.get(t.charAt(i))-1);
//            }
//            else {
//                return false;
//            }
//        }
//        return true;
//    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
