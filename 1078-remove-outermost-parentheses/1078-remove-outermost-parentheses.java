class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder(); // use StringBuilder for better performance
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (c > 0) ans.append(ch);
                c++;
            } else if (ch == ')') {
                c--;
                if (c > 0) ans.append(ch);
            }
        }
        return ans.toString();
    }
}
