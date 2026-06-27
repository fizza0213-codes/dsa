
// Time: O(n log k) Space: O(k)
public class KthLargestElementOptimal {
  public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
  public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(new KthLargestElementOptimal().findKthLargest(nums, 2)); // 5
    }

}
