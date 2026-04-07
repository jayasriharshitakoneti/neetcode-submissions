class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        System.out.println(sb.toString());
        for(int i=sb.length()-1;i>=0;i--){
            
            if(!(Character.isLetter(sb.charAt(i))) && !(Character.isDigit(sb.charAt(i)))){
                System.out.println(sb.charAt(i));
                sb.deleteCharAt(i);
            }
        }

        System.out.println(sb.toString());

        for(int i=0;i<sb.length()/2;i++){
            
            if(!(sb.charAt(i)==sb.charAt(sb.length()-i-1))){
                return false;
            }
        }
        return true;
    }
}