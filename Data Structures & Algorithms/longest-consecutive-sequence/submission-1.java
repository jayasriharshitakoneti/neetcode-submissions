class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        int max_length = 0;
        int curr_length = 0;
        for (int i:hs) {
            if (!hs.contains(i - 1)) {
                curr_length = 1;
                int j = i;
                while (hs.contains(j + 1)) {
                    curr_length++;
                    j++;
                }
                max_length = Math.max(curr_length, max_length);
            }
        }
        return max_length;
    }
}