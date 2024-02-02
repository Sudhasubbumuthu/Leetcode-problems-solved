class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (mp.containsKey(t.charAt(i))) {
                mp.put(t.charAt(i), mp.get(t.charAt(i)) - 1);
            } 
            else {
                mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 0) + 1);
            }
        }
        for(Map.Entry<Character, Integer> m : mp.entrySet()){
            if(m.getValue() != 0){
                return m.getKey();
            }
        }
        return 0;
    }
}