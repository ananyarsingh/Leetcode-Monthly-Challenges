class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<Character>();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(stack.empty() || stack.peek()!=s.charAt(i)){
                stack.add(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.empty()){
            res.append(stack.pop());
        }
        return new String(res.reverse());
    }
}
