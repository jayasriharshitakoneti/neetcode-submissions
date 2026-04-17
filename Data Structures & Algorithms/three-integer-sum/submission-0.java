class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> triplet = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        Arrays.sort(nums);
        while (i < nums.length && nums[i] <= 0) {
            j = i + 1;
            k = nums.length-1;
            while (j < nums.length-1 && j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    if (!resultSet.contains(triplet)) {
                        resultSet.add(triplet);
                        result.add(triplet);
                    }
                    triplet = new ArrayList<>();
                    j++;
                    k--;
                } else if (nums[j] + nums[k] > (-1 * nums[i])) {
                    k--;
                } else {
                    j++;
                }
            }
            i++;
        }
        return result;
    }
}