
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

    public void add(int index, int data){

            
          Node newNode = new Node(data);

          if(this.first==null){
              add(data);
              return;
          }
          if(index==0){
              newNode.next = this.first;
              this.first.prev = newNode;
              this.first = newNode;
          }
          else{

              Node tmp = this.first;

              for(int i=0;i<index-1&&tmp !=null;i++){
                  
                   tmp = tmp.next;
              }
              try{
              newNode.next = tmp.next;
              newNode.prev = tmp;

              if(tmp.next !=null){
                  tmp.next.prev = newNode;
              }
              tmp.next = newNode;
              }
              catch(NullPointerException e){
                  System.out.println("invalid index");
                  return;
              }
          }
    }

    public void delete(int index){

        if(index == 0){

            Node tmp = first.next;
            first = tmp;

            if(first.next !=null){//may be chance of only single node
                first.prev=  null;
            }
        }
        else{
            Node tmp = this.first;

            for(int i=0;i<index&& tmp !=null;i++){

                tmp = tmp.next;
            }
            try{
                tmp.prev.next = tmp.next;
                tmp.prev = null;
            }
            catch(NullPointerException e){
                System.out.println("invalid index");
                return;
            }
        }
    }

//reversing link
    public void reverse(){


        Node tmp =null;
        Node current =first;

        while(current!=null){
            
            tmp = current.prev;
            current.prev = current.next;
            current.next = tmp;
            current = current.prev;
        }
        if(tmp !=null){
            first = tmp.prev;
        }
    }
                
            

    public void print(){

        Node current = this.first;
        while(current !=null){
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

                         //list.add(0,5);
                         //list.add(0,2);
                         list.add(5,55);
                         list.add(7,70);
 //                        list.add(8,170);

                         //list.delete(0);
//                         list.delete(9);//invalid index


                         list.print();
                         list.reverse();
                         list.print();
//                         System.out.println(list.last.prev.data);
        }
}


