class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxi = Integer.MIN_VALUE, n = s.length(), len=0;
        if(n == 0)
        return 0;
        int[] h = new int[256];
        Arrays.fill(h, -1);
        while(right < n){
            if(h[s.charAt(right)] != -1){
                if(h[s.charAt(right)] >= left)
                left = h[s.charAt(right)]+1;
            }
            len = right-left+1;
            maxi = Math.max(maxi, len);
            h[s.charAt(right)] = right;
            right++;
        }   
        return maxi;    
    }
}