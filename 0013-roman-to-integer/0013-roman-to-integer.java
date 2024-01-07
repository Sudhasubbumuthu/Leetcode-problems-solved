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
        int l = s.length()-1, s1 = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'I'&& i != l && s.charAt(i+1) == 'V' ){
                s1 += 4;
                i++;
            }
            else if(s.charAt(i) == 'I' && i != l && s.charAt(i+1) == 'X'){
                s1 += 9;
                i++;
            }
            else if(s.charAt(i) == 'X' && i != l && s.charAt(i+1) == 'L'){
                s1 += 40;
                i++;
            }
            else if(s.charAt(i) == 'X' && i != l && s.charAt(i+1) == 'C' ){
                s1 += 90;
                i++;
            }
            else if(s.charAt(i) == 'C'  && i != l && s.charAt(i+1) == 'D'){
                s1 += 400;
                i++;
            }
            else if(s.charAt(i) == 'C' && i != l && s.charAt(i+1) == 'M'){
                s1 += 900;
                i++;
            }
            else{
                s1 += mp.get(s.charAt(i));
            }
        }
        return s1;
    }
}