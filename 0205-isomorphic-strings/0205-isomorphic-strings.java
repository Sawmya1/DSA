class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> chS = new HashMap<>();
        HashMap<Character, Integer> chT = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!chS.containsKey(s.charAt(i)))
            chS.put(s.charAt(i),i);
            if(!chT.containsKey(t.charAt(i)))
            chT.put(t.charAt(i),i);
            if (!chS.get(s.charAt(i)).equals(chT.get(t.charAt(i)))) 
                return false;
        }
        return true;
    }
}