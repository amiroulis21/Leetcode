class Solution {
    //returns the lengths of the lastWord in a string
    public int lengthOfLastWord(String s) {
        int len = 0;
        String temp = s.trim(); //trim() trims the spaces from both ends of the string
        int i = temp.length()-1;
        while(i >= 0 && temp.charAt(i) != ' ') {
            len++;
            i--;
        }
        return len;
    }

}