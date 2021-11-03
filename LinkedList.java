
public class LinkedList {

    static class Node {

        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    private static Node first;
    private static Node tail;
    private static int size=0;


    public void reverse(){

            
            recursiveReverse(null,first);
//iteratieve reverse
/*
        Node p = first;
        Node q = null;
        Node r = null;

        while(p!=null){
            r=q;
            q=p;
            p=p.next;
            q.next = r;
        }
        first=q;
*/
    }

    private void recursiveReverse(Node q,Node p){

        if(p !=null){
            recursiveReverse(p,p.next);
            p.next = q;
        }
        else{
            first =q;
        }
    }

    public boolean isSorted(){

        Node current = first;
        int x = current.data;
        while(current.next !=null){
            if(x > current.next.data){
                return false;
            }
            x = current.next.data;
            current = current.next;
        }
        return true;
    }
    public void remove(){

        Node second = first.next;
             first = second;
    }

    public void remove(int index){

        if(index==0){
            remove();
            return;
        }
        Node tmp = first;
        for(int i=0;i<index-1 && tmp.next !=null;i++){

             tmp = tmp.next;
        }
        try{
        tmp.next = tmp.next.next;
        }
        catch(NullPointerException e){
            System.out.println("invalid index");
        }
    }

    public static void addNode(int data){

        Node newNode = new Node(data);
        newNode.next = null;

        if(first==null){
            first = newNode;
            tail  = first;
            size++;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            size++;
            }
    }

    public void addNode(int data,int pos){

            Node newNode = new Node(data);
        if(pos==1){
            newNode.next = first;
            first = newNode;
        }
        else{
            Node tmp = first;
            for(int i=1;i<pos-1&&tmp.next !=null;i++){

                tmp = tmp.next;
            }
            newNode.next = tmp.next;
            tmp.next = newNode;
        }
    }

    public int addElement(){

        int sum = 0;
        Node current = first;
        while(current !=null){
            sum +=current.data;
            current = current.next;
        }
        return sum;
    }

    public static Node getNode(){
        return first;
    }

    public int maximum(){

        Node current = first;
        int result = 0;
        while(current !=null){
            result = Math.max(current.data,result);
            current = current.next;
        }
        return result;
    }


    public static boolean search(int key){
            Node p = first;
            Node q = null;
            while(p !=null){

                if(p.data == key){
                    //move on front for optimizing
                    q.next = p.next;
                    p.next = first;
                    first  = p;
                    return true;
                }
                q = p;
                p = p.next;
            }
            return false;
    }

            


    private void recursiveDisplay(Node node){


            if(node !=null){
                System.out.println(node.data);
                recursiveDisplay(node.next);
            }
    }



   public String toString(){

        System.out.println("Recursivly Display");
        Node current = first;
        java.util.ArrayList<Integer> result = new java.util.ArrayList<Integer>();
        while(current!=null){

            result.add(current.data);
            current = current.next;
        }
        return result+"";
   }


}

