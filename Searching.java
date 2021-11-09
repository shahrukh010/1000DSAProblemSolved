
public class Searching {


    
    static java.util.function.BiPredicate<int[],Integer> binarySearch = (input,x)->{

                
                int start = 0;
                int end  = input.length-1;

                while(start<=end){

                    int mid = ((start+end)/2);

                    if(input[mid] == x)return true;

                    else if(input[mid] > x){
                        end = mid-1;
                    }
                    else if(input[mid] < x){
                        start = mid+1;
                    }
                }
                return false;
    };

    public static void main(String...strings){
                
                int[] arr = {-50,-40,10,20,30,40,50,100};
                
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
    }
}
