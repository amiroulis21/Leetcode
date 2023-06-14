class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = "";
        for(int i = 0; i < strs[0].length(); i++) {
            for(int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return pre;
                }
            }
            pre += strs[0].charAt(i);
        }
        return pre;
    }
}