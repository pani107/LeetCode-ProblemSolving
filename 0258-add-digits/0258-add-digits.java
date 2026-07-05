class Solution {
    public int addDigits(int num) { 
        int n = 0;
        while (num > 0){
            int d = num % 10;
            n += d;
            num/=10;
        }
        if(n < 10){
            return n;
        }
        return addDigits(n);
    }
}