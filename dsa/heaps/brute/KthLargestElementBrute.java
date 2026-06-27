// Time: O(n log n) Space: O(1) extra
public class KthLargestElementBrute {
  public int findKthLargest(int[] nums, int k) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        return sorted[sorted.length - k];
    }
  public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2)); // 5
    }

}
