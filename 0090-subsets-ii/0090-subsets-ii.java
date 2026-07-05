class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> demo = new ArrayList<>();
        generate(0, arr, new ArrayList<>(), demo);
        HashSet<List<Integer>> set = new HashSet<>(demo);
       return new ArrayList<>(set);
    }
    static void generate(int idx,int []nums,List<Integer>list , List<List<Integer>> result) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[idx]);
        generate(idx+1,nums,list,result);
        list.remove(list.size()-1);
        generate(idx+1,nums,list,result);

      
    }
}