// Time: O(n) Space: O(n)
public class SummaryRangesOptimal {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length, i = 0;
        while (i < n) {
            int start = nums[i];
            while (i + 1 < n && nums[i+1] == nums[i] + 1) i++;
            int end = nums[i];
            result.add(start == end ? String.valueOf(start) : start + "->" + end);
            i++;
        }
        return result;
    }
}

public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums)); // [0->2, 4->5, 7]
    }
}
