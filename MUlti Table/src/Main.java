import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];


        static int largest()
        {
            int i;

            // Initialize maximum element
            int max = arr[0];


            for (i = 1; i < arr.length; i++)
                if (arr[i] > max)
                    max = arr[i];

            return max;
        }

    }
