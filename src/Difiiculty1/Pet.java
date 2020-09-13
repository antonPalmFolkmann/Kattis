package Difiiculty1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>(5);
        for (int i = 0; i < 5; i++){
            int count = 0;
            for (int j = 0; j < 4; j++){
                count += scanner.nextInt();
            }
            array.add(count);
        }
        int maxValue = Collections.max(array);
        int index = array.indexOf(maxValue) + 1;
        System.out.println(index + " " + maxValue);
    }
}
