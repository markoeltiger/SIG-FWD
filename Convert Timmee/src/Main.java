import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        int hours = mark.nextInt();
        int minutes = mark.nextInt();
        String Current_Time ;
        if (hours <= 12) {
             Current_Time = (hours + ":" + minutes + "AM");
            System.out.println(Current_Time);}
         else    if (hours > 12 && hours <24 ) {
                hours = hours - 12;
                Current_Time = (hours + ":" + minutes + "PM");
                System.out.println(Current_Time);
            }
           else if (hours>24){
                System.out.println("ivalid input");
            }
        }

}