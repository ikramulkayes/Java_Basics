import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            System.out.println("yo");
        }
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
        }
    }
}
