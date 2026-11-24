class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean hasDup = false;
        for (int i = 0; i < nums.length; i++) {
            int find = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (find == nums[j]) {
                    hasDup = true;
                } 
            }
        }
        return hasDup;
    } 
}