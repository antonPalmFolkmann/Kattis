package Contest;

import java.util.Scanner;

public class Babylonian_Numbers {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int h = 0; h < num; h++) {

            String word = scanner.next();
            word = word.replaceAll(",",", ");
            String[] words;
            if (word.contains(",")) {
                words = word.split(",");
            } else {
                words = new String[1];
                words[0] = word;
            }

            int[] array = new int[words.length];
            int i = 0;
            for (String n : words) {
                if (n.equals(" ")) {
                    array[i] = 0;
                } else {
                    array[i] = Integer.parseInt(n.trim());
                }
                i++;
            }

            long SSD = 0;
            int aLen = array.length;
            for (int j = 0; j < aLen; j++) {

                SSD += array[j] * Math.pow(60, aLen - 1 - j);
            }
            System.out.println(SSD);


        }

    }

}
