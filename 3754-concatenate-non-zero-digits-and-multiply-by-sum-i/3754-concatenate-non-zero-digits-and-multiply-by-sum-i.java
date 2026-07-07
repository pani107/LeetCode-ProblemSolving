class Solution {
    public long sumAndMultiply(int n) {
        int  i =0 ;
        long num = 0;
        while(n > 0) {
            int rem = n % 10;
            if(rem != 0) {
            num +=(long) rem * (int)Math.pow(10 , i);
            i++;
            }
            n /= 10;
        }
        long ori = num;
        long sumD = 0;
        while(num > 0) {
            int rem = (int)num % 10;
            sumD += rem;
            num /= 10;
        }
        return ori * sumD; 
    }
}