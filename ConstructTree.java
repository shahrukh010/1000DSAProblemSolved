
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

        public boolean contains(Node node, int value){

            if(value==node.data)return true;

            else if(value<node.data){

                if(node.left==null)return false;
                else
                    return contains(node.left,value);
            }else{
                if(node.right==null)return false;
                else
                    return contains(node.right,value);
            }
        }
    //inner class object we can't access directly required to object
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
                           System.out.println(tree.contains(node,15));
                           System.out.println(tree.contains(node,8));
                           System.out.println(tree.contains(node,11));
    }
    
}

