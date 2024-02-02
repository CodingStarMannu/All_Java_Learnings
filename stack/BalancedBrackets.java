package stack;

public class BalancedBrackets {
	
    /* Initialize top as -1
Then start iterating over the given expression 
If top <0 or the current character is not matched with the open bracket at the top index, 
then increment top++ (as the current character is the most recently occurred open bracket).
Otherwise, if the current character is matched with the open bracket at the top index, decrease
 the top pointer by 1( now it is pointing to the open bracket that is not matched yet).
After iterating all characters, if the top pointer backs to -1, then all open brackets are matched
 with its closing bracket in the proper order( i.e., balanced parentheses containing expression) */

    public static boolean isMatch(char ch1, char ch2){

        if (ch1 == '(' && ch2 ==')')
            return true;
        if (ch1 == '[' && ch2 ==']')
            return true;
        if (ch1 == '{' && ch2 =='}')
            return true;
            
            return false;
    }

    public static boolean isBalanced(String expression) {
         
        int top = -1;
        char s [] = new char[expression.length()];
        for(int i = 0; i < expression.length(); i ++){
            s [i] = expression.charAt(i);
             }
        for(int i=0; i<expression.length(); i++){
            if(top < 0 || !isMatch(s[top], s[i])){
                top++;
                s[top] = s[i];
            }else{
                top--;
            }
        }
          return top == -1;
    }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
