
/**
* The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this
* PAHNAPLSIIGYIR
*/




public class  ZigZagConversion {
  public String convert(String s, int numRows) {
        StringBuilder str = new StringBuilder();
        
        if(numRows==1) {
            return s;
        }
        
        for(int i=0;i<numRows;i++) {
            int j=i;
            int count= i==numRows-1?1:0;
            int step = i+1;
            
            while(j<s.length()) {
                str.append(s.charAt(j));
                if(count%2==0) {
                    step = i+1;
                } else {
                    step = numRows-i;
                }
                if(i!=0 && i!=numRows-1) {
                    count++;    
                }
                
                j = j+(2*(numRows-step));
            }
        }
        
        return str.toString();
        
    }
}
