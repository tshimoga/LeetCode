/**
* Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
* For example, given n = 3, a solution set is:
*
* [
*   "((()))",
*   "(()())",
*   "(())()",
*   "()(())",
*   "()()()"
* ]
*/

public class GenerateParanthesis {
    
    List<String> list;
    public List<String> generateParenthesis(int n) {
        list = new ArrayList<String>();
        paranthesis(n,"",0);
        return list;
    }
    
    public void paranthesis(int n,String str,int counter) {
        if(str.length()>2*n) {
            return;
        }
        if(counter==0 && str.length()==2*n) {
            list.add(str);
            return;
        } else if(counter==0) {
            paranthesis(n,str+'(',counter+1);
        } else {
            paranthesis(n,str+'(',counter+1);
            paranthesis(n,str+')',counter-1);
        }
        
    }
    
    
}
