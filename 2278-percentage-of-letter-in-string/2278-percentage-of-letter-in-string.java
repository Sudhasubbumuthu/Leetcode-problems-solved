class Solution {
    public int percentageLetter(String s, char letter) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int f = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == letter){
                mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
                f = 1;
            }
        }
        if(f == 0)
            return 0;
        double d = mp.get(letter)/(double)s.length();
        return (int)Math.floor(d * 100);
    }
}