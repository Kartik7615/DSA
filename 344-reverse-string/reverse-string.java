class Solution {
    public void reverseString(char[] s) {

        // Convert char array to String
        String str = new String(s);

        // Reverse the string
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }

        // Convert reversed string back to char array
        char[] res = rev.toCharArray();

        // Copy back into original array
        for(int i = 0; i < s.length; i++){
            s[i] = res[i];
        }
    }
}