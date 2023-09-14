import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stackCharacter = new Stack<>();
        for (int i = 0; i <s.length();i++) {
            char c = s.charAt(i);
            if(c == '('|| c== '{' || c == '[') {
                stackCharacter.push(c);

            }else {
                // if(stackCharacter.isEmpty() == true) {
                //     return false;
                // }
                char openPeek = stackCharacter.peek();
                System.out.println(openPeek);
                if((c==')' && openPeek == '(')||(c=='}' && openPeek == '{')||(c==']' && openPeek == '[')) {
                    stackCharacter.pop();
                }else {
                    return false;
                }
            }
        }


        return stackCharacter.isEmpty();
    }

    public static void main(String[] args) {
        String s ="([)]";
        //Stack
        System.out.println(isValid(s));
    }
}
