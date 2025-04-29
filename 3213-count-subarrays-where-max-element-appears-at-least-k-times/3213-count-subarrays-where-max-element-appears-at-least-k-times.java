class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi=nums[0];
        for(int i=0;i<nums.length; i++){
            maxi = Math.max(nums[i], maxi);
        }
        int left = 0;
        long maxiOccurence = 0;
        long res = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == maxi) maxiOccurence++;
            while (maxiOccurence >= k) {
                if (nums[left] == maxi) maxiOccurence--;
                left++;
            }
            res += left;
        }
        return res;
    }
}