/** get power of a number
*/

public class Power {
    public double myPow(double x, int n) {
        double val = myPow1(x,Math.abs(n));
        if(n<0) {
            return 1/val;
        } else {
            return val;
        }
        
        
    }
    
    public double myPow1(double x, int n) {
       
        if(n==0)
            return 1;
        if(n==1)
            return x;
        else if(n%2==0)
            return myPow1(x*x,n/2);
        else
            return  x * myPow1(x*x,n/2);
        
    }
}
