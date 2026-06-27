
// Time: O(n) Space: O(n)
public class ContainsDuplicateOptimal {
   public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }
  public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums)); // true
    }

}
