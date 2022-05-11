import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int findthehighestnumberinarray(int [] array){
        int last=(array.length)-1;
        Arrays.sort(array);
int result =array[last];
        return result;


    }
    public static int[] find(int [] mark,int[]saif,int[]dalia){


    int[] last={findthehighestnumberinarray(mark), findthehighestnumberinarray(saif),
            findthehighestnumberinarray(dalia)};
    System.out.println(Arrays.toString(last));
    return last;
    }
    public static void main(String[] args) {
int[] dont={1,2,3};
int[] give={4,5,6};
int[] up={7,8,9};
find(dont,give,up);

    }
}