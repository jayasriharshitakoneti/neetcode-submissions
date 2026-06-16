class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        while (i < asteroids.length) {
            if (stack.isEmpty() || asteroids[i] * stack.peek() > 0) {
                stack.push(asteroids[i]);
                i++;
            } else if (asteroids[i]>0 && stack.peek()<0) {
                stack.push(asteroids[i]);
                i++;
            } else if (Math.abs(asteroids[i]) > stack.peek()) {
                stack.pop();
            } else if (Math.abs(asteroids[i]) < stack.peek()) {
                i++;
            } else if (Math.abs(asteroids[i]) == stack.peek()) {
                stack.pop();
                i++;
            }
        }

        int[] result = new int[stack.size()];

        for (i = stack.size() - 1; i > -1; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}