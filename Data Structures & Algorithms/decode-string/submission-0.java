class Solution {

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String decodeString(String s) {
        String result = "";
        Stack<String> stack = new Stack<>();

        int i = 0;
        String temp = "";
        while (i < s.length()) {
            if (Character.isLetter(s.charAt(i))) {
                temp += s.charAt(i);
                i++;
            } else if (Character.isLetterOrDigit(s.charAt(i))) {
                String tempNumber = "";
                while (i < s.length() && Character.isLetterOrDigit(s.charAt(i))) {
                    tempNumber += s.charAt(i);
                    i++;

                }

                stack.push(temp);
                temp = "";
                stack.push(tempNumber);

            } else if (s.charAt(i) == ']') {
                if (temp.length() > 0) {
                    stack.push(temp);
                    temp = "";
                }
                String now = "";
                while (!isNumeric(stack.peek())) {
                    now = stack.pop()+now;
                }

                int popTill = Integer.parseInt(stack.pop());
                String tempNow = "";
                for (int j = 0; j < popTill; j++) {
                    tempNow += now;
                }
                stack.push(tempNow);
                i++;
            } else {
                i++;
            }

        }

        while (!stack.isEmpty()) {

            result = stack.pop()+result;

        }

        if (temp.length() > 0) {
            result += temp;
        }
        return result;
    }
}