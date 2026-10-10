class Solution {
    public int majorityElement(int[] nums) {
        int mej = nums[0];
        int mejcnt = 1;
       for(int i=1;i<nums.length;i++){
        if(mej == nums[i]) mejcnt++;
        else mejcnt--;
        
        if(mejcnt == 0){

            mej = nums[i];
            mejcnt = 1;
        }
        }
        return mej;
    }
}