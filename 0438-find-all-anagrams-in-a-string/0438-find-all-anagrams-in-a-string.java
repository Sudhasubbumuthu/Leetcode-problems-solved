class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr = new ArrayList<>();
        char[] cp = p.toCharArray();
        Arrays.sort(cp);
        int c = 0;
        for(int i=0; i<=s.length()-p.length(); i++){
            String cur = s.substring(i,i+p.length());
            char[] ccur = cur.toCharArray();
            Arrays.sort(ccur);
            System.out.print(Arrays.equals(ccur,cp));
            if(Arrays.equals(ccur,cp)){
                arr.add(i);
            }
        }
        return arr;
    }
}