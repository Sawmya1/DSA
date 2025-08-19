class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = 0;
        long res = 0, total = 0;

        while (right < nums.length) {
            total += nums[right];

    //Use a while loop to adjust the window size to maximize the window length without exceeding k.
            while (nums[right] * (right - left + 1L) > total + k) {
                total -= nums[left]; //Remove the element at position left from the window.
                left += 1; //Increment i to make the window smaller
            }

            res = Math.max(res, right - left + 1L); //Update the maximum window length.
            right += 1;
        }

        return (int) res;        
    }
}