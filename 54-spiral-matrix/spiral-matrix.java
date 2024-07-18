class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> Al = new ArrayList<>();
       
       int cnt  = 0;
       int pdt = matrix.length * matrix[0].length;
       int min_r = 0;
       int min_c = 0;
       int max_r = matrix.length - 1;
       int max_c = matrix[0].length - 1;

       while(min_c <= max_c && min_r <= max_r && cnt < pdt){

        for(int c = min_c ; c <= max_c && cnt < pdt; c++){
            Al.add(matrix[min_r][c]);
            cnt++;
        }

        for(int r = min_r + 1 ; r <= max_r && cnt < pdt; r++){
            Al.add(matrix[r][max_c]);
            cnt++;
        }

         for(int c = max_c - 1; c >= min_c && cnt < pdt; c--){
            Al.add(matrix[max_r][c]);
            cnt++;
        }

        for(int r = max_r - 1; r >= min_r + 1 && cnt < pdt; r-- ){
            Al.add(matrix[r][min_c]);
            cnt++;
        }

       
        min_r++;
        min_c++;
        max_c--;
        max_r--;
       }
       return Al;
	}
}