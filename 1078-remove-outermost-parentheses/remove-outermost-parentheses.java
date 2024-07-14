class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> S = new Stack<>();
        Stack<Character> S1 = new Stack<>();
        String str = "";
        int store = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                store++;
            }else if(s.charAt(i) == ')'){
                store--;
            }
            S.push(s.charAt(i));
           // System.out.print(S);

            if(store == 0){
                S.pop();
                while(S.size() != 1){
                    S1.push(S.pop());
                }
                S.pop();
                while(S1.size() != 0){
                    str = str + S1.pop();
        //System.out.print(S1);
                }

            }
        }

        return str;
    }
}