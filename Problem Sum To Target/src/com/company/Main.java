package com.company;

public class Main {

    public static void main(String[] args) {
ListNode da=new ListNode(342);
int lengths =da.val;
        int length = String.valueOf(lengths).length();
        System.out.println(length);
ListNode das=new ListNode(465);
        addTwoNumbers(da,das);

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sa;
        int lengths =l1.val;
        int length = String.valueOf(lengths).length();
        int lengthse =l2.val;
        int lengthds = String.valueOf(lengthse).length();
        int sol =lengths +lengthse;
        for (int i =0 ; i<length ; i++){
            for (int x = 0 ; x <lengthds;x++){
                if (i==x){

                    System.out.println(lengths+lengthse);
                }

            }


        }
   return    sa = new ListNode(555);
    }

}
