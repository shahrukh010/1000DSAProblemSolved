
public class Searching {



    public static boolean search(int[]input, int key){

       int start = 1;
       if(input[0] == key)return true;

        while(input[start] < key){

            start = start * 2;
        }
        boolean flag = binarySearch(input,key,(start/2)+1,start);
        if(flag)return true;
        else
            return false;
    }

    public static boolean binarySearch(int[]input,int key,int start,int end){

        if(start<=end){

            int mid = ((start+end)/2);

            if(input[mid] == key)return true;

            else if(input[mid] > key)return binarySearch(input,key,start,mid-1);

            else if(input[mid] < key)return binarySearch(input,key,mid+1,end);
                
        }
        return false;
    }


    static java.util.function.Function<int[],Integer> countOne = (input)->{

            int start = 0;
            int end = input.length-1;
            while(start<=end){

                int mid = (start+end)/2;

                if(input[mid] ==0){
                    start = mid+1;
                }
                 if(mid==0 || input[mid-1] !=1){
                    return input.length - mid;
                 }
                else
                    return end = mid-1;
            }
            return 0;
    };


    static java.util.function.BiFunction<int[],Integer,Integer>lastIndexOf =(input,data)->{

                    int start = 0;
                    int end =input.length-1;
                    int n = input.length;

                    while(start<=end){

                        int mid = ((start+end)/2);
                        
                        if(input[mid] > data){
                            end = mid-1;
                        }
                        else if(input[mid] < data){
                            start = mid+1;
                        }
                        else{
                            if(mid !=n-1 || input[mid] !=input[mid+1])
                                return mid;
                             else
                                 start = mid+1;
                        }
                    }
                    return -1;
    };
    static java.util.function.BiFunction<int[],Integer,Integer>indexOf = (input,data)->{

                    int start = 0;
                    int end =input.length-1;

                    while(start<=end){

                        int mid = ((start+end)/2);

                        if(input[mid]==data){
                            if(mid==0|| input[mid-1] !=data)return mid;
                            else
                                end = mid-1;
                                //return;
                        }

                         if(input[mid] > data){
                             end = mid-1;
                         }
                         else if(input[mid]<data){
                             start = mid+1;
                         }
                    }
                    return -1;
    };
    static java.util.function.BiPredicate<int[],Integer> binarySearch = (input,x)->{

                
                int start = 0;
                int end  = input.length-1;

                while(start<=end){

                    int mid = ((start+end)/2);

                    if(input[mid] == x)return true;

                    else if(input[mid] > x){
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
                return false;
    };

    public static void main(String...strings){
                
                int[] arr = {10,10,10,20,30,40,50,50,50,50,100,100,100,500,700,900,1200};
                
                //System.out.println(binarySearch.test(arr,20));
                System.out.println(binarySearch.test(arr,70));
                System.out.println(binarySearch.test(arr,50));
                System.out.println(binarySearch.test(arr,10));
                System.out.println(binarySearch.test(arr,0));
                System.out.println(binarySearch.test(arr,20));
                System.out.println(binarySearch.test(arr,40));

                System.out.println(binarySearch.test(arr,100));
                System.out.println(binarySearch.test(arr,-100));
                System.out.println(binarySearch.test(arr,-50));
                System.out.println(binarySearch.test(arr,-40));
                System.out.println(binarySearch.test(arr,5000));
                System.out.println(indexOf.apply(arr,10));
                System.out.println(indexOf.apply(arr,50));
                System.out.println(indexOf.apply(arr,-50));
                System.out.println(lastIndexOf.apply(arr,10));
                System.out.println(lastIndexOf.apply(arr,40));
                System.out.println(lastIndexOf.apply(arr,100));

                int[] input = {0,0,1,1,1};
                System.out.println(countOne.apply(input));
                System.out.println(search(arr,-50));
                System.out.println(search(arr,500));
                System.out.println(search(arr,1200));
                

    }
}
