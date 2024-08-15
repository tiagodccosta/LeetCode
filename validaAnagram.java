import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        if(Arrays.equals(s1, t1)) {
            return true;
        } else {
            return false;
        }
    }
}