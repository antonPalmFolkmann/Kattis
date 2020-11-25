package Difiiculty1;

import java.util.Scanner;

public class Is_It_Halloween_com {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        int date = scanner.nextInt();
        if (month.equals("OCT") && date == 31){
            System.out.println("yup");
        } else if (month.equals("DEC") && date == 25){
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
    }
}
