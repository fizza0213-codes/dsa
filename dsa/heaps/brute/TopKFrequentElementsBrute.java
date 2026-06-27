// Time: O(n log n) Space: O(n)
public class TopKFrequentElementsBrute {
public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) freq.put(n, freq.getOrDefault(n, 0) + 1);
        List<Integer> keys = new ArrayList<>(freq.keySet());
        keys.sort((a, b) -> freq.get(b) - freq.get(a));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = keys.get(i);
        return result;
    }
   public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums, 2))); // [1, 2]
    }
        
}
