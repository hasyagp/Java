import java.util.*;

public class BalancedBrackets {
    
    public static String isBalanced(String brackets) {
        
        HashMap<Character,Character> map = new HashMap<Character,Character>();

        map.put('}','{');
        map.put(')','(');
        map.put(']','[');

        Stack<Character> stackChar = new Stack<Character>();

        String isBalance = "YES";

        for(int i=0; i<brackets.length(); i++ ){
            if( brackets.charAt(i) == '{' || brackets.charAt(i) == '(' || brackets.charAt(i) == '[' ){
                stackChar.push(brackets.charAt(i));
            }
            else{
                if(stackChar.lastElement() == map.get(brackets.charAt(i))){
                    stackChar.pop();
                }
                else{
                    isBalance = "NO";
                    break;
                }
            }
        }

        return isBalance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brc = scanner.nextLine();
        scanner.close();

        System.out.println(isBalanced(brc));
    }
}