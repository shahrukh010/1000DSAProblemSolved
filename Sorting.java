
public class Sorting {




    public static void insertionSort(int[]input){

            int n = input.length;
        for(int i=1;i<n;i++){

             int j =i-1; 
            int tmp = input[i];

            while(j>-1 && input[j] >tmp){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = tmp;
        }

    }


    public static void selectionSort(int[]input){

        int n = input.length;

        for(int i=0;i<n-1;i++){

                int k = i;
            for(int j=i=k;j<n;j++){

                if(input[j] < input[k])
                    k=j;
            }
            int tmp = input[i];
            input[i] = input[k];
            input[k] = tmp;
        }
    }


    public static void bubbleSort(int[]input){

            int n = input.length;
        for(int i=0;i<n;i++){

                int k = 1;
            for(int j=0;j<n-i;j++,k++){

                if(k<n &&input[j] > input[k]){
                    int tmp = input[j];
                    input[j]=input[k];
                    input[k] = tmp;
                }
            }
        }
    }

    public static void main(String...strings){

            int[] nums = {5,1,4,3,2,9,11,10,0,-1,-5,1,5,4,3};
//            bubbleSort(nums);
 //           System.out.println(java.util.Arrays.toString(nums));
//            selectionSort(nums);
 //           System.out.println(java.util.Arrays.toString(nums));

             insertionSort(nums);
            System.out.println(java.util.Arrays.toString(nums));
    }
}
