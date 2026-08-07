class Solution {
    public int subtractProductAndSum(int n) {
        int num = n;
        int multi = 1;
        int sum = 0;
        while(num > 0){
           int rem = num % 10;
           multi = rem * multi; 
           num /= 10;
        }
        int num1 = n;
         while(num1 > 0){
           int rem = num1 % 10;
           sum = rem + sum; 
           num1 /= 10;
        }
         return multi - sum ;
    }
}