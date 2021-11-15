
import java.util.Stack;
public class InfixToPostFix{


    public static int precedence(char ch){

        switch(ch){
            
            case '+':
            case '-':
                 return 1;

            case '*':
            case '/':
                 return 2;

            case '^':
                 return 3;

            default :
                 return -1;
        }
    }
           

    public static String infixToPostFix(String input){

        String result = new String("");
        Stack<Character> optr = new Stack<Character>();

        for(int i=0;i<input.length();++i){

            char ch = input.charAt(i);

            if(Character.isLetterOrDigit(ch)){

                result +=ch;
            }
            else if(ch=='(')optr.push(ch);

            else if(ch==')'){

                while(!optr.isEmpty() && optr.peek() !='('){
                    result +=optr.pop();
                }
                optr.pop();
            }

            else{

                while(!optr.isEmpty() && precedence(ch)<=precedence(optr.peek())){

                    result +=optr.pop();
                }
                optr.push(ch);
            }

        }
        while(!optr.isEmpty()){

            if(optr.peek()=='(')return "invalid expression";

            result +=optr.pop();
        }
        return result;
    }


    public static void main(String...strings){

//           String exp =  "a+b*(c^d-e)^(f+g*h)-i";
           String exp =  "a+b*c-d/e";

           System.out.println(infixToPostFix(exp));

        }
}
