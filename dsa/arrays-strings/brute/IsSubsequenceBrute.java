// Time: O(n*m) Space: O(1)
public class IsSubsequenceBrute {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        int tStart = 0;
        for (int i = 0; i < sLen; i++) {
            boolean found = false;
            for (int j = tStart; j < tLen; j++) {
                if (t.charAt(j) == s.charAt(i)) {
                    found = true;
                    tStart = j + 1;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }
}
public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc")); // true
    }
}

