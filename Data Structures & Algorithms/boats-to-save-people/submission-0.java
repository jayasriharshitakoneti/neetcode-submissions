class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int numberOfBoatsNeeded=0;

        int heavy=people.length-1;
        int light=0;

        while(heavy>=light){
            if(people[heavy]+people[light]<=limit){
                numberOfBoatsNeeded++;
                heavy--;
                light++;
            }else{
                heavy--;
                numberOfBoatsNeeded++;
            }
        }

        return numberOfBoatsNeeded;
    }
}