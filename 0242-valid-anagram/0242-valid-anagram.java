
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int sF[] = new int[26];
        int tF[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sF[s.charAt(i) - 'a']++;
            tF[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (sF[i] != tF[i]) {
                return false;
            }
        }

        return true;
    }
}