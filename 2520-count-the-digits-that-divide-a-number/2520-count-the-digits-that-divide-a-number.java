class Solution {
    public int countDigits(int n) {
        int k = n;
        int count = 0;
        while (n > 0){
            int d = n % 10;
            n/=10;
            if(k % d == 0){
                count++;
            }
        }
        return count; 
    }
}