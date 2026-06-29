class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0; i<matrix.length;i++){
          int s = 0;
          int e = matrix[0].length-1;
          while(s <= e){
            int m = s + (e - s) / 2;
            if(matrix[i][m] == target) return true;
            else if(matrix[i][m] > target )e = m -1;
            else s = m+1;
          }
        }
        return false;
    }
}