import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    public String isValid(String expression){
        Map<Character,Character> bracketPair = new HashMap<Character,Character>();
        bracketPair.put('(', ')');
        bracketPair.put('[', ']');
        bracketPair.put('{', '}');
        Stack<Character> stack = new Stack<Character>();
        for(int i =0;i<expression.length();i++){
            if(bracketPair.containsKey(expression.charAt(i))) {
                stack.push(expression.charAt(i));
            }
            else if(bracketPair.containsValue(expression.charAt(i))) {
                if (stack.isEmpty() || bracketPair.get(stack.pop()) != expression.charAt(i))
                    return "NO";
                }
            }

        if(stack.isEmpty()){
            return "YES";
        }

        else{
            return "NO";
        }

    }

}
