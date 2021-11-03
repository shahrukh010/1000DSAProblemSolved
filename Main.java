
public class Main {


    public static void main(String...strings){
    
            
            LinkedList list = new LinkedList();


                       list.addNode(10);
                       list.addNode(20);
                       list.addNode(30);
                       list.addNode(40);
                       list.addNode(50);
                    System.out.println(list);
                    System.out.println(list.addElement());
                    System.out.println(list.maximum());
//                    System.out.println(list.search(30));
 //                   System.out.println(list.search(50));
                    System.out.println(list);
                        list.addNode(15,2);
                        list.addNode(35,5);
                        list.addNode(60,8);
//                    System.out.println(list);
                    //    list.remove();
 //                   System.out.println(list);
                        list.remove(3);
                    System.out.println(list);
                        list.remove(10);
                        list.addNode(0);
                        System.out.println(list.isSorted());
                    System.out.println(list);

    }
}

