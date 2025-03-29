class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, add = 0;
        int sum =  n*(n+1)/2;
        for(int i=0;i<n;i++){
            add += nums[i];
        }
    return sum-add;
        // HashSet<Integer> num = new HashSet<Integer>();
        // for(int i=0;i<nums.length;i++){
        //     num.add(nums[i]);
        // }
        // int j=0;
        // for(;j<nums.length;j++){
        //     if(!num.contains(j))
        //     return j;
        // }
        // return j;
    }
}