class Solution {
    public boolean isHappy(int n) {
       int slow = sqr(n);
       int fast = sqr(sqr(n));

       while(slow != fast){
            slow = sqr(slow);
            fast = sqr(sqr(fast));
         }
           if(slow == 1){
             return true;
           }
            return false;
       }
           public static int sqr(int number){
           int ans = 0;
           while(number > 0){
           int rem = number % 10;
           ans = ans + rem * rem;
           number /= 10; 
        }
        return ans;
        }
    }
