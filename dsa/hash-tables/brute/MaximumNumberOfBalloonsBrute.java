
// Time: O(n)  Space: O(1)
public class MaximumNumberOfBalloonsBrute {
  public int maxNumberOfBalloons(String text) {
        int countB = 0, countA = 0, countL = 0, countO = 0, countN = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'b') countB++;
            if (c == 'a') countA++;
            if (c == 'l') countL++;
            if (c == 'o') countO++;
            if (c == 'n') countN++;
        }
        int maxBalloons = countB;
        maxBalloons = Math.min(maxBalloons, countA);
        maxBalloons = Math.min(maxBalloons, countL / 2);
        maxBalloons = Math.min(maxBalloons, countO / 2);
        maxBalloons = Math.min(maxBalloons, countN);
        return maxBalloons;
    }
  public static void main(String[] args) {
        MaximumNumberOfBalloonsBrute sol = new MaximumNumberOfBalloonsBrute();
        System.out.println(sol.maxNumberOfBalloons("nlaebolko")); // 1
        System.out.println(sol.maxNumberOfBalloons("loonbalxballoon")); // 2
    }

}
