import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int store = 0;
        int i = 0;

        while (i < nums.length) {
            int count = 1;

            if (  i < nums.length - 1 && nums[i] + 1 == nums[i + 1] ) {
                while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                    count++;
                    i++;

                    if(i < nums.length - 1 && nums[i] == nums[i + 1]){
                        while(i < nums.length - 1 && nums[i] == nums[i + 1] ){
                        i++;
                        }
                    }
                }
            }

            store = Math.max(count, store);
            i++;
        }
        return store;
    }
}
