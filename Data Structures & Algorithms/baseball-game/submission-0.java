class Solution {
    public int calPoints(String[] operations) {
        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                stack.add(stack.get(stack.size() - 1) + stack.get(stack.size() - 2));
            } else if (operations[i].equals("D")) {
                stack.add(stack.get(stack.size() - 1) * 2);
            } else if (operations[i].equals("C")) {
                stack.remove(stack.size() - 1);
            } else {
                stack.add(Integer.parseInt(operations[i]));
            }
        }

        int result = 0;

        for (int i = 0; i < stack.size(); i++) {
            result += stack.get(i);
        }
        return result;
    }
}