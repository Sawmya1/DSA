class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<Character>();
        for(char i : s.toCharArray()){
            if(i == '(' || i == '{' || i == '[')
            sc.push(i);
            else{
                if(sc.isEmpty()) return false;
                char n = sc.pop();
                if((i==')' && n=='(') || (i=='}' && n=='{') || (i==']' && n=='['))
                continue;
                else
                return false;
            }
        }
        return sc.isEmpty();
    }
}