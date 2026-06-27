class Solution {
    public int[] searchRange(int[] arr, int t) {
        int ans1[] = new int[2];
        ans1[0] = lo(arr,t);
        ans1[1] = up(arr, t);
        return ans1;
    }
    public static int lo(int []arr ,int t){
        int s = 0;
        int e = arr.length-1;
        int ans2 = -1;

        while (s <= e){
            int m = ( s + e ) / 2;
            if( arr[m] == t){
                ans2 = m;
                e = m - 1;
            }
            else if (arr[m] < t) s = m +1;
            else e = m -1;
        }
        return ans2;
    }
    public static int up(int []arr ,int t) {
        int s = 0;
        int e = arr.length - 1;
        int ans3 = -1;

        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == t) {
                ans3 = m;
                s = m + 1;
            } else if (arr[m] < t) s = m + 1;
            else e = m - 1;
        }
        return ans3;
       
    }
}