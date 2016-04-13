package Letter;

public class Counter {
    private char letter;
    private int quantity;
    private double stat;

    public Counter (char letter){
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void quantity(int quantity){
       this.quantity+=quantity;
    }

    public int getQuantity() {
        return quantity;
    }


    public void stat(double total){
        stat = quantity/total;
    }

    public double getStat() {
        return stat;
    }

    @Override
    public String toString() {
        return String.format("Буква  - " + letter + " -  повторяется в тексте  с частотой " + stat);
    }




}
