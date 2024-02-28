class Solution {
    public String makeFancyString(String s) {
        if (s.length() == 1)
            return s;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int c = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                c++;
                if (c <= 2) {
                    sb.append(s.charAt(i));
                }
            } else {
                c = 1;
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}