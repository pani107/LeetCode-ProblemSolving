class Solution {
    public int differenceOfSums(int n, int m) {
        int n1 = 1;
        int m1 = 0;
        int m2 = 0;
        while(n1 <= n){
            if(n1 % m == 0){
                m1 += n1;
            }else m2 += n1;
            n1++;
        }
        return m2 - m1;
    }
}