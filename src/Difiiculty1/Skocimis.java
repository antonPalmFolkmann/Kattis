package Difiiculty1;

import java.util.Scanner;

public class Skocimis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++){
            array[i] = scanner.nextInt();
        }
        int moves = 0;
        while ((array[1]-array[0] + array[2]-array[1]) > 2){
            int[] tempArray = new int[3];
            if ((array[1]-array[0])>(array[2]-array[1])){
                tempArray[0] = array[0];
                tempArray[1] = array[0] + 1;
                tempArray[2] = array[1];
            } else {
                tempArray[0] = array[1];
                tempArray[1] = array[2] - 1;
                tempArray[2] = array[2];
            }
            array = tempArray;
            moves++;
        }
        System.out.println(moves);
    }
}
