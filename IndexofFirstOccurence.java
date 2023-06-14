class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.substring(i, i + needle.length()).equals(needle)) {
                index = i;
                break;
            }
        }
        return index;
    }
}