package Students;

import java.util.Comparator;

public class Student extends Man {

    private double rating;

    public Student(String name, String surname, int age ,double rating){
        super(name,surname,age);
        this.rating=rating;
    }


    public String getSurname(){
        return super.getSurname();
    }

    @Override
    public String toString(){
        return super.toString() + " " + rating;
    }
}