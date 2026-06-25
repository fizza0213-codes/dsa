
// Time: O(n^2) Space: O(n)
public class SummaryRangesBrute {
    public List<String> summaryRanges(int[] nums) {
               List<String> result = new ArrayList<>();
        int n = nums.length;
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (used[i]) continue;
            int start = nums[i], end = nums[i];
            used[i] = true;
            boolean extended = true;
            while (extended) {
                extended = false;
                for (int j = 0; j < n; j++) {
                    if (!used[j] && nums[j] == end + 1) {
                        end = nums[j];
                        used[j] = true;
                        extended = true;
                    }
                }
            }
            result.add(start == end ? String.valueOf(start) : start + "->" + end);
        }
        return result;     
    }
}
 public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums)); // [0->2, 4->5, 7]
    }
}


