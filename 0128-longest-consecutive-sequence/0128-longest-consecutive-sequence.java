class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length, longest = 1;
        if(n == 0)
        return 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int it : set){
            if(!set.contains(it-1)){
                int x=it, cnt=1;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest = Math.max(cnt, longest);
            }
        }
        return longest;
    }
}