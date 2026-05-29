class Solution {
    public int search(int[] nums, int target) {
        int mid=0;
        int first=0;
        int last = nums.length;
        int count=0;
        while(count<=nums.length/2){
            mid=(first+last)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                first=mid;
            }else{
                last=mid;
            }
            count++;
        }
        return -1;
    }
}