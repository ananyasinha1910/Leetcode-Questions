class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for(int j = 0; j < s.length(); j++){
            map2.put(t.charAt(j), s.charAt(j));
        }
        
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i) || map2.containsKey(t.charAt(i)) && map2.get(t.charAt(i)) != s.charAt(i)){
               // System.out.print(map);
                return false;
            }
            map.put(s.charAt(i), t.charAt(i)); 
        }
       // System.out.print(map);
        return true;
    }
}