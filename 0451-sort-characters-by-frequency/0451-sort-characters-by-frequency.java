class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c : s.toCharArray())
          freqMap.put(c, freqMap.getOrDefault(c,0)+1);

        List<Map.Entry<Character, Integer>> li = new ArrayList<>(freqMap.entrySet());
        li.sort((a,b) -> b.getValue().compareTo(a.getValue()));
           
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : li){
            char ch = entry.getKey();
            int count = entry.getValue();
            for(int i=0;i<count;i++)
            sb.append(ch);
        }
        return sb.toString();
    }
}