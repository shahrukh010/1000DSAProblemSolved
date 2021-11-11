


public class Main {


    public static void main(String...strings){
    
            
            LinkedList list = new LinkedList();


                       list.addNode(10);
                       list.addNode(20);
                       list.addNode(30);
                       list.addNode(40);
                       list.addNode(50);
                       list.addNode(60);
                       list.addNode(80);
                    System.out.println(list);
                    System.out.println(list.middle());

//*********************************************************************************************************
                    /*
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
                        list.reverse();
                    System.out.println(list);
                    */

//*********************************************************************************************************


/*
                    list.add(100);
                    list.add(200);
                    list.add(300);
                    list.add(400);
                    list.add(500);
                    list.add(700);

                    list.display();
                    System.out.println();
    
            System.out.println();
            System.out.println();

            list.merge(list.getFirst(),list.getSecond());
                    System.out.println(list);

*/


        CircularList clist = new CircularList();

                     clist.add(10);
                     clist.add(20);
                     clist.add(30);
                     clist.add(1,21);
                     clist.add(0,5);
                     clist.print();



    }
}

