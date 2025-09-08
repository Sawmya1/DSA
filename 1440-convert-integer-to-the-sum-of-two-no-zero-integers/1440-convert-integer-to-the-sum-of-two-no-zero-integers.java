class Solution {
    boolean isContainZero(int a){
        for(int i=0;i<a;i++){
        int temp = a%10;
        if(temp == 0)
        return true;
        a /= 10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        int a = n-1, b = 1;
        while(isContainZero(a) || isContainZero(b)){
            a--;
            b++;
        }
        ans[0]=b;
        ans[1]=a;
        return ans;

    }
}