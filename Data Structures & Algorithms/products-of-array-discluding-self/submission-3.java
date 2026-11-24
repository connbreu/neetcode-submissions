class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] sol = new int[n];

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            sol[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            sol[i] *= suffix;
            suffix *= nums[i];
        }
        return sol;
    }
}  
