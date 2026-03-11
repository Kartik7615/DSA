class Solution {
    public int bitwiseComplement(int n) {

        if(n == 0) return 1;

        int res = 0;
        int count = 0;

        while(n > 0){
            int r = n % 2;
            int flipped = 1 - r;

            res += (flipped << count);

            count++;
            n = n / 2;
        }

        return res;
    }
}