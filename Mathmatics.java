
public class Mathmatics {


    
    public static int power(int x,int n){

        if(n==0)return 1;

        int tmp = power(x,n/2);
            tmp = tmp*tmp;

            if(n%2==0)return tmp;
            else
                return tmp*x;
    }
    public static void allPrime(int N){

         boolean[] res = new boolean[N];
        int index = 2;

        for(int i=2;i*i<N;i++){

            if(isPrime.test(i)){

                for(int j=i*2;j<N;j=j+i){
                    res[j] = true;//res index is j because of only we setting true to j multiplication
                }
            }
        }
        for(int i=2;i<res.length;i++){
            if(res[i]==false)System.out.print(i+" ");
        }

    }
    public static void allDivisor(int N){

            int i=1;
        for( ;i*i<N;i++){
            if(N%i==0)
                System.out.print(i+" ");
        }

        for(int j=i;j>=1;j--){
            if(N%j==0)System.out.print(N/j+" ");
        }
        System.out.println();
    }
    public static void factorPrime(int N){

        for(int i=2;i*i<=N;i++){

                while(N%i==0){
                    System.out.println(i);
                    N=N/i;
                }
        }
        if(N>1)System.out.println(N);
    }
                
    static java.util.function.Predicate<Integer> isPrime=(N)->{

/*
            for(int i=2;i<N;i++){

                if(N%i==0)return false;
            }
            return true;
*/            

            //optimize solution;
            for(int i=2;i*i<=N;i++){

                if(N%i==0)return false;
                }
                return true;
        };
    static java.util.function.BiFunction<Integer,Integer,Integer>lcm =(a,b)->{

            int max = Math.max(a,b);

            while(true){

                if(max%a==0 && max%b==0)return max;
                max++;
            }
    };
    static java.util.function.BiFunction<Integer,Integer,Integer>gcd = (a,b)->{

/*
              int result = 0;
            for(int i=1;i<=a;i++){
                
                if(a%i==0 && b%i==0){
                    result = i;}
            }
            return result;
            */

            //optimize solution

            int min = Math.min(a,b);
            while(a!=b){
                if(a>b)a = a-b;
                else
                    b=b-a;
            }
            return a;
    };
    static int factorial(int n){

            if(n==0)return 1;
        int factorial = factorial(n-1)*n;
        return factorial;
    }
    static java.util.function.Function<Integer,Integer> factorial=(N)->{

            int factorial = 1;
        for(int i=N;i>0;i--){
            factorial = factorial * i;
        }
        return factorial;
    };
    static int countDigit(int N){

        int count = 0;
        while(N !=0){
            count++;
            N = N/10;
        }
        return count;
    }

    static java.util.function.Predicate<Integer> isPalindrome=(N)->{

                int t = N;
                int result = 0;
                while(t !=0){

                    result = result *10+t%10;
                    t = t/10;
                }
                return result==N?true:false;

    };

    public static void primeFactor(int n){

        for(int i=2;i<=n;i++){
            if(isPrime.test(i)){
                int x = i;
                while(n%x==0){
                    System.out.println(i);
                    x = x*i;
                }
            }
        }
    }

    public static void main(String...strings){

/*
        System.out.println(countDigit(2446));
        System.out.println(isPalindrome.test(121));
        System.out.println(isPalindrome.test(367));
        System.out.println(isPalindrome.test(78987));
        System.out.println(factorial(7));
        System.out.println(factorial.apply(7));
        System.out.println(factorial.apply(5));
        System.out.println(gcd.apply(2,4));
        System.out.println(gcd.apply(12,15));
        System.out.println(gcd.apply(100,200));
        System.out.println(gcd.apply(7,13));
        System.out.println(lcm.apply(4,6));
        System.out.println(lcm.apply(12,15));
        System.out.println(lcm.apply(2,8));
        System.out.println(isPrime.test(13));
        System.out.println(isPrime.test(101));
        System.out.println(isPrime.test(14));
        System.out.println(isPrime.test(127));
        System.out.println(isPrime.test(132));
*/
System.out.println("*************************************");
               primeFactor(12);
System.out.println("13--");
               primeFactor(13);
System.out.println();
               primeFactor(315);
System.out.println();
               primeFactor(450);
System.out.println();
                factorPrime(13);
System.out.println();
               primeFactor(450);
System.out.println();
               allDivisor(15);
                
System.out.println();
               allDivisor(100);
               allDivisor(7);
System.out.println();
               allPrime(10);
System.out.println();
        
               allPrime(20);
System.out.println();
               System.out.println(power(15,3));
    }
}

