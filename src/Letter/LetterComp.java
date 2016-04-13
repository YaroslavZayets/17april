package Letter;


import java.util.Comparator;

public class LetterComp implements Comparator<Counter> {
    @Override
    public int compare(Counter o1, Counter o2)
    {
        if (o1.getStat()>o2.getStat()){return -1;}
        else if (o1.getStat()<o2.getStat()){return 1;}
        else return 0;
    }
}
