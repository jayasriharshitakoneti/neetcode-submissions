class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() == 1) {
            return false;
        }

        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                if (s.charAt(i) == ')') {
                    char top = stack.pop();
                    if (top != '(') {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    char top = stack.pop();
                    if (top != '[') {
                        return false;
                    }
                } else {
                    char top = stack.pop();
                    if (top != '{') {
                        return false;
                    }
                }
            }
            i++;

        }
        if (stack.size() == 0)
            return true;
        return false;
    }
}