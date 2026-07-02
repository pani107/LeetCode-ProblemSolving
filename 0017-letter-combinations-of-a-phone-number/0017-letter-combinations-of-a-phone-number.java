class Solution {
    static HashMap<Character,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
         List<String > list = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return list;
        }
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        StringBuilder sb = new StringBuilder();
        recurse(digits,0,sb,list);
        return list;
    }
    static void recurse(String digits,int idx,StringBuilder sb,List<String>list) {
        if(idx == digits.length()){
            list.add(sb.toString());
            return;
        }
        char curr = digits.charAt(idx);
        String currS = map.get(curr);

        for (int i = 0; i < currS.length(); i++) {
            char ch = currS.charAt(i);
            sb.append(ch);
            recurse(digits,idx+1,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
    } 
}
