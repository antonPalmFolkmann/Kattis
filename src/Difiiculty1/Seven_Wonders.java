package Difiiculty1;

import java.util.Scanner;

public class Seven_Wonders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int numT = 0;
        int numC = 0;
        int numG = 0;
        while (word.length()>0){
            String firstLetter = word.substring(0,1);
            String newWord = word.substring(1);
            switch (firstLetter){
                case "T":
                    numT++; break;
                case "C":
                    numC++; break;
                case "G":
                    numG++; break;
            }
            word = newWord;
        }
        int minNum = Math.min(numC,Math.min(numT,numG));
        int sum = (int) (Math.pow(numC,2) + Math.pow(numG,2) + Math.pow(numT,2) + 7*minNum);
        System.out.println(sum);

    }
}
