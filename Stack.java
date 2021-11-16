
public class Stack {

    
    class Node{
        
        Node next;
        int data;

        public Node(int data){
            this.data = data;
        }
    }

    private Node first;
    private Node last;

    public void add(int value){

        Node newNode = new Node(value);
        if(this.first==null){
            this.first = newNode;
            this.last  = first;
        }
        else{
            newNode.next = first;
            first = newNode;
        }
    }


    private int precedence(char ch){

        switch(ch){

            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;
            case '^':
                return 3;

            default:
                return -1;
        }
    }
    
    public String infixToPostFix(String input){

            int n = input.length();
            java.util.Stack<Character> stack = new java.util.Stack<Character>();

            String result = new String();
            for(int i=0;i<n;i++){

                char ch = input.charAt(i);

                if(Character.isLetterOrDigit(ch)){
                    result+=ch;
                }
                else if(ch=='('){
                    stack.push(ch);
                }
                else if(ch==')'){

                    while(!stack.isEmpty() && stack.peek() !='('){
                        result +=stack.pop();
                    }
                    stack.pop();
                }
                else{

                    while(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek())){

                        result+=stack.pop();
                    }
                    stack.push(ch);
                }
            }
            while(!stack.isEmpty()){

                if(stack.peek()=='(')return "invalid expression";
                    
                    result+=stack.pop();
            }
            return result;
    }

    public int popNode(){

         int pop = 0;
        try{
        Node current = first;
         pop = current.data;
        current = current.next;
        first   = current;

        }
        catch(NullPointerException e){
            return-1;
        }

        return pop;
    }

    public int peekNode(){

        try{
        int peek = first.data;
        return peek;
        }
        catch(NullPointerException e){
            return -1;
        }
    }

    
    //using array implementation of stack
    private int[] array;
    private int size=0;
    private int top=-1;
    private int capacity=10;

    public Stack(){

        array = new int[capacity];

    }

    public Stack(int capacity){

        array = new int[capacity];
    }

    public void push(int value){

        try{
        array[++top] = value;
        size++;
        }
        catch(ArrayIndexOutOfBoundsException e){
            
            System.out.println("Capacity is full");
        }
    }

    public int pop(){

        int pop =-1;
        if(!isEmpty()){
            size--;
         pop = array[top--];
        }
        return pop;
    }

    public int peek(){

        return array[top];
    }

    public boolean isEmpty(){
          return size>0?false:true;
    }


    public static void main(String...strings){

        Stack stack = new Stack();

              stack.push(10);
              stack.push(20);
              stack.push(30);
              stack.push(40);
              stack.push(50);
              stack.push(60);
              System.out.println(stack.size);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println("********************");
        System.out.println("********************");
                 stack.add(100);
                 stack.add(200);
                 stack.add(300);
                 stack.add(400);
                 stack.add(500);
                 stack.add(600);
        System.out.println(stack.popNode());
        System.out.println(stack.popNode());
        System.out.println(stack.popNode());
        System.out.println(stack.popNode());
        System.out.println(stack.popNode());
        System.out.println(stack.popNode());
        System.out.println(stack.popNode());
        System.out.println(stack.peekNode());

        String input = "a+b*c-d/e";
        input = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println(stack.infixToPostFix(input));


    }

}

