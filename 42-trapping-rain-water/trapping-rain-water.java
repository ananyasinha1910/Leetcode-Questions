class Solution {
    public int trap(int[] height) {
        int[] maxL = new int[height.length];
        int[] maxR = new int[height.length];
        int maxLnum = 0;
        int maxRnum = 0;
        int totalwater = 0;

        for(int i = 0; i < height.length; i++){
            maxLnum = Math.max(height[i], maxLnum);
            maxL[i] = maxLnum;
        }
        System.out.println(Arrays.toString(maxL));

        for(int j = height.length - 1; j >= 0; j--){
            maxRnum = Math.max(height[j], maxRnum);
            maxR[j] = maxRnum;
        }


        System.out.println(Arrays.toString(maxR));
        

        for(int k = 0; k < height.length; k++){
            int maxmin = Math.min(maxR[k], maxL[k]);
            //System.out.print( maxmin + " ");
            //System.out.println();
            int water = maxmin - height[k];
            System.out.print( water + " ");
            totalwater = totalwater + water;
        }
        return totalwater;
    }
}