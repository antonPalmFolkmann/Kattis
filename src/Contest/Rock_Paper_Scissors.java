package Contest;

import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++){
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            int n = scanner.nextInt();
            String[][] stringArray = new String[r][c];
            for (int j = 0; j < r; j++) {
                String row = scanner.next();
                for (int k = 0; k < c; k++) {
                    String firstLetter = row.substring(0,1);
                    String restWord = row.substring(1);
                    stringArray[j][k] = firstLetter;
                    row = restWord;
                }
                                
            }
        }
    }


}
