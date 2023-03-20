import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        double gg = (double) 10 / (double) 3; // else it would have given an intiger number

        System.out.println(gg);
        int x = 1;
        int y = x++;
        System.out.println(y); // increment the value of x after assigning
         x = 1;
         y = ++x; // increment the value of x before assigning
        System.out.println(y);

    }
}
