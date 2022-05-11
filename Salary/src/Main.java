import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner marko =new Scanner(System.in);
        int num =marko.nextInt();
        int hours =marko.nextInt();
        float salarPerhour=marko.nextFloat();
        System.out.printf("NUMBER = %d\n",num);
        float Salary =(hours*salarPerhour);
        System.out.printf("SALARY = U$ %.2f\n",Salary);


    }
}
