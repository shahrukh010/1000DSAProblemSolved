
class Node {

    protected Node left;
    protected Node right;
    protected int data;

    public Node(int value){
        this.data = value;
    }

    public void push(int value){

        Node node = new Node(value);

        if(this.data == value)return;
        
        if(value < this.data){
            
            if(this.left == null){
                this.left = node;
            }
            else{
                this.left.push(value);
            }
        }
        else{
                if(this.right == null){
                    this.right = node;
                }
                else{
                    this.right.push(value);
                }
            }
    }

    public void inOrder(Node node){

        if(node !=null){

            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }

    public static void main(String...strings){

        
        Node node = new Node(50);
             node.push(30);
             node.push(20);
             node.push(40);
             node.push(70);
             node.push(60);
             node.push(80);
             node.inOrder(node);
        
    }
}

