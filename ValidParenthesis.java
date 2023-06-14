class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) {
            return true;
        }
        if(s.length() % 2 == 1) {
            return false;
        }
        int startPair = 0;
        int endPair = 0;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
                startPair++;
            }
            else {
                endPair++;
                if(!st.empty() && map.get(s.charAt(i)) != st.peek()) {
                    return false;
            } 
                else if(!st.empty()){
                    st.pop();
                }
                else {
                    return false;
                }
            }

        }
        if(startPair != endPair) {
            return false;
        }
        
        return true;
    }
}