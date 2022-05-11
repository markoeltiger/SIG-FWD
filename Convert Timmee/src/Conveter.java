public class Conveter {
    public int hours;
    public int minutes;
    public boolean bool;

    public Conveter(int h, int m) {
        this.hours = h;
        this.minutes = m;

    }

    public String Convert(int h, int m) {
        if (h <= 12) {
          String Current_Time =(h + ":" + m + "AM");
            if (h > 12) {
                h =h-12;
                Current_Time =     (h+":"+m+"PM" );


}

            return Current_Time;    }


      return null ;   }


}