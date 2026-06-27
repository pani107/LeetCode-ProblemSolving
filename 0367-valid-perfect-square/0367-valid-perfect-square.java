class Solution {
    public boolean isPerfectSquare(int x) {
        if(x < 2) return true;
       int left = 2;
        int right = x/2;

        while(left <= right){
            int mid = left + (right-left)/2;
            long num =(long) mid * mid;
            if(num == x){
                return true;
            }

            else if(mid < x/mid){
                left = mid+1;
            }

            else{
                right = mid - 1;
            }
        }
        return false;
    }
}