import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Your capital: ");  //print makes no new line
        double capital = a.nextDouble();
        System.out.println();

        Scanner b = new Scanner(System.in);
        System.out.print("Your interest: ");  //print makes no new line
        double r = b.nextDouble();
        System.out.println();

        Scanner c = new Scanner(System.in);
        System.out.print("Duration: ");  //print makes no new line
        double n = c.nextDouble();
        System.out.println();


        double res = capital*r*Math.pow((1+r),n)/(Math.pow((1+r),n)-1);
        System.out.println(res);



    }
}
