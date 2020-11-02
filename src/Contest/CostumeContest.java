package Contest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CostumeContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> stringCountMap = new HashMap<>();

        int nString = scanner.nextInt();
        for (int i = 0; i < nString; i++) {
            String inputString = scanner.next();
            Integer val = stringCountMap.get(inputString);

            if (val != null){
                stringCountMap.put(inputString, val + 1);
            } else {
                stringCountMap.put(inputString,1);
            }
        }

        String minKey = null;
        int minValue = Integer.MAX_VALUE;
        for (String key : stringCountMap.keySet()){
            int value = stringCountMap.get(key);
            if (value < minValue){
                minValue = value;
                minKey = key;
            }
        }

        for (Map.Entry entry : stringCountMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }


}
