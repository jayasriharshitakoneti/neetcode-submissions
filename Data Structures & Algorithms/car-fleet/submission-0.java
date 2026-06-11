class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Integer> stack = new Stack<>();
        int fleet = 0;

        int[][] pairs = new int[position.length][2];

        for (int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));

        int i = 0;
        while (i < position.length) {

            if (stack.isEmpty()) {
                fleet++;
                stack.push(i);
            } else {
                if (((float)(target - pairs[stack.peek()][0]) / pairs[stack.peek()][1]) >= ((float)(target - pairs[i][0])
                        / pairs[i][1])) {
                    pairs[i][1] = pairs[stack.peek()][1];
                } else {
                    fleet++;
                    stack.pop();
                    stack.push(i);
                }
            }

            i++;
        }

        return fleet;

    }
}