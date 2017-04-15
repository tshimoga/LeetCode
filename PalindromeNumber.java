/**
Determine whether an integer is a palindrome. Do this without extra space.
*/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
         
         int lengthOfNumber = 0;
         int temp = x;
         while(temp!=0) {
             temp = temp/10;
             lengthOfNumber++;
         }
         
         boolean isPalindrome = (x<0)?false:true;
         while(lengthOfNumber!=0 && lengthOfNumber!=1) {
             int lastDigit = x%10;
             int firstDigit = x/pow(10,lengthOfNumber-1);
             if(lastDigit!=Math.abs(firstDigit)) {
                 isPalindrome=false;
                 break;
             }
             
             x = (x%pow(10,lengthOfNumber-1))/10;
             lengthOfNumber-=2;
         }
         
         return isPalindrome;
         
    }
    
    int pow (int num, int exp) //O(log exp)
    {
        if ( exp == 0)
            return 1;
        if ( exp == 1)
            return num;
        if (exp%2==0)
            return pow( num * num, exp/2); 
        else
            return num * pow( num * num, exp/2);

    }   
}
