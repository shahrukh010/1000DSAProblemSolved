
public class ConstructTree{

    
    class Node {

        Node left;
        Node right;
        int data;

        public Node(){}
        public Node(int data){

            this.data = data;
        }

        public void insert(int value){

           if(value<=data){

               if(left ==null){
                   left = new Node(value);
               }
               else{
                   left.insert(value);
               }
           }
           else{
               if(right ==null){
                   right =new Node(value);
               }
               else{
                   right.insert(value);
               }
           }
        }

    }
        public void inOrder(Node node){

            if(node !=null){
                
                inOrder(node.left);
                if(node.data!=0)
                System.out.println(node.data);
                inOrder(node.right);
            }
        }
    public static void main(String[]args){

        
        ConstructTree tree = new ConstructTree();
        ConstructTree.Node node = tree.new Node();
                           node.insert(10);
                           node.insert(5);
                           node.insert(8);
                           node.insert(15);
                           tree.inOrder(node);
    }
    
}

