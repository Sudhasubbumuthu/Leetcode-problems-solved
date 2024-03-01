class Solution {
    public String maximumOddBinaryNumber(String s) {
        String[] n = s.split("");
        Arrays.sort(n, Collections.reverseOrder());
        int c1 = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
            if (n[i].equals("1"))
                c1++;
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i].equals("1"))
                continue;
            else {
                String t = n[i - 1];
                n[i - 1] = n[n.length - 1];
                n[n.length - 1] = t;
                break;
            }
        }
        String ans = String.join("", n);
        return ans;
    }
}