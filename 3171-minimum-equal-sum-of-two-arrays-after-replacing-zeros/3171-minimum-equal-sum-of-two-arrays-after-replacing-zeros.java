class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long n1=0, n2=0, sum1=0, sum2=0;
        for(int i=0;i<nums1.length; i++){
            sum1+=nums1[i];
            if(nums1[i]==0)
            n1++;
        }
        for(int i=0;i<nums2.length; i++){
            sum2+=nums2[i];
            if(nums2[i]==0)
            n2++;
        }
        long min1 = sum1 + n1;
        long min2 = sum2 + n2;

        if(n1 == 0 && n2 == 0){
            if(sum1 == sum2)
             return sum1;
            else return -1;
        }else if(n1 == 0){
            if(sum2 + n2 <=sum1)
            return sum1;
            else return -1;
        }else if (n2 == 0){
            if(sum1 + n1 <= sum2)
            return sum2;
            else return -1;
        }
        return Math.max(min1, min2);
    }
}