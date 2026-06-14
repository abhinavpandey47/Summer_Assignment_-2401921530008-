import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        
        for (String w : strs) {
            char[] ch = w.toCharArray();
            Arrays.sort(ch);
            String k = new String(ch);
            
            if (!mp.containsKey(k)) {
                mp.put(k, new ArrayList<>());
            }
            mp.get(k).add(w);
        }
        
        return new ArrayList<>(mp.values());
    }
}
