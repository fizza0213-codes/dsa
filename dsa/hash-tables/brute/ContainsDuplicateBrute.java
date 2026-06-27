
// Time: O(n^2)  Space: O(1)
public class ContainsDuplicateBrute {
  public boolean containsDuplicate(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] == sorted[i-1]) return true;
        }
        return false;
    }
   public static void main(String[] args) {
        ContainsDuplicateBrute sol = new ContainsDuplicateBrute();
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,1})); // true
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,4})); // false
    }

}
