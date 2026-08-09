class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        // 1. Reverse entire array
        int f = 0;
        int l = n - 1;
        while (f < l) {
            int temp = nums[f];
            nums[f] = nums[l];
            nums[l] = temp;
            f++;
            l--;
        }

        // 2. Reverse first k elements
        int fs = 0;
        int ls = k - 1;
        while (fs < ls) {
            int temp = nums[fs];
            nums[fs] = nums[ls];
            nums[ls] = temp;
            fs++;
            ls--;
        }

        // 3. Reverse remaining elements
        fs = k;
        ls = n - 1;
        while (fs < ls) {
            int temp = nums[fs];
            nums[fs] = nums[ls];
            nums[ls] = temp;
            fs++;
            ls--;
        }
    }
}