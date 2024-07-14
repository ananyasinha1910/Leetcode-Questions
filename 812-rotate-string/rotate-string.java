class Solution {
    public boolean rotateString(String s, String goal) { 
        StringBuilder str = new StringBuilder(s);
        StringBuilder str2 = new StringBuilder(goal);
        
        for(int i = 0; i < str.length(); i++){
            str.append(s.charAt(i));
            str.deleteCharAt(0);
            
            if(str.toString().equals(goal)){
                return true;
            }
            
            //System.out.println(str);
            
        }
        return false;
    }
}