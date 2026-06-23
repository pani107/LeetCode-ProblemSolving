class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int num = low; num <= high; num++){
            String s = String.valueOf(num);

            if(s.length() % 2 != 0){
                continue;
             }
             
             int s1 = 0;
             int s2 = 0;
             int n = s.length() / 2;

             for(int i = 0; i < n; i++){
                s1 += s.charAt(i) - '0';
                s2 += s.charAt(i + n) - '0';
             }
             if(s1 == s2){
                count++;
            }
        }
       return count;
    }
}