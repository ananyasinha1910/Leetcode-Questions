class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for(int s = 0; s < nums.length; s++){
        int sum  = 0;
            for(int e = s; e < nums.length; e++){
                sum = sum + nums[e];
               // System.out.println(sum);
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}