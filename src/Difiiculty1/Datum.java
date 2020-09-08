package Difiiculty1;

import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int last2Dig = 9;
        int weekDay = last2Dig/4;
        weekDay = weekDay + scanner.nextInt();
        int M = scanner.nextInt();
        if (M == 4 || M == 7){
            weekDay = weekDay;
        } else if (M == 1 || M == 10){
            weekDay = weekDay + 1;
        } else if (M == 5){
            weekDay = weekDay + 2;
        } else if (M == 8){
            weekDay = weekDay + 3;
        } else if (M == 2 || M == 3 || M == 11){
            weekDay = weekDay + 4;
        } else if (M == 6){
            weekDay = weekDay + 5;
        } else if (M == 9 || M == 12){
            weekDay = weekDay + 6;
        } else {
            System.out.println("Something went wrong.");
        }

        int centCode = 6;
        weekDay = weekDay + centCode;
        weekDay = weekDay + last2Dig;

        switch (weekDay % 7) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }

    }

}
