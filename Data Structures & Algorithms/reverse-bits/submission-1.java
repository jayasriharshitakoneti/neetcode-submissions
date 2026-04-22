class Solution {
    public int reverseBits(int n) {
        int result=0;
        int i=1;
        while(i<=32){
            result=result<<1;

            if((n & 1) == 1){
                result+=1;
            }
            n=n>>>1;
            i++;
        }
        return result;
    }
}