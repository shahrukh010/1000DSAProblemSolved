
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


        public void preOrder(Node node){

            java.util.Stack<Node> stack = new java.util.Stack<>();

            while(node !=null || !stack.isEmpty()){

                if(node !=null){
                    System.out.println(node.data);
                    stack.push(node);
                    node = node.left;
                }
                else{
                    Node tmp = stack.pop();
                    node = tmp.right;
                }
            }
        }


    public static void main(String[]args){

        
        ConstructTree tree = new ConstructTree();
        ConstructTree.Node node = tree.new Node();
                           node.insert(8);
                           node.insert(3);
                           node.insert(4);
                           node.insert(9);
                           node.insert(5);
                           node.insert(7);
                           node.insert(2);
//                           tree.inOrder(node);
 //                          System.out.println(tree.contains(node,15));
  //                         System.out.println(tree.contains(node,8));
   //                        System.out.println(tree.contains(node,11));

                           tree.preOrder(node);
    }
    
}

