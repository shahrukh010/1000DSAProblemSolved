
public class CircularList {

    class Node {

        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    private Node first;
    private Node last;

    public void add(int data){

        Node newNode = new Node(data);

        if(this.first==null){
            this.first = newNode;
            this.last  = first;
        }
        else{
            last.next = newNode;
            last  = newNode;
            last.next = first;
        }
    }

    public void add(int pos, int data){

        Node newNode = new Node(data);

        if(pos==0){

            newNode.next = first;
            first=newNode;
            last.next = first;
        }
        else{
            Node tmp = first;
            for(int i=0;i<pos-1&&tmp!=last;i++){

                tmp = tmp.next;
            }
            newNode.next = tmp.next;
            tmp.next = newNode;
        }
    }

    public void print(){

        Node current = this.first;

        do{
            System.out.print(current.data+" ");
            current = current.next;
        }while(current !=first);
        System.out.println();
    }
}
            
