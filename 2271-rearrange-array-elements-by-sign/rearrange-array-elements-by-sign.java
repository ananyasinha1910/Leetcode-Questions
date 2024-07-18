class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            if(nums[i]<0){
                neg.add(nums[i]);
            }
        }
        int[] arr=new int [nums.length];
        int index=0;
        for(int i=0;i<nums.length/2;i++){
            arr[index]=pos.get(i);
            index++;
            arr[index]=neg.get(i);
            index++;
            
        }

        return arr;
    }
}