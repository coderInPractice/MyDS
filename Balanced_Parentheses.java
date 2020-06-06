package data_structures;

/***
 * 
 * @author yellowTERROR
 * 
 * Problem Statement: 
 * Given an expression string expression
 * write a program to examine whether the
 * pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]”
 * are correct in expression.
 * 
 * Input: Expression = “[()]{}{[()()]()}”
 * Output: Balanced
 * 
 * Algorithm:

	Declare a character stack S.
	Now traverse the expression string expression.
	If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
	If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character 
	is the matching starting bracket then fine else parenthesis are not balanced.
	After complete traversal, if there is some starting bracket left in stack then “not balanced”
 *
 */

public class Balanced_Parentheses {
	
	public static String checkBalanced(String str) {
		
		char[] ch = str.toCharArray();
		
		MyStack stack = new MyStack();
		
		for(int i = 0; i<ch.length; i++) {
			if(ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
				stack.push(String.valueOf(ch[i]));
			}else if (ch[i] == ')' || ch[i] == '}' || ch[i] == ']'){
				String pop = stack.pop();
				if(isMatching(pop,ch[i])) {
					return "Balance";
				}
				else
					return "Not Balance";
			}
		}
		
		if(stack.isEmpty()) {
			return "Balanced";
		}
		else
			stack.pop();
			return "Not Balanced";
	}

	private static boolean isMatching(String pop, char c) {
		// TODO Auto-generated method stub
		
		char ch = pop.charAt(0);
		
		if(ch == '(' && c == ')') {
			return true;
		}
		else if(ch == '{' && c =='}') {
			return true;
		}
		else if(ch == '[' && c ==']') {
			return true;
		}
		else
			return false;
		
	}
	
    public static void main(String[] args)  
    { 
        String exp = "[()]{}{[()()]()}";
        System.out.println(checkBalanced(exp));
    } 

}
