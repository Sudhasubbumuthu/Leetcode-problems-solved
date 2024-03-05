class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(!stk.isEmpty()&&stk.peek() == s.charAt(i)){
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
            }
        }
        String ans = "";
        while(!stk.isEmpty()){
            ans = stk.pop()+ans;
        }
        return ans;
    }
}