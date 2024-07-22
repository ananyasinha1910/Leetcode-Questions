class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> AL = new ArrayList<String>();
        generate(n , n ,"", AL);
        return AL;
    }

    public static void generate( int open, int close , String path ,List<String> AL) {
        if (open == 0 && close == 0) {
            AL.add(path);
            return;
        }
        if(open > close){
            return;
        }

        if (open > 0) {
            generate(open -1 , close , path + "(" , AL);
        }

        if (close > 0) {
             generate(open  , close - 1 , path + ")" , AL);
        }
    }


}