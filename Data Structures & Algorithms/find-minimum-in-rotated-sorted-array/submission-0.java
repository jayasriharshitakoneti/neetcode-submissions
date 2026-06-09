class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }

        int min=nums[0];

        int i=0, j=nums.length-1;
        int mid=(i+j)/2;

        while(i<j){
            mid=(i+j)/2;
            if(nums[mid]>nums[j]){
                i=mid+1;
            }else if(nums[mid]<nums[j]){
                j=mid;
            }else{
                break;
            }
        }
        return nums[j];
    }
}