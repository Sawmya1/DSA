class Solution {
    public int reverse(int x) {
        long ans = 0, temp = x;
        while(temp != 0){
            ans = ans*10 + temp%10;
            temp = temp/10;
        }
        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
    }
}