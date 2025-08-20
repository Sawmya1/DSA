class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int p1 = i+1, p2 = nums.length-1;
            while(p1<p2){
                int total = nums[p1]+nums[p2]+nums[i];
                if(total == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[p1]);
                    temp.add(nums[p2]);
                    ans.add(temp);
                    p1++;
                    p2--;
                    while(p1<p2 && nums[p1] == nums[p1-1]) p1++;
                    while(p1<p2 && nums[p2] == nums[p2+1]) p2--;
                }
                else if(total<0)
                p1++;
                else
                p2--;
            }
        }
        return ans;
    }
}