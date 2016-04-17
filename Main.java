package OOP10;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,1,7,2,1};

        Map<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i<arr.length; i++){
            Integer number = arr[i];

            if (hm.containsKey(number)){
                Integer count = hm.get(number)+1;
                hm.put(number,count);
            } else hm.put(number,0);
        }

        Set<Map.Entry<Integer,Integer>> hms = hm.entrySet();
        for (Map.Entry<Integer,Integer> hmse : hms){
            System.out.println("Число " + hmse.getKey() + " повторяеться " + hmse.getValue() + " раз");
        }

    }


}
