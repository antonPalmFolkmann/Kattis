package Difiiculty1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kornislav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            aList.add(scanner.nextInt());
        }
        Collections.sort(aList);
        int width = aList.get(0);
        int length = aList.get(2);

        System.out.println(width*length);

    }
}
