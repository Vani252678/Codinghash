package Programming;

import java.sql.SQLOutput;

public class Casting {
    public static void main(String[] args) {
        //Casting means converting from one type tp another type
        double price = 100.00;
        double gst = price + 18.00;
        System.out.println(gst);


//explicit casting

        int p = 100;
        int withgst = p + (int) +18.00;
        System.out.println(withgst);
    }
}
