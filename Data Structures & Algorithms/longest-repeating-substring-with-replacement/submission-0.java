class Solution {

    private int max(int counts[]) {
        int max = counts[0];
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
            }
        }
        return max;
    }

    public int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        int start = 0;
        int end = 0;
        int result = 0;

        while (end < s.length() && start <= end) {
            counts[s.charAt(end) - 65]++;
            end++;

            if ((end - start) - max(counts) > k) {
                counts[s.charAt(start) - 65]--;
                start++;
            }
            result = Math.max(result, end - start);

        }

        return result;
    }
}