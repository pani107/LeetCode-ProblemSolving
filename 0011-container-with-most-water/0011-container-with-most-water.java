class Solution {
    public int maxArea(int[] height) {
       int s = 0;
       int e = height.length-1;
       int max = 0;
       while(s <= e){
         int idx = e - s;
         int min = Math.min(height[s], height[e]);
         max = Math.max(max,idx * min);
         if(height[s] < height[e]){
            s++;
         }else e--;
       } 
       return max;
    }
}