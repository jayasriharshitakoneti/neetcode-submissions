class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = 0;

        while (right < s2.length()) {
            int ch = s2.charAt(right) - 'a';

            s1Count[ch]--;       

            while (s1Count[ch] < 0) {
                s1Count[s2.charAt(left) - 'a']++;
                left++;
            }

            if (right - left + 1 == s1.length()) {
                return true;
            }

            right++;
        }
        return false;
    }
}