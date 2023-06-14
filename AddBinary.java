class Solution {
    public String addBinary(String a, String b) {
        int aL = a.length()-1;
        int bL = b.length()-1;
        StringBuilder ans = new StringBuilder(""); 
        int sum;
        int carry = 0;
        while(aL>=0 || bL>=0){
            sum = carry;
            if(aL>=0) sum+=a.charAt(aL--)-'0';
            if(bL >=0 ) sum+=b.charAt(bL--)-'0';
            if(sum > 1) carry = 1;
            else carry = 0;
            ans.append(sum % 2);
            
        }
        if(carry == 1) ans.append("1");
        
        return ans.reverse().toString();
    }
}