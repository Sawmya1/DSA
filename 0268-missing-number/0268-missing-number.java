class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> num = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
        }
        int j=0;
        for(;j<nums.length;j++){
            if(!num.contains(j))
            return j;
        }
        return j;
    }
}