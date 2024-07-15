class Solution {
    public String frequencySort(String s) {
        HashMap<Character,  Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();

        for(char a : s.toCharArray()){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        
        
        while(!map.isEmpty()){
             char Chabi = 'b';

             int larValue = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

         char key = entry.getKey();
         int value = entry.getValue();

         if (value > larValue) {
            larValue = value;
            Chabi = key;
         }
        }
        for(int i = 0; i < larValue; i++){
            str.append(Chabi);
        }
        map.remove(Chabi);
        }
        //System.out.print(larValue);
        System.out.print(map);
        return str.toString();
    }
}