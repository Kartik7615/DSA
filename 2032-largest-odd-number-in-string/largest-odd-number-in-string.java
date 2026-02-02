class Solution {
    public String largestOddNumber(String num) {
        char oddNo[] = num.toCharArray();

        for(int i = oddNo.length - 1; i >= 0; i--){
            if((oddNo[i] - '0') % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}