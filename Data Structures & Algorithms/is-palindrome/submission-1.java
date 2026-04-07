class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;

        while(start<end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }else{
                char left=Character.toLowerCase(s.charAt(start));
                char right=Character.toLowerCase(s.charAt(end));

                if(left!=right){
                    return false;
                }
                start++;
                end--;
            }

        }

        return true;
    }
}