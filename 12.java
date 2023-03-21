import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String role = "player";
        switch (role){
            case "model":
                System.out.println("You are a model");
                break;

            case "player":
                System.out.println("You are a player");
                break;
            default:
                System.out.println("Pass");
        }

    }
}
