/**
Question:
A magical string S consists of only '1' and '2' and obeys the following rules:
The string S is magical because concatenating the number of contiguous occurrences of characters '1' and '2' generates the string S itself.
The first few elements of string S is the following: S = "1221121221221121122……"
*/

public class MagicalString {
    public int magicalString(int n) {
        if(n==0) {
            return 0;
        } 
        int count=1;
        StringBuilder str = new StringBuilder("122");
        boolean one = true;
        for(int i=2;i<n;i++) {
            char ch = str.charAt(i);
            switch(ch) {
                case '2': if(one) {str.append("11");} else {str.append("22");}
                break;
                default: if(one) {str.append("1");} else {str.append("2");}
                count++;
            }
            one=!one;
        }
        
        return count;
    }
}
