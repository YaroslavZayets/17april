package Students;


import java.util.Comparator;

public class StudentsComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareToIgnoreCase(o2.getSurname());
    }
}
