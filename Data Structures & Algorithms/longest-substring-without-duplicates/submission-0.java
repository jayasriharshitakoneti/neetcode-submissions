class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charAttendance = new HashMap<>();

        int result = 0;
        int start = 0;
        int end = 0;

        while (start < s.length() && end < s.length()) {
            if (charAttendance.containsKey(s.charAt(end))) {
                int charAttendanceValue=charAttendance.get(s.charAt(end));
                if(start<=charAttendanceValue)
                start = charAttendanceValue+1;
            }
            charAttendance.put(s.charAt(end), end);
            end++;
            result = Math.max(end - start, result);

        }
        return result;
    }
}