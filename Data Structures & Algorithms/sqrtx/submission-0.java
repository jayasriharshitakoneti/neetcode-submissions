class Solution {
    public int mySqrt(int x) {
        int sqrt=0;
        int i=0, j=(x/2)+1;
        int mid=(i+j)/2;
        if(x==0 || x==1){
            return x;
        }
        while(i<=j){
            mid=(i+j)/2;
            if(mid!=0 && (x/mid)>=mid){
                sqrt=Math.max(sqrt,mid);
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return sqrt;
    }
}