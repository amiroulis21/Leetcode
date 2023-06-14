class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder word = new StringBuilder(100);
        int len = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) {
                while(s.charAt(i) != word.charAt(0)) {
                    set.remove(word.charAt(0));
                    word.deleteCharAt(0);
                    len--;
                }
                set.remove(s.charAt(i));
                word.deleteCharAt(0);
              
            }
            else {
                len++;
                if(len > maxLen) {
                    maxLen = len;
                }
            }
            set.add(s.charAt(i));
            word.append(s.charAt(i));
        }
        return maxLen;
    }
}