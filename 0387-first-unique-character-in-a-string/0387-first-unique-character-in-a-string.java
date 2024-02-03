class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<s.length(); i++){
            if(!h.containsKey(s.charAt(i)))
                h.put(s.charAt(i),i);
            else{
                h.put(s.charAt(i),-1);
            }
        }
        int c = Integer.MAX_VALUE, f = 0;
        for(Map.Entry<Character,Integer> e : h.entrySet()){
            int cur = e.getValue();
            if(cur != -1){
                c = Math.min(c,cur);
                f = 1;
            }
        }
        if(f == 0)
            return -1;
        return c;
    }
}