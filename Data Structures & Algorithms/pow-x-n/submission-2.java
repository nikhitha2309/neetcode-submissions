class Solution {
    public double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double mult = 1;
        double power = x;

        while (N > 0) {

            if (N % 2 == 1) {
                mult *= power;
            }

            power *= power;
            N /= 2;
        }

        return mult;
        
    }
}
