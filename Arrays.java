
public class Arrays {

    private int[]arr;
    private static final int capacity = 10;
    private int size=0;


    public Arrays(){

        arr = new int[this.capacity];
    }

    public Arrays(int capacity){

        arr = new int[capacity];
    }

    public void leftRotate(int[]arr,int d){

        for(int i=0;i<d;i++){
            rotate(arr);
        }

    }
    private void rotate(int[]arr){

        int tmp = arr[0];
        int i =0;
        for(;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[size-1] = tmp;
    }


    public void add(int data){

           try{
            arr[size++] = data;
           }
           catch(ArrayIndexOutOfBoundsException e){
               System.out.println("Array Capacity Full");
           }
    }

    public int[] getArray(){

        return this.arr;
    }


    //array operation 

    public void moveZeroToEnd(int[]arr){

       int tmp=0;
       for(int i=0;i<arr.length;i++){

           if(arr[i] !=0){
               int t = arr[tmp];
               arr[tmp] = arr[i];
               arr[i] = t;
               tmp++;
             }
       }

    }

    public void removeDuplicateFromSorted(int[]arr){

        int tmp = 0;
        for(int i=1;i<arr.length;i++){

            if(arr[i] !=arr[tmp]){
                arr[tmp+1] = arr[i];
                tmp++;
            }
        }
    }
    public void reverse(int[]arr){

        int start = 0;
        int end = size-1;

        while(start <end){
            int tmp = arr[start];
                arr[start] = arr[end];
                arr[end]   = tmp;
                start++;
                end--;
        }
    }
   public boolean isSorted(){

       for(int i=1;i<size;i++){
           if(arr[i] < arr[i-1])return false;
       }
       return true;
       }

    public void insert(int data){

            int i = 0;
        for(;i<size;i++){

            if(data < arr[i])break;
        }

        for(int j=size;j>i;j--){
            arr[j] = arr[j-1];
        }
        arr[i] = data;
        size++;
    }
        
    public int secondLargestIndex(int[]arr){

        int result =-1;
        int large  = 0;

        for(int i=1;i<arr.length;i++){

            if(arr[i] >arr[large]){
                result = large;
                large = i;
            }
            else if(arr[i] !=arr[large]){
                if(result==-1 || arr[i] > arr[result])
                    result =i;
            }
        }
        if(result==-1)return arr[0];

        return result;
    }
    public int maxElementIndex(int[]arr){

            int result = 0;
            for(int i=1;i<arr.length;i++){
                
                if(arr[i] > arr[result])result = i;
            }
            return result;
    }

    public String toString(){

        return java.util.Arrays.toString(java.util.Arrays.copyOfRange(arr,0,size));
    }
}



