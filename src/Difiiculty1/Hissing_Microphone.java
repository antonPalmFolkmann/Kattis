package Difiiculty1;

import java.util.Scanner;

public class Hissing_Microphone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int hiss = 0;
        int length = input.length()-1;
        for (int i = 0; i < length; i++) {
            String first = input.substring(0,1);
            String second = input.substring(1,2);
            if (first.equals(second)){
                hiss++;
            }
            input = input.substring(1);
        }
        if (hiss > 0){
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}
