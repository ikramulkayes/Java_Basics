import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Your Age: ");  //print makes no new line
        int b = a.nextInt();
        System.out.println("You are "+b);
        System.out.print("Your name: ");
        Scanner scanner = new Scanner(System.in); // make it everytime you take input
        String x = scanner.nextLine().trim();  //this too and this is for taking a string as an input
        System.out.println("Your name: "+x);



    }
}
