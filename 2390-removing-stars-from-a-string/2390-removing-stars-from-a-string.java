class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(!stk.isEmpty() && '*' == s.charAt(i))
                stk.pop();
            else
                stk.push(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        while(!stk.isEmpty()){
            ans.append(stk.pop());
        }
        return ans.reverse().toString();
    }
}