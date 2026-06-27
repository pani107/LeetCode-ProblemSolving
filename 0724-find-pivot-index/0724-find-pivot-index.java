class Solution {
    public int pivotIndex(int[] nums) {
        // int left[] = new int[nums.length];
        // int right[] = new int [nums.length];
        // left[0] = 0;
        // for(int i = 1; i < nums.length; i++){
        //     left[i] = left[i - 1] +     
        // }
        // int sumi = 0;
        //  nums[0] = 0;
        // for(int i=1; i<nums.length; i++){
        //     sumi = sumi + nums[i-1];
        //     int sumj = 0;
        //     for(int j=i+1; j<nums.length; j++){
        //         sumj = sumj + nums[j];
        //     }
        //     if(sumi == sumj){
        //         return i;
        //     }
        // }
        int totalSum = 0;
        for(int i=0; i<nums.length;i++){
            totalSum += nums[i];
        }
        int leftSum = 0;
        int rightSum = totalSum;
           for(int i=0; i<nums.length;i++){
            rightSum = rightSum - nums[i];
            if(rightSum == leftSum)return i;
            leftSum += nums[i];
           }
        return -1;

    }
}