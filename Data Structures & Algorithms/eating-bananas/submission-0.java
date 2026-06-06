class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxInList = piles[0];
        for (int i = 0; i < piles.length; i++) {
            maxInList = Math.max(maxInList, piles[i]);
        }

        int i = 1;
        int j = maxInList;
        int result = maxInList;
        int mid = (i + j) / 2;

        while (i <= j) {
            mid = (i + j) / 2;
            long sumInPiles = 0;
            for (int k = 0; k < piles.length; k++) {

                if (piles[k] % mid!=0) {
                    sumInPiles += ((piles[k] / mid) + 1);
                } else {
                    sumInPiles += piles[k] / mid;
                }

            }
            if (sumInPiles > h) {
                i = mid + 1;
            } else {
                result = Math.min(result, mid);
                j = mid - 1;
            }
        }
        return result;
    }
}