class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        int flag=-1;
        for(int i=0;i<groups.length;i++){
            if(groups[i]!=flag){
                ans.add(words[i]);
                flag = groups[i];
            }
        }
        return ans;
    }
}