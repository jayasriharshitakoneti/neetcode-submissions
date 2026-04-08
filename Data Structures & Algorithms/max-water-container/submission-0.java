class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=0;

        while(start<end){
            int length=0;
            int min_of_both=Math.min(height[start],height[end]);
            
            max=Math.max(max,min_of_both*(end-start));
            if(min_of_both==height[start]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}