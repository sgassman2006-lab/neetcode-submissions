class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = nums.length / 2;
        while (left <= right) {
            if (nums[middle] > target) {
                right = middle - 1;
                middle = (left + right) / 2;
            } else if (nums[middle] < target) {
                left = middle + 1;
                middle = (left + right) / 2;
            } else 
                return middle;
        }
        return -1;
    }
}
