class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new LinkedHashSet<Integer>();

        int i = 0;
        boolean dupl = false;
        while (i < nums.length && !dupl) {
            
            if (numSet.contains(nums[i])) {
                dupl = true;
            }
            numSet.add(nums[i]);

            i++;
        }

        return dupl;
    }
}