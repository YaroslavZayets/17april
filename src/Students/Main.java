package Students;

public class Main {
    public static void main(String[] args) {
        Group gr = new Group();
        gr.addStud(new Student("Ярослав","Заец",23,96));
        gr.addStud(new Student("Богдан","Яремчук",20,86));
        gr.addStud(new Student("Сергей","Панчук",21,76));

        gr.searchStudent();

        gr.readDoc();
        gr.showGroup();
        System.out.println("========");
        gr.sortBySurname();

        gr.saveDoc();





    }

}
