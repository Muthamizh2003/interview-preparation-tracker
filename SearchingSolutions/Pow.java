public class Pow {
    
}
//O(log n)
//O(log n) if int means overflow since 2^-31 cannot store 32 bit int-> long 
class Solution1 {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;

        long num = Math.abs((long)n);
        double res = myPow(x, (int)(num / 2));

        if (num % 2 == 0) {
            res = res * res;
        } else {
            res = x * res * res;
        }
        return n > 0 ? res : 1 / res;
    }
}
//O(log n)
//O(1)
//bit manipulation
class Solution {
    public double myPow(double x, int n) {
        
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        
        double pow = 1;
        
        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            } 
                
            x *= x;
            n >>>= 1;
            
        }
        
        return pow;
    }
}