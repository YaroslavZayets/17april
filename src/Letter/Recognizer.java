package Letter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Recognizer {
    static void buildStat(String text) {
        TreeSet<Counter> sortList = new TreeSet<Counter>(new LetterComp());
        List<Counter> list = new ArrayList<Counter>(1);
        list.add(new Counter((char)0));

        for (char l = 'a'; l<='z'; l++){
            Counter count = new Counter(l);
            for (int i = 0; i<text.length(); i++){
                if (text.charAt(i)==l){
                    count.quantity(1);
                }
            }
            count.stat(text.length());
            sortList.add(count);

        }

        sortList.removeAll(list);




        Iterator<Counter> itr = sortList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }





    }



}
