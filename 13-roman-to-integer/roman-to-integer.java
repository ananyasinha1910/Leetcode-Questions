class Solution {
    public int romanToInt(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int sum = 0;
        int prev = 0;
        
        for(int i = arr.length - 1; i >=0; i--){
            int curr = map.get(arr[i]);
            if(curr < prev){
                sum = sum - curr;
            }else {
                sum = sum + curr;
            }
            prev = curr;
        }
        return sum;
    }
}