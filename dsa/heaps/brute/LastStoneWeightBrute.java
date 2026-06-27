
// Time: O(n^2 log n) Space: O(n)
public class LastStoneWeightBrute {
public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int s : stones) list.add(s);
        while (list.size() > 1) {
            Collections.sort(list, Collections.reverseOrder());
            int y = list.remove(0);
            int x = list.remove(0);
            if (y != x) list.add(0, y - x);
        }
        return list.isEmpty() ? 0 : list.get(0);
    }
  public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones)); // 1
    }
}
