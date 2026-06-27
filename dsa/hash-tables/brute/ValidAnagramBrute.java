// Time: O(n log n)  Space: O(n)
public class ValidAnagramBrute {
  public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArr = s.toCharArray(), tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
  public static void main(String[] args) {
        ValidAnagramBrute sol = new ValidAnagramBrute();
        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
        System.out.println(sol.isAnagram("rat", "car"));         // false
    }

}
