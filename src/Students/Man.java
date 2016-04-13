package Students;

import java.io.Serializable;

public class Man implements Serializable{
    private String name;
    private String surname;
    private int age;
    private static final long serialVersionUID = 1L;

    public Man (String name, String surname, int age){
        this.name=name;
        this.surname = surname;
        this.age = age;
    }


    public String getSurname() {
        return surname;
    }

    public String toString(){
        return  name + " " + surname + " " + age;
    }
}