
class Node{

    protected Node left;
    protected Node right;
    protected int data;

    public Node(int value){
        this.data = value;
    }
}
public class BinaryTree{

    
    private Node node;

    public BinaryTree(){

        this.node = null;
    }
    public BinaryTree(int value){

        this.node = new Node(value);
    }

    public void inOrder(Node node){

        java.util.Stack<Node> stack =new java.util.Stack<>();
        while(node !=null || !stack.isEmpty()){

            if(node !=null){

                stack.push(node);
                node = node.left;
            }
            else{
                Node tmp = stack.pop();
                System.out.print(tmp.data+" ");
                node=tmp.right;
                }
        }
    }

    public void postOrder(Node node){

        java.util.Stack<Node> s1 = new java.util.Stack<>();
        java.util.Stack<Node> s2 = new java.util.Stack<>();

                s1.push(node);
        while(!s1.isEmpty()){

            if(!s1.isEmpty()){
                
                s2.push(s1.pop());
            }
            if(s2.peek().left !=null){
                s1.push(s2.peek().left);
            }
            if(s2.peek().right !=null){
                s1.push(s2.peek().right);
            }
        }
        System.out.println();

        while(!s2.isEmpty()){
            System.out.println(s2.pop().data);
        }
    }


    public static void main(String...strings){
    
        
        BinaryTree tree = new BinaryTree(8);
                   tree.node.left = new Node(3);
                   tree.node.right= new Node(5);
                   tree.node.left.right = new Node(9);
                   tree.node.left.left = new Node(4);
                   tree.node.right.left = new Node(7);
                   tree.node.right.right= new Node(2);

                   tree.inOrder(tree.node);
                   tree.postOrder(tree.node);

    }

}


