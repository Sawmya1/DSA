class Solution {
    public int maximumGain(String s, int x, int y) {
        int maxVal = x;
        int minVal = y;

        int maxCharCount = 0;
        int minCharCount = 0;

        int maxChar = 'a';
        int minChar = 'b';

        int score = 0;

        if(y>x){
            maxChar = 'b';
            minChar = 'a';

            maxVal = y;
            minVal = x;
        }
        for(int i=0;i<s.length();i++){
            char currChar = s.charAt(i);
            if(currChar == maxChar)
            maxCharCount++;
            else if(currChar == minChar){
                if(maxCharCount > 0){
                score += maxVal;
                maxCharCount--;
                }
                else
                minCharCount++;
            }
            else{
                score += Math.min(maxCharCount, minCharCount)*minVal;
                maxCharCount = 0;
                minCharCount = 0;
            }
        }
            score += Math.min(maxCharCount, minCharCount)*minVal;
            return score;
    }
}