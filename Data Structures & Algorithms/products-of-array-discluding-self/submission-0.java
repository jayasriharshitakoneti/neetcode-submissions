class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero_count=0;
        int[] pre=new int[nums.length];
        int[] suf=new int[nums.length];
        int[] result=new int[nums.length];
        pre[0]=nums[0];
        suf[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            pre[i]=nums[i]*pre[i-1];
            suf[nums.length-i-1]=nums[nums.length-i-1]*suf[nums.length-i];
        }
        
        for(int i=1;i<nums.length-1;i++){
            result[i]=pre[i-1]*suf[i+1];
        }
        result[0]=suf[1];
        result[nums.length-1]=pre[nums.length-2];
        return result;
    }
}