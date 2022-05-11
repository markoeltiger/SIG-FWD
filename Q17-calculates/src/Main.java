public class Main {


    public static void main(String[] args) {
        int n = 6;
        int factorialofn = 1;
        for(int i = 1; i <= n; ++i)
        {
            factorialofn = factorialofn * i;
        }
        int k = 5;
        int factorialofk = 1;
        for(int i = 1; i <= k; ++i)
        {
            factorialofk = factorialofk * i;
        }
int sum = (n-k) ;
        int factorialofsum = 1;
        for(int i = 1; i <= k; ++i)
        {
            factorialofsum = factorialofsum * i;
        }
        System.out.println((factorialofn *factorialofk )/factorialofsum) ;
    }

}
//the equation:N!*K!/(N-K)1! --- (1<K<N)