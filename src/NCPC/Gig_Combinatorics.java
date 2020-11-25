package NCPC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Gig_Combinatorics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nInputs = scanner.nextInt();
        int sum = 0;
        ArrayList<Integer> fullList = new ArrayList<>();
        for (int i = 0; i < nInputs; i++) {
            fullList.add(scanner.nextInt());
        }
        int length = fullList.size();
        int ettaller = Collections.frequency(fullList,1);
        for (int i = 0; i < ettaller; i++) {
            int indexof1 = fullList.indexOf(1);
            if (indexof1 == -1) {break;}
            ArrayList<Integer> subList1 = new ArrayList<>();
            List<Integer> tempList1 = fullList.subList(indexof1,fullList.size());
            subList1.addAll(tempList1);
            int tretaller = Collections.frequency(subList1,3);
            for (int j = 0; j < tretaller; j++) {
                int lastIndex = subList1.lastIndexOf(3);
                if (lastIndex == -1) {break;}
                List<Integer> tempList2 = subList1.subList(0,lastIndex+1);
                ArrayList<Integer> subList2 = new ArrayList<>();
                subList2.addAll(tempList2);
                int totaller = Collections.frequency(subList2,2);
                sum += (Math.pow(2,totaller)-1) % (Math.pow(10,9)+7);
                subList1.remove(lastIndex);
            }
            fullList.remove(subList1.indexOf(1));
            if (fullList.get(0) != 1){
                fullList.remove(0);
            }
        }
        System.out.println(sum);
    }
}
