import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();


        for (int i = 0; i<10; i++){
            list.add(rnd.nextInt(100));
        }

        System.out.println(list);

        list.remove(0);
        list.remove(0);
        list.remove(list.size()-1);


        System.out.println(list);


    }
}
