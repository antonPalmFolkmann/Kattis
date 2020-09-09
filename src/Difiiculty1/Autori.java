package Difiiculty1;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String abb = "";
        String[] names = input.split("-");
        for (String name : names){
            String first = name.substring(0,1);
            abb = abb + first;
        }
        System.out.println(abb);
    }
}
