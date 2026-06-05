class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderOfAlpha=new int[26];
        for(int i=0;i<order.length();i++){
            orderOfAlpha[order.charAt(i)-'a']=i;
        }
        for(int i=0;i<words.length-1;i++){
            String word1=words[i];
            String word2=words[i+1];
            for(int j=0;j<word1.length();j++){
                if(j>=word2.length()){
                    return false;
                }
                if(orderOfAlpha[word2.charAt(j)-'a']<orderOfAlpha[word1.charAt(j)-'a']){
                    return false;
                }else if(orderOfAlpha[word2.charAt(j)-'a']>orderOfAlpha[word1.charAt(j)-'a']){
                    break;
                }
            }
        }
        return true;
    }
}