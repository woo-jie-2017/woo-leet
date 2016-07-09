public class Solution {
    public double myPow(double x, int n) {
        if(n == 0) {
            return 1;
        }
        long absN = Math.abs((long)n);
        double result = 1;
        while(absN > 0) {
            if(absN % 2 == 1) {
                result *= x;
            }
            
            x *= x;
            absN /= 2;
        }
        
        return n > 0 ? result : 1 / result;
    }
}