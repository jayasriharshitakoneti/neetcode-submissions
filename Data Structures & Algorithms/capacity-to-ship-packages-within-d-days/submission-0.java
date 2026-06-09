class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int maxWeight=weights[0];
        int sumOfWeights=weights[0];
        for(int i=1;i<weights.length;i++){
            maxWeight=Math.max(maxWeight,weights[i]);
            sumOfWeights+=weights[i];
        }

        int i=maxWeight, j=sumOfWeights;
        int mid=(i+j)/2;
        int capacity=sumOfWeights;

        while(i<=j){
            mid=(i+j)/2;
            int daysGuess=1;
            int sum=0;
            for(int k=0;k<weights.length;k++){
                if(weights[k]+sum<=mid){
                    sum+=weights[k];
                }else{
                    sum=weights[k];
                    daysGuess++;
                }
            }

            if(daysGuess<=days){
                capacity=Math.min(capacity,mid);
                j=mid-1;
            }else{
                i=mid+1;
            }
        }

        return capacity;

    }
}