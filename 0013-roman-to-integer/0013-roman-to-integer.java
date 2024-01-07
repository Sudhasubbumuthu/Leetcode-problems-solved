class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int r = 0;
        for(int i=s.length()-1; i>=0; i--){
            int t = mp.get(s.charAt(i));
            if(i != 0 && mp.get(s.charAt(i-1)) < t ){
                r += (t - mp.get(s.charAt(i-1)));
                i--;
            }
            else
                r += t;
        }
        return r;
    }
}