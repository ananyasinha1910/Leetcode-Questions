class Solution {
    public static int beautySum(String s) {
        return findSubstring(s);
    }

    private static int findSubstring(String s){
        int sum = 0;
        int n = s.length();
        
        // Iterate over all possible starting points of substrings
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];  // frequency array for 26 letters
            // Iterate over all possible ending points of substrings starting from i
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                sum += findBeauty(freq);
            }
        }
        return sum;
    }

    private static int findBeauty(int[] freq){
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        
        for (int count : freq) {
            if (count > 0) {
                if (count > maxFreq) maxFreq = count;
                if (count < minFreq) minFreq = count;
            }
        }
        return maxFreq - minFreq;
    }
}
