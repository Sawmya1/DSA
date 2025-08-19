class Solution {
    public int reverseInt(int a){
        int b = 0, temp = a;
        while(temp != 0){
            b = b*10 + temp%10;
            temp /=10;
        }
        return b;
    }
    public boolean isPalindrome(int x) {
        boolean ans = false;
        if(x < 0)
        return ans;

        if(x == reverseInt(x))
        ans = true;
        return ans;
    }
}