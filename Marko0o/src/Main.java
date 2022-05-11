import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double a =sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
double d =a+b;
double e =a+c;
double f =b+c;
        if (d>c ||d==c){
            Double par = a+b+c;
            System.out.printf("Perimetro = %.1f\n",  par);        }
        else if (e>b ||e==b){
            Double par = a+b+c;
            System.out.printf("Perimetro = %.1f\n",  par);

        }
        else if (f>a || f==a){
            Double par = a+b+c;
            System.out.printf("Perimetro = %.1f\n",  par);
        }
        else {
            double area =((a+b/2)*c);
            System.out.printf("Area = %.1f\n",  area);
        }
    }
}
