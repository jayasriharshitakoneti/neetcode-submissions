class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] numberOfDays = new int[temperatures.length];
        int i = 0;
        while (i < temperatures.length) {
            if (stack.isEmpty() || temperatures[stack.peek()] >= temperatures[i]) {
                stack.push(i);
                i++;
            } else {
                numberOfDays[stack.peek()] = i - stack.pop();
            }
        }
        return numberOfDays;
    }
}