package Difiiculty1;

import java.util.Scanner;

public class Hissing_Microphone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.contains("ss")){
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}
