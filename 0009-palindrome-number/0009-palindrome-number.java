class Solution {
    public boolean isPalindrome(int x) {
         int f = x;
         int rev = 0;
        while( x > 0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        if(rev == f){
            return true;
        }
        return false;   
    }
}