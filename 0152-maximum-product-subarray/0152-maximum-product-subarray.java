class Solution {
    public int maxProduct(int[] arr) {
        int pre = 1, suff = 1, maxi = Integer.MIN_VALUE, n = arr.length;
        for(int i=0;i<n;i++){
            if(pre == 0)
            pre = 1;
            if(suff == 0)
            suff = 1;
            pre *= arr[i];
            suff *= arr[n-i-1];
            maxi = Math.max(maxi, Math.max(pre, suff));
        }
        return maxi;
    }
}