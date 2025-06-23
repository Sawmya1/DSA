class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo=0, hi=nums.length-1, ans=nums.length;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target <= nums[mid]){
                ans = mid;
                hi = mid-1;
            }else
            lo = mid+1;
        }
        return ans;
    }
}