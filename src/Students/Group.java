package Students;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class Group {
    List<Student> listOfGroup = new ArrayList<>();

    public void addStud (Student st){
        listOfGroup.add(st);
    }

    public void showGroup(){
        Iterator<Student> itr = listOfGroup.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void searchStudent()  {
        String surname;
        surname = String.valueOf(JOptionPane.showInputDialog("Введите фамилию"));
        boolean isFound = false;
        int i = 0;
        Iterator<Student> itr = listOfGroup.iterator();
        while (itr.hasNext()){
            if (listOfGroup.get(i).getSurname().equals(surname)){
                isFound = true;
                JOptionPane.showMessageDialog(null, listOfGroup.get(i).toString());
                break;
            }
            i++;

        }

        if (!isFound) JOptionPane.showMessageDialog(null, " Не найдено такого студента ");
    }


    public void sortBySurname(){
        TreeSet<Student> ts = new TreeSet<>(new StudentsComporator());

        for (int i = 0; i<listOfGroup.size(); i++){
            ts.add(listOfGroup.get(i));
        }

        Iterator<Student> iterator = ts.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public void saveDoc (){
        Iterator<Student> itr = listOfGroup.iterator();
        try (PrintWriter f = new PrintWriter("c.txt"))
        {
            while (itr.hasNext()){
                f.println(itr.next());
            }

            System.out.println(" Студенты записаны ");
        } catch (IOException e){
            System.out.println("Error");
        }
    }

    public void readDoc(){
        try (BufferedReader f  = new BufferedReader(new FileReader("newStud.txt")))
        {
            String str = "";
            String[] arr = new String[3];
            for (;(str = f.readLine())!=null;){
                arr = str.split(" ");
                int age = Integer.parseInt(arr[2]);
                double rating = Double.parseDouble(arr[3]);
                Student st = new Student(arr[0],arr[1],age,rating);
                listOfGroup.add(st);
            }
            System.out.println(" Студенты считаны ");

        } catch (IOException e){
            System.out.println("Error");
        }

    }

}
