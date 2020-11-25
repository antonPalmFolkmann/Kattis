package NCPC;

import java.util.Scanner;

public class Array_of_Discord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nNumbers = scanner.nextInt();
        int[] lengthArray = new int[nNumbers];
        String[] intArray = new String[nNumbers];
        for (int i = 0; i < nNumbers; i++) {
            String nextNum = scanner.next();
            intArray[i] = nextNum;
            lengthArray[i] = nextNum.length();
        }
        int sameLengthCount = 0;
        int sameLengthIndex = 0;
        for (int i = 0; i < nNumbers-1; i++) {
            if (lengthArray[i] == lengthArray[i+1]){
                sameLengthCount++;
                sameLengthIndex = i;
                break;
            }
        }
        if (sameLengthCount == 0){
            System.out.println("impossible");
        } else {
            String finalString = "";
            for (int i = 0; i < lengthArray[sameLengthIndex]-1; i++) {
                String startString = intArray[sameLengthIndex+1].substring(i,i+1);
                String endString = intArray[sameLengthIndex+1].substring(i+1);
                if (!startString.equals("1")){
                    startString = "1";
                    finalString += startString + endString;
                    intArray[sameLengthIndex+1] = finalString;
                    break;
                }
                finalString += startString;
                startString = endString;
                intArray[sameLengthIndex+1] = finalString;
            }

            for (String s : intArray) {
                System.out.println(s + " ");
            }

        }

    }
}
