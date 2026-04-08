class Solution {
    public int check_number(int[] numbers,int start,int end, int target){

        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(numbers[mid]==target){
            return mid;
        }else if(numbers[mid]<target){
            return check_number(numbers,mid+1,end,target);
        }else{
            return check_number(numbers,start,mid-1,target);
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        int find_right=-1;
        for(int i=0;i<numbers.length-1;i++){
            int check_num=target-numbers[i];
            System.out.println(check_num);
            
            find_right=check_number(numbers,i+1,numbers.length-1,check_num);
            if(find_right!=-1){
                return new int[]{i+1,find_right+1};
            }
            
        }
        
        return null;
    }
}