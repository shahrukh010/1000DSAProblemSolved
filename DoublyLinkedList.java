
public class DoublyLinkedList {

    class Node{

       Node prev;
       Node next;
       int data;

       public Node(int data){
           this.data = data;
       }
    }

    private Node first;
    private Node last;

    public void add(int data){

        Node newNode = new Node(data);

        if(this.first == null){
            this.first = newNode;
            this.last  = first;
        }
        else{
            this.last.next = newNode;
            newNode.prev   = last;
            last = newNode;
            last.next = null;
        }
    }

    public void print(){

        Node current = this.first;
        while(current.next !=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String...strings){

        DoublyLinkedList list = new DoublyLinkedList();
                        
                         list.add(10);
                         list.add(20);
                         list.add(30);
                         list.add(40);
                         list.add(50);
                         list.add(60);

                         list.print();
//                         System.out.println(list.last.prev.data);
        }
}


