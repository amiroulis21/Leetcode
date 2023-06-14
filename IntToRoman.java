class Solution {
    public String intToRoman(int num) {
        String roman = "";
        
        int temp = num;
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        int exp = 0;
        while(temp / 10 != 0 || temp % 10 != 0) {
            String sub = "";
             int digit = temp % 10;
             if(digit == 4 || digit == 9){
                 sub += map.get(digit * (int)Math.pow(10, exp));
             }
             else if(10 - digit > 1 && 10 - digit <= 5) {
                 sub += map.get(5 * (int)Math.pow(10, exp));
                 digit -= 5;
             }
             if(digit < 4) {
                for(int i = 1; i <= digit; i++) {
                    sub += map.get((int)Math.pow(10, exp));
                }
             }
             exp++;
             roman = sub + roman;
             temp = temp / 10;

         }

        return roman;
        
    }
}