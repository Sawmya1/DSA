class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        int lastSeen = nums[nums.length - 1];
        int sum = lastSeen;
        for (int i = nums.length - 2; i >= 0; i--) {
            int current = nums[i];
            if (current <= 0) return sum; // \U0001f6ab Ignore non-positives
            if (current != lastSeen) sum += current; // ✅ Add if unique
            lastSeen = current;
        }
        return sum;
    }
}