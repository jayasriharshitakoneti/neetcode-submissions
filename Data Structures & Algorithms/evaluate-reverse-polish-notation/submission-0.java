class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> expression = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int number1 = expression.pop();
                int number2 = expression.pop();
                expression.push(number2 + number1);

            } else if (tokens[i].equals("-")) {
                int number1 = expression.pop();
                int number2 = expression.pop();
                expression.push(number2 - number1);
            } else if (tokens[i].equals("*")) {
                int number1 = expression.pop();
                int number2 = expression.pop();
                expression.push(number2 * number1);
            } else if (tokens[i].equals("/")) {
                int number1 = expression.pop();
                int number2 = expression.pop();
                expression.push(number2 / number1);
            } else {
                expression.push(Integer.parseInt(tokens[i]));
            }
        }
        return expression.pop();
    }
}