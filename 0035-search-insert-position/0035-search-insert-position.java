class Solution {
    public int searchInsert(int[] nums, int target) {
      int start = 0;
      int end = nums.length-1;
      
      while(start <= end){
        int idx = start + (end-start)/2;

        if(nums[idx] == target){
            return idx;
        }else if(nums[idx] < target){
            start =idx + 1;
        }else{
            end = idx - 1;
        }
      }
      return start;
    }
}