class Solution {
    public boolean rotateString(String s, String goal) { 
        StringBuilder str = new StringBuilder(s);
        
        for(int i = 0; i < str.length(); i++){
            str.append(s.charAt(i));
            str.deleteCharAt(0);
            
            if(str.toString().equals(goal)){
                return true;
            }
            
        }
        return false;
    }
}