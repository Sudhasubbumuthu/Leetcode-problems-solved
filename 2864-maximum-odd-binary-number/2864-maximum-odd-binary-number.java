class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c0 = 0, c1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                c1++;
            else
                c0++;
        }
        StringBuilder sb = new StringBuilder();
        c1--;
        while (c1 > 0) {
            sb.append(1);
            c1--;
        }
        while (c0 > 0) {
            sb.append(0);
            c0--;
        }
        sb.append(1);
        return sb.toString();

    }
}