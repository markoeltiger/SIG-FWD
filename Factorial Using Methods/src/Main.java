import java.util.Scanner;

//الحمدلله طريقة اخري لحل الفاكتوريال يوزينج ميثودز
public class Main {
    static int factorial(int x){
      int fact =1;
        for ( int z=x; x>0 ;x--){
            fact=fact*x;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner mark =new Scanner(System.in);
        int n =mark.nextInt();
        int k=mark.nextInt();
        if(n>k&&k>1){
            int fact =1;
            for ( int z=x; x>0 ;x--){
                fact=fact*x;
            }
            System.out.println(factorial(n)*factorial(k));/factorial(n-k));
        }
    }
}
