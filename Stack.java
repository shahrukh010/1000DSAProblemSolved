
public class Stack {

    
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
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }

}

