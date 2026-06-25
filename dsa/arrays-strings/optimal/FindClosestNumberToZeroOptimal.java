// Time: O(n) Space: O(1)
// Optimal: same single pass but correctly handles tie -> positive number wins

public class FindClosestNumberToZeroOptimal {
public int findClosestNumber(int[] nums) {
int closest = nums[0];
int minDist = Math.abs(nums[0]);
for (int i = 1; i < nums.length; i++) {
    int dist = Math.abs(nums[i]);
    if (dist < minDist || (dist == minDist && nums[i] > closest)) {
        minDist = dist;
        closest = nums[i];
    }
}
return closest;
}
}
public static void main(String[] args) {
        int[] nums = {-4, -2, 1, 4, 8};
        System.out.println(findClosest(nums)); // 1
    }
}

