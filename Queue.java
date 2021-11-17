
public class Queue {


    private static final int capacity  =10;
    private static int[] qu;
    private static int front=0;
    private static int rear =1;
    private static  int size = 0;

    public Queue(int capacity){

        qu = new int[capacity];
        this.size = qu.length-1;
    }

    public Queue(){

        qu = new int[this.capacity];
        this.size = qu.length;
    }

    public static void enqueue(int x){

          rear = rear%size;
          if(front == rear){
              System.out.println("queue is full");
              return;
          }
//          System.out.println(front+":"+rear);

          qu[rear++] = x;
    }

    public static void dequeue(){

          int d = qu[++front];
          qu[front] = 0;
    }
    public String toString(){

        return java.util.Arrays.toString(qu);
    }
    public static void main(String[]args){

        Queue q = new Queue();
            enqueue(5);
            enqueue(7);
            enqueue(9);
            enqueue(8);
            enqueue(1);
            enqueue(2);
            enqueue(4);
            enqueue(3);
            enqueue(3);
            dequeue();
            dequeue();
            dequeue();
            enqueue(31);
            enqueue(33);
            enqueue(35);


        System.out.println(q);

    }
}


